package com.dkuchma.blog.db.repository;

import com.dkuchma.blog.db.entity.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogUserRepository extends JpaRepository<BlogUser, Long> {

}
