package ru.netology.javaqa;

public class Book extends Product {
    public String getAuthor() {
        return author;
    }

    protected String author;

    public Book(int id, String name, int cost, String author) {
        super(id, name, cost);
        this.author = author;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return getName().contains(search);
        } else {
            return getAuthor().contains(search);
        }
    }
}


