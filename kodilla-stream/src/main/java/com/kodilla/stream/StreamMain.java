package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        Forum forum = new Forum();

        Map<Integer,ForumUser> theResultMapOfUsers = forum.getList().stream()
                .filter(user -> user.getSex()=='m')
                .filter(user -> user.getDateOfBirth().getYear()<2003)
                .filter(user -> user.getNumberOfPosts()>1)
                .collect(Collectors.toMap(ForumUser::getId,user->user));

        System.out.println("# elements: "+ theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey()+": "+entry.getValue())
                .forEach(System.out::println);



    }

}
