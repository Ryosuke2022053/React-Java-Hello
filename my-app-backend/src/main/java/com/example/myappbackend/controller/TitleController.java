package com.example.myappbackend.controller;

import com.example.myappbackend.model.Title;
import com.example.myappbackend.service.TitleService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
@RequiredArgsConstructor
public class TitleController {
    private final TitleService titleService;

    @GetMapping("/title")
    @ResponseBody
    public List<Title> titleall(Model model) {
        List<Title> titleList = titleService.getTitle();
        return titleList;
    }
}
