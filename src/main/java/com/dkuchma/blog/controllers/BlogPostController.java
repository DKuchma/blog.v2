package com.dkuchma.blog.controllers;

import com.dkuchma.blog.db.dto.BlogPostDTO;
import com.dkuchma.blog.logic.services.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class BlogPostController {
    private final BlogPostService blogPostService;

    @GetMapping("/post/{postId}")
    public String getPost(@PathVariable Long postId, Model model){
        model.addAttribute("post", blogPostService.getPostById(postId));
        return "blogPost";
    }

    @GetMapping("/create")
    public String newPost(Model model){
        model.addAttribute("post", new BlogPostDTO());
        return "createPage";
    }

    @PostMapping("/create")
    public String createPost(@ModelAttribute("post") BlogPostDTO blogPostDTO, Principal principal){
        Long postId = blogPostService.createPost(blogPostDTO);
        return "redirect:/post/" + postId;
    }
}
