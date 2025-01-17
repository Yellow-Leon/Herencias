package org.ies.empleados;

import java.util.Arrays;
import java.util.Objects;

public class ProjectManager extends Employee{
    protected String[] projects;

    public ProjectManager(String nif, String name, String lastName, int hoursWorked, String project) {
        super(nif, name, lastName, hoursWorked);
        this.projects = new String[]{project};
    }

    public boolean assignProject (String question){
        for (var project : projects) {
            if (question.equals(project)) {
                return true;
            }
        }
        return false;
    }

    public void anwser (boolean trueOrFalse){
        if (!trueOrFalse){
            System.out.println("No dirige ese proyecto");
        }
        else {
            System.out.println("Si dirige ese proyecto");
        }
    }

    public String[] getProject() {
        return projects;
    }

    public void setProject(String project) {
        this.projects = new String[]{project};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.deepEquals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(projects));
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "projects=" + Arrays.toString(projects) +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
