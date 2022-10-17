package com.tarento;

public class Pojo {
    private  int id;
    private String name;
    private String description;
    private subpojo subpojo;



    public Pojo(int id, String name, String description, com.tarento.subpojo subpojo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.subpojo = subpojo;
    }
    public Pojo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public com.tarento.subpojo getSubpojo() {
        return subpojo;
    }

    public void setSubpojo(com.tarento.subpojo subpojo) {
        this.subpojo = subpojo;
    }
    @Override
    public String toString() {
        return "Pojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", subpojo=" + subpojo +
                '}';
    }
}
