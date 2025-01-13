package com.amigoscode.graphQL.models;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id,
                   String name,
                   Integer pageCount ) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Lord of the Ring", 1150),
            new Book(2, "The litle Prince", 96),
            new Book(3, "Casas Muertas", 411),
            new Book(4, "Leader eat last", 352)
    );


}