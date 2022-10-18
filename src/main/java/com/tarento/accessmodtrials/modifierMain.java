package com.tarento.accessmodtrials;

public class modifierMain {
    public static void main(String[] args) {
        modifier modifier = new modifier();
        submodifier s1 = new submodifier();
        modifier.id=1011; // In modifier class id is default so i can set value out side of another class
        modifier.age=23; //and age is protected
        modifier.department="IOT"; // department is public
        modifier.setName("pathik"); // Here
        System.out.println(modifier);
        s1.phno=1234567890;
    }
}
