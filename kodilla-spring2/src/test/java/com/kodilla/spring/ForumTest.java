package com.kodilla.spring;

import com.kodilla.spring.forum.ForumUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ForumTest {

    @Test
    void testGetUsername(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);

        Assertions.assertEquals("John Smith",user.getUsername());
        System.out.println("John Smith = "+user.getUsername());

    }
}
