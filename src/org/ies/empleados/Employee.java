package org.ies.empleados;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
    protected String nif;
    protected String name;
    protected String lastName;
    protected int hoursWorked;

    public Employee(String nif, String name, String lastName, int hoursWorked) {
        this.nif = nif;
        this.name = name;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
    }

    public String ask (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return hoursWorked == employee.hoursWorked && Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, lastName, hoursWorked);
    }


}
