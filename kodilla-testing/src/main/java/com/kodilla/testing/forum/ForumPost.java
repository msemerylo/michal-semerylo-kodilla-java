package com.kodilla.testing.forum;

public class ForumPost {
    private String postBody;
    private String author;

    public ForumPost(String postBody,String author){
        this.postBody = postBody;
        this.author = author;
    }
    public String getPostBody() {
        return postBody;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumPost forumPost)) return false;

        if (!getPostBody().equals(forumPost.getPostBody())) return false;
        return getAuthor().equals(forumPost.getAuthor());
    }

    @Override
    public int hashCode() {
        int result = getPostBody().hashCode();
        result = 31 * result + getAuthor().hashCode();
        return result;
    }
}
