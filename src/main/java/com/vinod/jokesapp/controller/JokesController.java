package com.vinod.jokesapp.controller;

import com.vinod.jokesapp.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        String joke = jokesService.getRandomQuotes();
        System.out.println("Joke : "+joke);
        model.addAttribute("joke",joke);
        return "joke";
    }
}
