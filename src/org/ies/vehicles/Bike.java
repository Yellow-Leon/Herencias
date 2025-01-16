package org.ies.vehicles;

import java.util.Objects;

public class Bike extends Vehicle{
    protected String cilindrado;

    public Bike(int kmCount, String tuition, String cilindrado) {
        super(kmCount, tuition);
        this.cilindrado = cilindrado;
    }

    public void showInfo (){
        System.out.println("Es un coche con" + kmCount + " de kilometraje , matricula " + tuition + " con " +
                cilindrado + " cilindro ");
    }

    public String getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(String cilindrado) {
        this.cilindrado = cilindrado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bike bike = (Bike) o;
        return Objects.equals(cilindrado, bike.cilindrado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cilindrado);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "cilindrado='" + cilindrado + '\'' +
                ", kmCount=" + kmCount +
                ", tuition='" + tuition + '\'' +
                '}';
    }
}
