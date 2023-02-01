package com.kodilla.stream.immutable;

public final class Book {
    private final String title;
    private final String author;
    private final int yerOfPublication;

    public Book(final String title, final String author, final int yerOfPublication){
        this.title = title;
        this.author = author;
        this.yerOfPublication = yerOfPublication;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYerOfPublication(){
        return yerOfPublication;
    }
}
