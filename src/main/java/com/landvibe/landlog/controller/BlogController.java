package com.landvibe.landlog.controller;

import com.landvibe.landlog.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
    private final MemberService memberService;

    public BlogController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = "/blogs")
    public String list(@RequestParam Long id, @RequestParam String name, @RequestParam String email, Model model) {
        return "blogs/blogList";
    }

}
