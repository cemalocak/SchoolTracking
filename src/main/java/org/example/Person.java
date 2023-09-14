package org.example;

public class Person implements SchoolTracker {
    public String name;
    public String lastName;
    public int tcNo;

    public Person(String name, String lastName, int tcNo) {
        this.name = name;
        this.lastName = lastName;
        this.tcNo = tcNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    @Override
    public void print() {
        System.out.println("Kişi Bilgileri:");
        System.out.println("Adı : " + name + " Soyadı : " + lastName + " TC No : " + tcNo);
    }
}
