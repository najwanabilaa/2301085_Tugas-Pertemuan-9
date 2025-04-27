/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oopjava.tugas9no1;

/**
 *
 * @author Misdiana
 */
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate hireDate;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}

public class Tugas9no2 {
    public static void main(String[] args) {
        Person person = new Person("Ali", "Jl. Merdeka 1", "08123456789", "ali@email.com");
        Student student = new Student("Budi", "Jl. Kebangsaan 5", "08987654321", "budi@email.com", Student.SENIOR);
        Employee employee = new Employee("Citra", "Jl. Damai 10", "082233445566", "citra@email.com", "Kantor Pusat", 7000000, new MyDate(2020, 5, 12));
        Faculty faculty = new Faculty("Dina", "Jl. Persatuan 7", "0811223344", "dina@email.com", "Fakultas Teknik", 9000000, new MyDate(2019, 3, 22), "08.00-16.00", "Profesor");
        Staff staff = new Staff("Eka", "Jl. Nusantara 4", "0877888999", "eka@email.com", "Administrasi", 5000000, new MyDate(2021, 8, 15), "Kepala Administrasi");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
