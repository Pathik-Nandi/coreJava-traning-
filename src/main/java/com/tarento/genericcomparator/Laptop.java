package com.tarento.genericcomparator;

public class Laptop {
    private String brand;
    private int price;
    private int ram;

    public Laptop(String brand, int price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public Laptop() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}
