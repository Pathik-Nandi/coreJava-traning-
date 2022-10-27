package com.tarento.lambdaexpression;

public abstract class LamdaTrail implements LambdaInterface {
    public static void main(String[] args) {

        //--------Using C class Concrete approach----------
        NewClass l1= new NewClass();
        l1.emp(102,"nandi");

       //---------Using Anonymous class approach------------
        LambdaInterface obj= new LambdaInterface() {
            @Override
            public void emp(int id, String companyname) {
                System.out.println("This is anonymous approach");
                System.out.println("Register No: "+id);
                System.out.println("Company Name:"+companyname+"\n");

            }
        };
        obj.emp(234,"TATA");

//---------Using Lambda expression approach----
        LambdaInterface obj2 ;
        System.out.println("This is lambda approach");
        obj2=(i,a)-> System.out.println("Register No: "+i+ "\n Company name: "+a);
        obj2.emp(1089,"Tarento");
    }
    public static class NewClass implements LambdaInterface{
        public void emp(int id, String companyname)
        {
            System.out.println("This is concrete approach");
            System.out.println("Register:"+id);
            System.out.println("Company:"+companyname+"\n");

        }
    }
}
