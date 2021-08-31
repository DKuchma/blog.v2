package com.dkuchma.blog.db.repository;

import com.dkuchma.blog.db.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

    public Optional<BlogPost> findBlogPostById(Long id);
}
