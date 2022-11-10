package com.example.HIbernatePart2.Entities;

import javax.persistence.*;

@Table(name = "employee")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstname;
    private String lastname;
    private Long salary;
    private Integer age;

    Employee(){

    }
    public Employee(String firstname, String lastname, Long salary, Integer age) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
    }

    public Integer getId() {
        return id;
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
