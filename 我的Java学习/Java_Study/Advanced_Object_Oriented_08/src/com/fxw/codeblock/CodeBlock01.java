package com.fxw.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie wenxiangshinvren = new Movie("wenxiangshinvren");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正是开始...");
    };

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}


