package com.matyushenko.flowershop.controllers;

import com.matyushenko.flowershop.model.Flower;
import com.matyushenko.flowershop.services.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private FlowerService flowerService;

    @GetMapping("/flowers")
    public String getAllFlowers(Model model) {
        List<Flower> flowers = flowerService.getAllFlowers();
        model.addAttribute("allFlowers", flowers);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("flowers");
//        modelAndView.addObject("allFlowers", flowers);
        return "flowers";
    }
}
