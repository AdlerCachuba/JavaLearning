package org.example.lists;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {

    //Uma TreeSet é semelhante a uma HashSet, MAS MUITO MAIS LENTO que o HashSet
        //Possui os mesmos métodos e regras.
        // Você só usa uma TreeSet quando você se importa com a ordenação dos elementos
    //A principal diferença é a ordenação que é feita dentro dela dos elementos inseridos:
    Set<String> names = new TreeSet<>();
    names.add("Ciclano");
    names.add("Beltrano");
    names.add("Zed");
    names.add("Adler");

    Set<Integer> numeros = new TreeSet<>();
    numeros.add(7);
    numeros.add(1);
    numeros.add(9);


    System.out.println(names); //[Adler, Beltrano, Ciclano, Zed]
        System.out.println(numeros); //[1,7,9]
    //Automaticamente é ordenado por ordem alfabética e numérica


        System.out.println(numeros);
    }
}