package com.example.data;

import java.util.Arrays;

public class AuthorRepository {
    public Iterable<Author> getAuthors() {

        var a = new Author(1,"Jānis", "Pliekšāns", "Rainis");
        var a1 = new Author(2,"Andris", "Ozols", "");
        var a2 = new Author(3,"Baiba", "Kļava", "Bb");

        return Arrays.asList(a, a1, a2);

    }
}
