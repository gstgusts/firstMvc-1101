package com.example.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductsRepository {
    public Iterable<Book> getBooks() {
        var a = new Author(1,"Jānis", "Pliekšāns", "Rainis");
        var a1 = new Author(2,"Andris", "Ozols", "");
        var a2 = new Author(3,"Baiba", "Kļava", "Bb");

        var b1 = new Book(1, "Some book", 23.56, Arrays.asList(a, a1), "1111");
        var b2 = new Book(2, "Gone with a wind", 10.56, Arrays.asList(a), "2222");
        var b3 = new Book(3, "To the moon", 7.99, Arrays.asList(a1, a2), "3333");

        return Arrays.asList(b1, b2, b3);
    }

    public Iterable<Magazine> getMagazines() {
        var m1 = new Magazine(1, "Times", 10.00, 2, LocalDateTime.now());
        var m2 = new Magazine(2, "People", 15.00, 2, LocalDateTime.now());
        var m3 = new Magazine(3, "National Geographic", 20.00, 2, LocalDateTime.now());

        return Arrays.asList(m1, m2, m3);
    }

    public Iterable<ProductBase> getProducts() {
        List<ProductBase> products = new ArrayList<>();

        for (var book:
             getBooks()) {
            products.add(book);
        }

        for (var mag :
                getMagazines()) {
            products.add(mag);
        }

        return products;
    }
}
