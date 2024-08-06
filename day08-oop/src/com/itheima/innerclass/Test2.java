package com.itheima.innerclass;

public class Test2 {
    public static void main(String[] args) {
        // 需求: 学生、老师都要参加游泳比赛
        Swim s1 = new Swim() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        };

        start(s1);

        start(new Swim() {
            @Override
            public void swim() {
                System.out.println("老师游泳");
            }
        });


    }

    public static void start(Swim s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

interface Swim {
    void swim();
}