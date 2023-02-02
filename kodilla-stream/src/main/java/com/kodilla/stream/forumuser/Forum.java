package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();
    public Forum(){
        theUsersList.add(new ForumUser(1,"Antoni",'m', LocalDate.of(1990,1,12 ),997));
        theUsersList.add(new ForumUser(2,"Patrycja",'k',LocalDate.of(2000,12,24),17));
        theUsersList.add(new ForumUser(3,"Jarek",'m',LocalDate.of(1980,2,27),432));
        theUsersList.add(new ForumUser(4,"Karolina",'k',LocalDate.of(1994,6,21),987));
    }
    public List<ForumUser> getList(){
        return new ArrayList<>(theUsersList);
    }
}
