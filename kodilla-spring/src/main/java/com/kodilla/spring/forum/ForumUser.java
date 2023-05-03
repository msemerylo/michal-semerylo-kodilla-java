package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User {

    @Override
    public String getUsername() {
        return "John Smith";
    }
}
