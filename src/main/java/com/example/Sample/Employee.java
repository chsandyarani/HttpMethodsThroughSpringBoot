package com.example.Sample;
public class Employee {
    String id;
    String name;
//generating getters and setters
    public String getId() {
        return id;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public void setId(String id) {

        this.id = id;
    }
    //generating constructor
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //generating to-string
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }




}
