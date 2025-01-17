package org.ies.empleados;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Programmer extends Employee {
    protected String[] programmingLanguages;
    protected String project;

    public Programmer(String nif, String name, String lastName, int hoursWorked, String programmingLanguages, String project) {
        super(nif, name, lastName, hoursWorked);
        this.programmingLanguages = new String[]{programmingLanguages};
        this.project = project;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public boolean programLanguage(String Question){
        for (var programmingLanguage: programmingLanguages){
            if (programmingLanguage.equals(Question)){
                return true;
            }
        }
        return false;
    }

    public void answer (boolean trueOrFalse){
        if (!trueOrFalse){
            System.out.println("No conoce el lenguaje");
        }
        else {
            System.out.println("Si conoce el lenguaje");
        }
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = new String[]{programmingLanguages};
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
        Programmer that = (Programmer) o;
        return Objects.deepEquals(programmingLanguages, that.programmingLanguages) && Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(programmingLanguages), project);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages=" + Arrays.toString(programmingLanguages) +
                ", project='" + project + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
