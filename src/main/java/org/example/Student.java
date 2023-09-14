package org.example;

public class Student extends Person implements SchoolTracker {
    private final String name;
    private final String lastName;

    public int schoolNumber;
    public String className;
    public int not1 = -1;
    public int not2 = -1;
    public int not3 = -1;

    //Ortalama notun elle değiştirilememesi için private tanımlandı.
    private double avgNot = -1;



    public Student(String name,String lastName, int tcNo){
        super(name, lastName, tcNo);
        this.name = name;
        this.lastName = lastName;
    }

    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getNot1() {
        return not1;
    }
    public int getNot2() {
        return not2;
    }

    public int getNot3() {
        return not3;
    }

    public void setNot(int not){
        this.not1 = not;
    }

    public void setNot(int not1, int not2){
        this.not1 = not1;
        this.not2 = not2;
    }
    public void setNot(int not1, int not2, int not3){
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }

    public double getAvgNot() {
        int count = 0;
        this.avgNot = 0;
        if(not1 != -1){
            avgNot+=not1;
            count++;
        }
        if(not2 != -1){
            avgNot+=not2;
            count++;
        }
        if(not3 != -1){
            avgNot+=not3;
            count++;
        }
        return avgNot=avgNot/count;
    }

    @Override
    public void print(){
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("Adı : " + name + " Soyadı : " + lastName + " TC No : " + tcNo + "Not1 : " + not1 + " Not2 : " + not2 + " Not3 : " + not3 + " Not Ortalaması : " + avgNot );
    }

}
