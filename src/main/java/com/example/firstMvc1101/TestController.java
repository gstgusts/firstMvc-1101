package com.example.firstMvc1101;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("title", "Title from backend");

        List<String> items = new ArrayList<>(Arrays.asList("Gusts","Aleksis","Dana"));

        model.addAttribute("items", items);
        return "test";
    }
}
