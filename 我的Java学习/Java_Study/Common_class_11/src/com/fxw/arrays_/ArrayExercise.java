package com.fxw.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦~", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("java从入门到放弃w", 300);

        bubble(books, (o1, o2) -> {
            Double D1 = (Double)o1;
            Double D2 = (Double)o2;
            return (int) (D1 - D2);
        });

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        System.out.println("================================");

        bubble(books, (o1, o2) -> {
            Double D1 = (Double)o1;
            Double D2 = (Double)o2;
            return (int) (D2 - D1);
        });

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        System.out.println("================================");


        stringSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2 - i1;
            }
        });

        stringSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2 - i1;
            }
        });

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    public static void bubble(Book[] books, Comparator c) {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (c.compare(books[j].price, books[j + 1].price) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public static void stringSort(Book[] books, Comparator c) {
        Integer[] strlength = new Integer[books.length];
        for (int i = 0; i < books.length; i++) {
            strlength[i] = books[i].name.length();
        }
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (c.compare(strlength[j], strlength[j + 1]) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}

class Book {
    public String name;
    public Double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}