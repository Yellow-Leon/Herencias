package org.ies.empleados;

import java.util.Objects;

public class ProductManager extends Employee{
    protected String project;

    public ProductManager(String nif, String name, String lastName, int hoursWorked, String project) {
        super(nif, name, lastName, hoursWorked);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductManager that = (ProductManager) o;
        return Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), project);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "project='" + project + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
