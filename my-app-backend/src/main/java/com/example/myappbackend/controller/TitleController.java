package com.example.myappbackend.controller;

import com.example.myappbackend.model.Title;
import com.example.myappbackend.service.TitleService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/title")
@RequiredArgsConstructor
public class TitleController {
    private final TitleService titleService;

    @GetMapping("/list")
    @ResponseBody
    public List<Title> titleall(Model model) {
        List<Title> titleList = titleService.getTitle();
        return titleList;
    }

    @PostMapping("/add")
    public void addTitle(@RequestBody Title title) {
        System.out.println(title);
        titleService.addTitle(title);
    }

    @PostMapping("/edit")
    public void editTitle(@RequestBody Title title) {
        titleService.editTitle(title);
    }

    @PostMapping("/delete")
    public void deleteTitle(@RequestParam(name = "id") Long id) {
        System.out.println(id);
        titleService.deleteTitle(id);
    }
}
