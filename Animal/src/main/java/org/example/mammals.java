package org.example;

public class mammals implements Animal {
    public String name;
    public int weight;

    public mammals(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // Override the compareTo method
    public int compareTo(mammals mammals) {
        if (weight == mammals.weight) {
            return 0;
        }
        else if (weight > mammals.weight) {
            return 1;
        }
        else{
            return -1;
    }

 }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void swim() {
        System.out.println("they can swim");
    }

    @Override
    public void run() {
        System.out.println("they can run");
    }

