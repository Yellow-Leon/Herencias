package org.ies.empleados;

public class technologyDirector extends Employee{
    @Override
    public String toString() {
        return "technologyDirector{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    public technologyDirector(String nif, String name, String lastName, int hoursWorked) {
        super(nif, name, lastName, hoursWorked);


    }
}
