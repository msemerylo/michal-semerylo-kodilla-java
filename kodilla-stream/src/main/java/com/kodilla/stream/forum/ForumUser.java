package com.kodilla.stream.forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
    private final String userName;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(String userName, String realName, String location) {
        this.userName = userName;
        this.realName = realName;
        this.location = location;
    }
    public void addFriend(ForumUser user) {
        friends.add(user);
    }

    public boolean removeFriend(ForumUser user) {
        return friends.remove(user);
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser forumUser)) return false;

        return getUserName() != null ? getUserName().equals(forumUser.getUserName()) : forumUser.getUserName() == null;
    }

    @Override
    public int hashCode() {
        return getUserName() != null ? getUserName().hashCode() : 0;
    }
    public Set<String> getLocationsOfFriends() {
        return friends.stream()
                .map(ForumUser::getLocation)
                .collect(Collectors.toSet());
    }
    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()
                .flatMap(user -> user.getFriends().stream())
                .filter(user -> user != this)
                .map(ForumUser::getLocation)
                .collect(Collectors.toSet());
    }
}
