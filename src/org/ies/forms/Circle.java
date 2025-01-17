package org.ies.forms;

import java.util.Objects;

public class Circle extends Form {
    protected double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = 3.14 * radius * radius;
        System.out.println("El area del circulo es : " + area);
    }

    @Override
    public void showInfo() {
        System.out.println("Forma : Circulo    |   Color : " + color + " Radio : " + radius );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
