package com.example.myappbackend.controller;

import com.example.myappbackend.model.BirthStone;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
public class HelloController {
    @GetMapping("/demo")
    @ResponseBody
    public BirthStone getBirthStone() {
        BirthStone birthStone = new BirthStone();
        birthStone.setMonth("2月");
        birthStone.setName("アメジスト");
        birthStone.setColor("紫");
        return birthStone;
    }
}
