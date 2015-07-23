package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Sopot;
import org.springframework.samples.petclinic.service.SopotService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Map;

/**
 * Created by wojciech on 23.07.15.
 */
@Controller
@SessionAttributes(types = Sopot.class)
public class SopotController {
    private final SopotService sopotService;


    @Autowired
    public SopotController(SopotService sopotService) {
        this.sopotService = sopotService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping(value = "/sopot/find", method = RequestMethod.GET)
    public String initFindForm(Map<String, Object> model) {
        model.put("sopot", new Sopot());
        return "sopot/findSopot";
    }


    @RequestMapping(value = "/sopot", method = RequestMethod.GET)
    public String processFindForm(Sopot sopot, BindingResult result, Map<String, Object> model) {

        // allow parameterless GET request for /owners to return all records
        if (sopot.getNazwa() == null) {
            sopot.setNazwa(""); // empty string signifies broadest possible search
        }

        // find owners by last name
        Collection<Sopot> results = this.sopotService.znajdzWszystkiePomysly();
        if (results.isEmpty()) {
            // no owners found
            result.rejectValue("lastName", "notFound", "not found");
            return "owners/findOwners";
        }
        else if (results.size() == 1) {
            // 1 owner found
            sopot = results.iterator().next();
            return "redirect:/owners/" + sopot.getId();
        }
        else {
            // multiple owners found
            model.put("selections", results);
            return "sopot/sopotList";
        }
    }

    @RequestMapping("/sopot/{sopotId}")
    public ModelAndView showSopot(@PathVariable("sopotId") int sopotId) {
        ModelAndView mav = new ModelAndView("sopot/sopotDetails");
        mav.addObject(this.sopotService.findSopotById(sopotId));
        return mav;
    }

}
