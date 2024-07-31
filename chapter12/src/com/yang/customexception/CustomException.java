package com.yang.customexception;

public class CustomException {
    public static void main(String[] args) {

        int age = 0;

        if (!(age >= 18 && age<=120)) {
            throw new AgeException("年龄不合法！");
        }

    }
}

class AgeException extends RuntimeException {

    // 构造器
    public AgeException(String message) {
        super(message);
    }
}
