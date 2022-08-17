package main;

import data.Person;
import data.Student;

public class Implementation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setRollNo(30);
        obj.setSection("C");
        obj.setStandard(12);

        System.out.println("obj.getRollNo() = " + obj.getRollNo());
        System.out.println("obj.getSection() = " + obj.getSection());
        System.out.println("obj.getStandard() = " + obj.getStandard());


       obj.setAge(20);
       obj.setBloodGroup("O +");
       obj.setEmail("rohit@12");
       obj.setCountry("INDIA");
       obj.setCity("Nagpur");
       obj.setName("Rohit Narnaware");

        System.out.println("person.getName() = " + obj.getName());
        System.out.println("obj.getRollNo() = " + obj.getRollNo());
        System.out.println("person.getCity() = " + obj.getCity());
        System.out.println("obj.getSection() = " + obj.getSection());
        System.out.println("obj.getStandard() = " + obj.getStandard());
        System.out.println("person.getBloodGroup() = " + obj.getBloodGroup());
        System.out.println("person.getCountry() = " + obj.getCountry());
        System.out.println("person.getEmail() = " + obj.getEmail());
        System.out.println("person.getAge() = " + obj.getAge());


    }
}
