package com.jessica.apirest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    //private String name;
    private String firstName;
    private String lastName;
    private String erole;

    Employee(){}

    public Employee(String firstName, String lastName, String role) {
        //this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.erole = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        //return name;
        return this.firstName + " " + this.lastName;
    }

    public void setName(String name) {
        //this.name = name;
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getErole() {
        return erole;
    }

    public void setErole(String erole) {
        this.erole = erole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        //return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(role, employee.role);
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName)  && Objects.equals(erole, employee.erole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, erole);
    }

    @Override
    public String toString(){
        //return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
        return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + ", lastName='" + this.lastName + '\'' + ", role='" + this.erole + '\'' + '}';

    }

}
