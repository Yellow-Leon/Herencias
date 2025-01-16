package org.ies.vehicles;

import java.util.Objects;
import java.util.Scanner;

public abstract class Vehicle {
    protected double kmCount;
    protected String tuition;

    public Vehicle(double kmCount, String tuition) {
        this.kmCount = kmCount;
        this.tuition = tuition;
    }

    public void move (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distancia recorrida");
        kmCount += scanner.nextDouble();
        System.out.println(kmCount);
    }

    public double getKmCount() {
        return kmCount;
    }

    public void setKmCount(double kmCount) {
        this.kmCount = kmCount;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(kmCount, vehicle.kmCount) == 0 && Objects.equals(tuition, vehicle.tuition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kmCount, tuition);
    }
}
