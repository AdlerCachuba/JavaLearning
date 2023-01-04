package org.example.typesOfClasses;

import java.util.Objects;

public class SameClassWithoutRecord {

    private final String name;
    private final int idade;

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public SameClassWithoutRecord(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "SameClassWithoutRecord{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SameClassWithoutRecord that = (SameClassWithoutRecord) o;
        return idade == that.idade && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idade);
    }


}
