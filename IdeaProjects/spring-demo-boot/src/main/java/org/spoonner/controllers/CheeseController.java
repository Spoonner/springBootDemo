package org.spoonner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by spoonner on 6/27/17.
 */
@Controller
@RequestMapping(value = "/cheese")
public class CheeseController {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "MAIN TITLE");
        return "cheese/index";
    }

}
