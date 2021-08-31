package com.dkuchma.blog.db.dto;


import lombok.Data;

@Data
public class BlogUserDTO {
    private Long id;

    private String login;

    private String password;

    private String email;

    private String userName;
}
