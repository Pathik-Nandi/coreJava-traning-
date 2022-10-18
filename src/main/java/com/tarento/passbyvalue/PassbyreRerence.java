package com.tarento.passbyvalue;

public class PassbyreRerence {
    public static void main(String[] args) {
        Intwrapper intwrapper = new Intwrapper();
        intwrapper.a=10;

        System.out.println("call by reference:"+intwrapper.a);
        fun1(intwrapper);
        System.out.println("call by reference:"+intwrapper.a);


    }
    public  static void fun1(Intwrapper intwrapper){
        
        intwrapper.a=30;
//        System.out.println(c);
    }

}

class Intwrapper
{
    public int a;
    public Intwrapper(){
        this.a=a;
    }
}
