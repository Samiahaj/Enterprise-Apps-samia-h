package be.enterpriseapps.ngoapp.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import be.enterpriseapps.ngoapp.service.EventService;
import be.enterpriseapps.ngoapp.model.Event;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final EventService eventService;

    public HomeController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("events", eventService.getEvents());

        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/new")
    public String newEvent() {
        return "new";
    }
    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {

        Event event = eventService.getEventById(id);

        model.addAttribute("event", event);

        return "details";
    }
}