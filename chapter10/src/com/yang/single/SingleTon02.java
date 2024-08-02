package com.yang.single;

public class SingleTon02 {

}

class Cat {
    private String name;

    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小可爱");
        }

        return cat;
    }
}