package com.fxw.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 冯肖伟
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new LinkedList();
        //List list = new Vector();
        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 101, "吴承恩"));
        list.add(new Book("三国演义", 288, "罗贯中"));

        bubbleSort(list);

        System.out.println(list);

    }

    public static void bubbleSort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}


class Book {
    private String title;
    private double price;
    private String name;

    public Book(String title, double price, String name) {
        this.title = title;
        this.price = price;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}