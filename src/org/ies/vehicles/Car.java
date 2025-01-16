package org.ies.vehicles;

import java.util.Objects;
import java.util.Scanner;

public class Car extends Vehicle {
    protected int numeroDePuertas;
    protected String caballos;

    public Car(double kmCount, String tuition, int numeroDePuertas, String caballos) {
        super(kmCount, tuition);
        this.numeroDePuertas = numeroDePuertas;
        this.caballos = caballos;
    }

    public void showInfo (){
        System.out.println("Es un coche con" + kmCount + " de kilometraje , matricula " + tuition + " con " +
                numeroDePuertas + " de puertas  y " + caballos + " caballos" );
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getCaballos() {
        return caballos;
    }

    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numeroDePuertas == car.numeroDePuertas && Objects.equals(caballos, car.caballos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroDePuertas, caballos);
    }

    @Override
    public String toString() {
        return "Car{" +
                "tuition='" + tuition + '\'' +
                ", kmCount=" + kmCount +
                ", caballos='" + caballos + '\'' +
                ", numeroDePuertas=" + numeroDePuertas +
                '}';
    }
}
