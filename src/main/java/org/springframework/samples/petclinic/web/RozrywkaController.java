package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Rozrywka;
import org.springframework.samples.petclinic.service.RozrywkaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Collection;
import java.util.Map;

/**
 * Created by emanuel on 26.07.15.
 */
@Controller
@SessionAttributes(types = Rozrywka.class)
public class RozrywkaController {
    private final RozrywkaService rozrywkaService;


    @Autowired
    public RozrywkaController(RozrywkaService rozrywkaService) {
        this.rozrywkaService = rozrywkaService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping(value = "/sopot/rozrywka", method = RequestMethod.GET)
    public String showRozrywka(Map<String, Object> model) {
        Collection<Rozrywka> results = this.rozrywkaService.znajdzWszystkieRozrywki();
        model.put("selections", results);
        return "sopot/rozrywka";
    }

}
