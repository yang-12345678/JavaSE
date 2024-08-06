package com.itheima.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Animal a1 = () -> {
            System.out.println("叫");
        };

        a1.cry();
    }
}

interface Animal {
    void cry();
}