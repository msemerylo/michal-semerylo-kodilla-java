package com.kodilla.testing.forum.statistic;

public class StatisticForum {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPosts;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPosts() {
        return commentsPerPosts;
    }
    public void calculateAdvStatistic(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        postsPerUser = calculatePostsPerUser();
        commentsPerUser = calculateCommentsPerUser();
        commentsPerPosts = calculateCommentsPerPosts();
    }
    private double calculatePostsPerUser(){
        if (numberOfUsers>0){
            return (double) numberOfPosts/numberOfUsers;
        }else{
            return 0;
        }
    }
    private double calculateCommentsPerUser(){
        if (numberOfUsers>0){
            return (double) numberOfComments/numberOfUsers;
        }else {
            return 0;
        }
    }
    private double calculateCommentsPerPosts(){
        if (numberOfPosts>0){
            return (double) numberOfComments/numberOfPosts;
        }else {
            return 0;
        }
    }
    public void showStatistics(){
        System.out.println("Number of users: "+numberOfUsers);
        System.out.println("Number of posts: "+numberOfPosts);
        System.out.println("Number of comments: "+numberOfComments);
        System.out.println("Posts per user: "+postsPerUser);
        System.out.println("Comments per user: "+commentsPerUser);
        System.out.println("Comments per posts: "+commentsPerPosts);
    }


}
