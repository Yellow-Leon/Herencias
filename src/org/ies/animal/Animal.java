package org.ies.animal;

import java.util.Objects;

public abstract class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public abstract void showInfo();

    public abstract void saySomething();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }

    @Override
    public String toString() {
        return "org.ies.animal.Animales{" +
                "age=" + age +
                '}';
    }
}
