package pl.skill.homebudget.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.skill.homebudget.controller.HomeController;

@Controller
public class HomeControllerImpl implements HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeControllerImpl.class);

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }
}
