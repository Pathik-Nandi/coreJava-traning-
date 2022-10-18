package com.tarento.jsontrails;

public class subpojo {
    private String name;
    private String department;

    public subpojo(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public subpojo() {
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

    @Override
    public String toString() {
        return "subpojo{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
