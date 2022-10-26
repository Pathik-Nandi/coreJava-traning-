package com.tarento.lambdaexpression;

public abstract class LamdaTrail implements LambdaInterface {
    public static void main(String[] args) {
       //Using Anonymous class approach
        LambdaInterface obj= new LambdaInterface() {
            @Override
            public void emp(int id, String companyname) {
                System.out.println("number:"+id+"\n");
                System.out.println("String is:"+companyname);

            }
        };
        obj.emp(234,"TATA");

//Using Lambda expression approach
        LambdaInterface obj2 ;
        obj2=(i,a)-> System.out.println("number"+i+ "\n String"+a);
        obj2.emp(1089,"Tarento");
    }
}
