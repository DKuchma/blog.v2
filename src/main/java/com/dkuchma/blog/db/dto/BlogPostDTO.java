package com.dkuchma.blog.db.dto;

import lombok.Data;

@Data
public class BlogPostDTO {

    private Long id;

    private String title;

    private String body;

    private Long creatorId;

}
