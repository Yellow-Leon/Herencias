package org.ies.animal;

import java.util.Objects;

class Cerdo  extends Animal {
    protected String alimentacion;

    public Cerdo(int age, String alimentacion) {
        super(age);
        this.alimentacion = alimentacion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public void showInfo() {
        System.out.println("Animal : Cerdo" + " Edad : " + getAge() + "Alimentacion : " + getAlimentacion());
    }

    @Override
    public void saySomething() {
        System.out.println("Oink , oink");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cerdo cerdo = (Cerdo) o;
        return Objects.equals(alimentacion, cerdo.alimentacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), alimentacion);
    }

    @Override
    public String toString() {
        return "org.ies.animal.Cerdo{" +
                "alimentacion='" + alimentacion + '\'' +
                '}';
    }
}
