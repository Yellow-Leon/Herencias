package org.ies.animal;

import java.util.Objects;

public class Perro extends Animal {
    protected String race;

    public Perro(int age, String race) {
        super(age);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void showInfo() {
        System.out.println("Animal : Perro " + " Edad : " + getAge() + " Raza : " + getRace());
    }

    @Override
    public void saySomething() {
        System.out.println("Guau , guau");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Perro perro = (Perro) o;
        return Objects.equals(race, perro.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), race);
    }

    @Override
    public String toString() {
        return "org.ies.animal.Perro{" +
                "race='" + race + '\'' +
                '}';
    }
}
