package com.example.HIbernatePart2.EmbeddedMapping;

import javax.persistence.*;

@Entity
@Embeddable
public class Employee1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstname;
    private String lastname;
    private Integer age;

    @Embedded
    private  EmployeeSalary employeeSalary;


    public Employee1(String firstname, String lastname, Integer age, EmployeeSalary employeeSalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.employeeSalary = employeeSalary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EmployeeSalary getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(EmployeeSalary employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
