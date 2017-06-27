package org.spoonner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by spoonner on 6/27/17.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String index() {
        return "Hello world";
    }

    @RequestMapping(value = "")
    @ResponseBody
    public String helloFromQueryString(HttpServletRequest request) {
        return "Hello " + request.getParameter("name");
    }

    @RequestMapping(value = "/greet/{person}")
    @ResponseBody
    public String helloPersonURL(@PathVariable  String person) {
        return "Hello " + person;
    }

    @RequestMapping(value = "/redirectMe")
    public String redirectToHello() {
        return "redirect:/hello";
    }
}
