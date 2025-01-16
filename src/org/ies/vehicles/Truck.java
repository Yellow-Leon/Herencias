package org.ies.vehicles;

import java.util.Objects;

public class Truck extends Vehicle {
    protected int numeroDeEjes;

    public Truck(int kmCount, String tuition, int numeroDeEjes) {
        super(kmCount, tuition);
        this.numeroDeEjes = numeroDeEjes;
    }

    public void showInfo (){
        System.out.println("Es un camion con" + kmCount + " de kilometraje , matricula " + tuition + " con " +
                numeroDeEjes + " de ejes");
    }

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(int numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return numeroDeEjes == truck.numeroDeEjes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroDeEjes);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numeroDeEjes=" + numeroDeEjes +
                ", kmCount=" + kmCount +
                ", tuition='" + tuition + '\'' +
                '}';
    }
}
