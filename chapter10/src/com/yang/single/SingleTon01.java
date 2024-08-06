package com.yang.single;

public class SingleTon01 {
    public static void main(String[] args) {

        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

    }
}

 class GirlFriend {
    private String name;

    private static GirlFriend gf = new GirlFriend("小红");

    private GirlFriend(String name) {
        this.name = name;
    }


    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
