package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
     private List <ForumUser> forumUserList = new ArrayList<>();



    public  Forum() {
        forumUserList.add(new ForumUser(1213,"Michael",'M', LocalDate.of(2002,3,6),1321 ));
         forumUserList.add(new ForumUser(13566,"Asia",'F', LocalDate.of(1987,6,9),154 ));
         forumUserList.add(new ForumUser(12367,"Adam",'M', LocalDate.of(2006,9,26),1423 ));
         forumUserList.add(new ForumUser(124767,"Matthew",'M', LocalDate.of(1999,12,28),1111 ));
         forumUserList.add(new ForumUser(18889,"Anna",'F', LocalDate.of(1967,3,12),123 ));
         forumUserList.add(new ForumUser(13454,"Emil",'M', LocalDate.of(1989,6,30),1264 ));


    }
    public List<ForumUser> getForumUserList() {
        return forumUserList;
    }
}
