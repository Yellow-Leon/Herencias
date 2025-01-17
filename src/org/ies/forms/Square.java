package org.ies.forms;

import java.util.Objects;

public class Square extends Form{
    protected double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        double area = side * side;
        System.out.println("El area del cuadrado es : " + area);
    }

    @Override
    public void showInfo() {
        System.out.println("Forma : Cuadrado    |   Color : " + color + " Lado : " + side );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(side, square.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "side=" + side +
                ", color='" + color + '\'' +
                '}';
    }
}
