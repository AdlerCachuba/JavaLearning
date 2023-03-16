package org.example.lists;

import java.util.*;

public class SetHashSetClass {
    public static void main(String[] args) {

        //PRINCIPAL VANTAGEM DO HASHSET: Velocidade.
        //Não importa o tamanho da sua HashSet!
        //Adicionar um elemento nessa lista, remover, ou ver se tem um elemento,
        //Vai sempre demorar o mesmo tempo independente do tamanho da sua HashSet.

        //Set é uma interface, por isso não e possível fazer o código abaixo:
        //Set<String> names = new Set();
        //Não se instancia interfaces, instancia classes que implementam interfaces.

        Set<String> names = new HashSet<>();
        names.add("Adler");
        names.add("Crystal");
        names.add("Axe");
        names.add("Malfurion");
        names.add("Juggernaut");
        names.add("Mortred");

        System.out.println(names); //[Malfurion, Adler, Juggernaut, Mortred, Crystal, Axe]
        //Primeira principal diferença entre Lista e Hashset é essa:
        //Uma lista sempre mantém a ordem de elementos adicionados nela, e tem vários métodos para ordenar a lista.
        //Mas a HashSet não tem ordem. Então não tem nenhuma garantia qual a ordem dos elementos que serão inseridos.

        //Segunda principal diferença:
        //Se eu tentar adicionar um elemento que já existe, o Set não deixa duplicar elementos que já existem.
        //Sendo assim, se eu tento adicionar uma String que já existe:
        names.add("Axe");
        System.out.println(names); //[Malfurion, Adler, Juggernaut, Mortred, Crystal, Axe]
        //o HashSet não irá adicionar.

        //Terceira principal diferença:
        //Para remover elementos em HashSet precisamos passar o Objeto, como por exemplo:
        names.remove("Axe");
        //Mas em HashSet não é possível remover itens pelo seu Index.
        //Sendo assim, se eu tentar remover o primeiro elemento da lista:
        names.remove(0);
        //Não irá remover o "Malfurion", ele vai tentar remover o Objeto com valor 0.
        //Que no caso não existe, então não irá fazer nada.

        //Para conseguir saber o tamanho:
        System.out.println(names.size());

        //Para saber se tem um elemento com o valor X
        System.out.println(names.contains("Adler")); // true

        //Mostra cada elemento da lista, mas como o HashSet não possui um Index
        //Ele pode mostrar elementos em ordem diferente do que estão no HashSet:
        for (String name : names) {
            System.out.println(name);
        }
        //Ou em tudo em uma linha
        names.forEach(System.out::println);


        //Vamos dizer que eu possuo uma Lista de números com valores duplicados dentro.
        //E meu objetivo é exibir essa lista, mas sem mostrar elementos duplicados.
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(3);
        numberList.add(3);

        //E dessa maneira nós criamos um HashSet, adicionamos os numeros da lista, e exibimos.
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);

        //Mas existe uma maneira ainda mais otimizada, que é na hora de criar o HashSet
        //Já passar por parametro a Lista que você quer adicionar a ele:
        Set<Integer> numberSetSimple = new HashSet<>(numberList);
        System.out.println(numberSetSimple);


        //Mas, se eu quiser realizar uma iteração com cada elemento do meu HashSet?
        //Você precisa criar um Iterador, do mesmo tipo do HashSet:
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }


        //Limpar um HashSet
        names.clear();


    }
}
