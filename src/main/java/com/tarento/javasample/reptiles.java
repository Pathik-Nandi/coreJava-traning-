package com.tarento.javasample;

public class reptiles implements Animal{
    private String name;
    private int weight;

    public reptiles(String name, int weight) {
        this.name = name;
        this.weight = weight;
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
        System.out.println("But they can't run");
    }
}
