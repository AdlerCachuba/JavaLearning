package org.example.lists.classesForExample;

import java.util.Objects;

//Classe utilzada como apoio para EqualsClass
public class CatWithToString {

    String nome;
    Integer idade;

    public CatWithToString(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CatWithToString)) return false;
        CatWithToString cat = (CatWithToString) o;
        return Objects.equals(nome, cat.nome) && Objects.equals(idade, cat.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "CatWithToString{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
