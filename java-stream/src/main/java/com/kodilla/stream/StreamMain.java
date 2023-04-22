package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserStream= forum.getForumUserList().stream()  // [1]
                .filter(N -> N.getSex() == 'M')
                .filter(N -> N.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(N -> N.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, N->N));                    // [2]
        System.out.println(forumUserStream);
    }
}