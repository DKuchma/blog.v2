package com.dkuchma.blog.logic.exceptions;

public class BlogPostNotFindException extends RuntimeException{

    public BlogPostNotFindException(String message) {
        super("Post not find: Id " + message);
    }

    public BlogPostNotFindException() {
    }
}
