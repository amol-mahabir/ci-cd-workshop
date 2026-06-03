package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peach")
public class PeachController {

    @GetMapping
    public String peach() {
        return "I'm Princess Peach!";
    }

    @PostMapping
    public String postPeach() {
        return "I'm posting peaches!";
    }

}
