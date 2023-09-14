package org.example;

import java.util.ArrayList;

public class Teacher extends Person implements SchoolTracker{
    public String branch;
    public ArrayList<String> lessons = new ArrayList<>();


    public Teacher(String name, String lastName, int tcNo) {
        super(name, lastName, tcNo);
    }

    @Override
    public void print(){
        System.out.println("Öğretmen Bilgileri:");
        System.out.println("Adı : " + name + " Soyadı : " + lastName + " TC No : " + tcNo + " Branch : " + branch + " Lessons : " + lessons);
    }
}
