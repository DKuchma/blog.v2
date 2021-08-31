package com.dkuchma.blog.controllers;

import com.dkuchma.blog.db.dto.BlogPostDTO;
import com.dkuchma.blog.logic.services.BlogPostService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final BlogPostService blogPostService;
    private final ModelMapper mapper;


    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("allPosts", blogPostService.getAllPosts().stream()
        .map( blogPost -> mapper.map(blogPost, BlogPostDTO.class))
        .collect(Collectors.toList()));
        return "home";
    }


}
