package com.tarento.accessmodtrials;

public class submodifier {
    private String address;
    protected int phno;

    public submodifier(String address, int phno) {
        this.address = address;
        this.phno = phno;
    }

    public submodifier() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }

    @Override
    public String toString() {
        return "submodifier{" +
                "address='" + address + '\'' +
                ", phno=" + phno +
                '}';
    }
}
