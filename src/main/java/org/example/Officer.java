package org.example;

public class Officer extends Person implements SchoolTracker {
    public String serviceType;


    public Officer(String name, String lastName, int tcNo) {
        super(name, lastName, tcNo);
    }

    @Override
    public void print(){
        System.out.println("Görevli Bilgileri:");
        System.out.println("Adı : " + name + " Soyadı : " + lastName + " TC No : " + tcNo + " Service Type : " + serviceType);
    }
}
