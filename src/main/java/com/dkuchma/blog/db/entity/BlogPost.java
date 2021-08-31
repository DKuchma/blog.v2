package com.dkuchma.blog.db.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "blog_post")
@Entity
@NoArgsConstructor
@Data
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @JoinColumn(name ="creator_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private BlogUser creator;

    @CreationTimestamp
    private LocalDateTime createDateTime;
}
