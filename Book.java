package com.company.java_advanced.homework2.task1;

public class Book {
    private int id;
    private String name;
    private String author;
    private int pages;

    public Book(int id, String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book: " +
                "Name of the book - '" + name + '\'' +
                ", Author of the book - " + author + '\'' +
                ", Number of pages - " + pages;
    }
}
