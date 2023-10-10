package org.example.day2;

import org.example.day2.library.Book;

public class DayTwo {
    public static void main(String[] args) {
//        String hello = new String("hello");
//        System.out.println("This is the first hello: " +hello+ "\nAnd this is the second hello using just the constructor "+ new String("\n I am the second hello"));

        Book libraryBook = new Book();
        libraryBook.setName("Spider-Man");
        System.out.println(libraryBook.getName());
    }
}
