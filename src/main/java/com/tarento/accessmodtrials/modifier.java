package com.tarento.accessmodtrials;

public class modifier {
    int id;
    private String name;
    public String department;
    protected int age;

    private submodifier submodifier;

    public modifier(int id, String name, String department, int age, com.tarento.accessmodtrials.submodifier submodifier) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.submodifier = submodifier;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public com.tarento.accessmodtrials.submodifier getSubmodifier() {
        return submodifier;
    }

    public void setSubmodifier(com.tarento.accessmodtrials.submodifier submodifier) {
        this.submodifier = submodifier;
    }

    public modifier() {
    }

    @Override
    public String toString() {
        return "modifier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", submodifier=" + submodifier +
                '}';
    }
}
