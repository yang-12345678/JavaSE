package com.yang.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
    }
}


class Movie {
    private String name;
    private double price;
    private String director;

    // 都有相同的语句，看起来比较冗余
    // 可以把相同的语句放入一个代码块中即可
    // 不管调用哪个构造器，创建对象，都会先调用代码块的内容
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
    }


    // 3个构造器，重载
    public Movie(String name) {
        System.out.println("我被调用了1");
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