package org.example;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {

    //Uma TreeSet é semelhante a uma HashSet, MAS MUITO MAIS LENTO que o HashSet
        //Você só usa uma TreeSet quando você se importa com a ordenação dos elementos
    //Possui os mesmos métodos e regras.
    //A principal diferença é a ordenação que é feita dentro dela dos elementos inseridos:
    Set<String> names = new TreeSet<>();
    names.add("Ciclano");
    names.add("Beltrano");
    names.add("Zed");
    names.add("Adler");

    System.out.println(names); //[Adler, Beltrano, Ciclano, Zed]
    //Automaticamente é ordenado por ordem alfabética.

    }
}