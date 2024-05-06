package org.example.lists;

import org.example.equals.Cat;
import org.example.lists.classesForExample.CatWithToString;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {
    public static void main(String[] args) {

        //O ArrayList é expansivamente dinâminico, pode aumentar o tamanho.
        ArrayList<String> friendArrayList1 = new ArrayList<>();

        //Outra forma de iniciar um ArrayList com os valores dentro.
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Adler", "Crystal", "Axe", "Trend"));

        //O ArrayList só aceita classes java, não aceita tipos primitivos:
        //Como por exemplo, a linha abaixo irá gerar erro:
        //ArrayList<int> errorArrayList = new ArrayList<>();

        //Pegar valores do ArrayList:
        System.out.println(friendsArrayList.get(1));

        //Tamanho do ArrayList:
        System.out.println(friendsArrayList.size());

        //Para adicionar num ArrayList:
        friendsArrayList.add("NovoElemento");

        //Mudar um elemento no ArrayList:
        friendsArrayList.set(0, "SubstituindoOPrimeirOLugar");

        //ArrayList pode remover elementos de 2 jeitos:
        //1-Passando o Index
        friendsArrayList.remove(0);
        //2-Passando o elemento que eu quero remover
        friendsArrayList.remove("Adler");

        //Print ArrayList:
        //Já existe um ToString em algum lugar implementado que é responsável por exibir os valores.
        System.out.println(friendsArrayList); //Nossa lista de Strings.

        //Exemplo complicado:
        //ArrayList de uma classe não tem o toString implementado:
        ArrayList<Cat> catArrayList = new ArrayList<>();
        Cat catWithBlueEyes = new Cat("Miau", 4);
        catArrayList.add(catWithBlueEyes);
        System.out.println(catArrayList);//Vai mostrar o endereço da memória.

        //E para obter os valores nós temos 2 jeitos: ou por métodos acessores se existir, ou implementando o toString na classe.
        //Métodos acessores:
        System.out.println(catArrayList.get(0).getNome() + " " + catArrayList.get(0).getIdade());

        //Ou implementando o toString na classe que você quer imprimir os dados:
        ArrayList<CatWithToString> catListWithToString = new ArrayList<>(Arrays.asList(new CatWithToString("Gevona", 3)));
        System.out.println(catListWithToString);
    }
}
