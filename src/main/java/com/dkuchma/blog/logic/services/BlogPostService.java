package com.dkuchma.blog.logic.services;

import com.dkuchma.blog.db.dto.BlogPostDTO;
import com.dkuchma.blog.db.entity.BlogPost;
import com.dkuchma.blog.db.repository.BlogPostRepository;
import com.dkuchma.blog.logic.exceptions.BlogPostNotFindException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogPostService {
    private final BlogPostRepository blogPostRepository;
    private final ModelMapper mapper;


    public List<BlogPost> getAllPosts(){
        return blogPostRepository.findAll();
    }

    public BlogPost getPostById(Long id){
       return blogPostRepository.findBlogPostById(id).orElseThrow(() -> new BlogPostNotFindException(id.toString()));
    }

    public Long createPost(BlogPostDTO blogPostDTO){
       return blogPostRepository.save(mapper.map(blogPostDTO, BlogPost.class)).getId();
    }
}
