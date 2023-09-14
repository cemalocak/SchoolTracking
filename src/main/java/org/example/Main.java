package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("PersonName", "PersonLastName", 123456);
        Student student = new Student("StudentName", "StudentLastName", 23456);
        Teacher teacher = new Teacher("TeacherName", "TeacherLastName", 34567);
        teacher.branch = "Matematik";
        teacher.lessons.add("Matematik");
        teacher.lessons.add("Geometri");
        teacher.lessons.add("Mantık");
        Officer officer = new Officer("OfficerName", "OfficerLastName", 456789);
        officer.serviceType = "Temizlik İşleri";

        //Öğrenci Not Girme ve Ortalama Not Hesabı
        student.setNot(30);
        System.out.println("Öğrenci Not Ortalaması : " + student.getAvgNot());
        System.out.println("------------------------");

        student.setNot(30, 60);
        System.out.println("Öğrenci Not Ortalaması : " + student.getAvgNot());
        System.out.println("------------------------");

        student.setNot(30, 60, 90);
        System.out.println("Öğrenci Not Ortalaması : " + student.getAvgNot());
        System.out.println("------------------------");

        person.print();
        student.print();
        teacher.print();
        officer.print();
    }
}