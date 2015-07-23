package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Event;
import org.springframework.samples.petclinic.model.Sopot;
import org.springframework.samples.petclinic.service.EventService;
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
@SessionAttributes(types = Event.class)
public class EventController {
    private final EventService eventService;


    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping(value = "/sopot/eventy", method = RequestMethod.GET)
    public String showEvent(Map<String, Object> model) {
        Collection<Event> results = this.eventService.znajdzWszystkieEventy();
        model.put("selections", results);
        return "sopot/eventy";
    }


}
