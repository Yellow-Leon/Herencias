package org.ies.forms;

import java.util.Objects;

public class RightTriangle extends Form {
    protected double base;
    protected double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void area() {
        double area = base * height / 2;
        System.out.println("El area del triangulo es : " + area);
    }

    @Override
    public void showInfo() {
        System.out.println("Forma : Triangulo    |   Color : " + color + " Base : " + base + " Altura : " + height );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RightTriangle that = (RightTriangle) o;
        return Double.compare(base, that.base) == 0 && Double.compare(height, that.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "base=" + base +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
