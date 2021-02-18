package com.example.data;

import java.util.ArrayList;
import java.util.List;

public class Book extends ProductBase {
    private List<Author> authors = new ArrayList<>();
    private String isbnCode;

    public Book(int id, String name, double price, List<Author> authors, String isbnCode) {
        super(id, name, price);
        this.authors = authors;
        this.isbnCode = isbnCode;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    @Override
    public String getFullInfo() {
        return isbnCode;
    }
}
