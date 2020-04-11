package com.evleeena.jokesapp.controllers;

import com.evleeena.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class JokesController {
    @Resource
    private JokeService jokeService;

    @RequestMapping("/")
    public String viewJoke(Model model) {
        model.addAttribute("joke", jokeService.showJoke());
        return "joke/chucknorris";
    }
}
