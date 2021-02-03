package com.matyushenko.flowershop.controllers;

import com.matyushenko.flowershop.model.Flower;
import com.matyushenko.flowershop.services.FlowerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MyController {

    private final FlowerService flowerService;

    @RequestMapping("/flowers")
    public String getAllFlowers(Model model) {
        List<Flower> flowers = flowerService.getAllFlowers();
        model.addAttribute("allFlowers", flowers);
        return "flowers";
    }
}
