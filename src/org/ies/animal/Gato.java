package org.ies.animal;

import java.util.Objects;

class Gato extends Animal {
    protected String color;

    public Gato(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println("Animal : Gato " + " Edad : " + getAge() + " Color : " + getColor());
    }

    @Override
    public void saySomething() {
        System.out.println("Miau , miau");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gato gato = (Gato) o;
        return Objects.equals(color, gato.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "org.ies.animal.Gato{" +
                "color='" + color + '\'' +
                '}';
    }
}
