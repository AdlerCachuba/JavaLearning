package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayListClass {
    public static void main(String[] args) {
        //A referência do LinkedList tem no começo e no final e decide por onde começar encontrar o elemento
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Adler");
        namesLinkedList.add("Akali");
        namesLinkedList.add("Crystal");
        System.out.println(namesLinkedList.get(2));

        //Array de String
        String[] names = new String[4]; //Tamanho fixo

        //A referência do ArrayList é que todos os elementos estão ligados entre eles, cada elemento
        //Aponta para o próximo e o anterior a referência.

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Adler");
        namesArrayList.add("Akali");
        namesArrayList.add("Crystal");
        System.out.println(namesArrayList.get(2));


        //Então para buscar um elemento da lista, é muito mais rápido/instantâneo usar o ArrayList
        //Mas inserir ou remover vai ser muito mais rápido que o LinkedList.
    }
}
