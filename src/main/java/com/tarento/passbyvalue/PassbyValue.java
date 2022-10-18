package com.tarento.passbyvalue;

public class PassbyValue {
    public static void main(String[] args) {
        int x=10;
        System.out.println(x);
        fun1(x);
        System.out.println(x);
    }

    public static void fun1(int num)
    {
//        num=num;
          System.out.println(num);
        num=100;
        System.out.println(num);
    }
}
