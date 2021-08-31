package com.dkuchma.blog.db.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "blog_user")
@Entity
@Data
@NoArgsConstructor
public class BlogUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "user_name")
    private String userName;

    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY,
    cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private List<BlogPost> blogPosts;
}
