package org.example.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListArrayClass {
    public static void main(String[] args) {

        //Um Array NUNCA tem o seu tamanho mudado depois de criado.
        //Precisa passar a quantidade para ser iniciado.
        String[] friendsArray2 = new String[4];

        //Outra forma de iniciar, já passando os nomes para ser inserido,
        //E com isso, o tamanho do array.
        String[] friendsArray= {"Adler","Crystal","Axe","Trend"};

        //Um Array pode ser de tipos primitivos e classes java.
        boolean[] listaBool = new boolean[3];
        //Array sempre começa do lugar 0, como por exemplo: [0][1][2][3], 4 posições.

        //O ArrayList é dinâmico expansivamente, pode aumentar o tamanho.
        ArrayList<String> friendArrayList1 = new ArrayList<>();

        //Posso iniciar um ArrayList já colocando os valores dentro.
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Adler","Crystal","Axe","Trend"));

        //O ArrayList só aceita classes java, não aceita tipos primitivos:
        //Como por exemplo, a linha abaixo irá gerar erro:
        //ArrayList<int> errorArrayList = new ArrayList<>();

        //Se eu quiser pegar valores do Array? Por exemplo, Crystal
        System.out.println(friendsArray[1]);
        //E do ArrayList?
        System.out.println(friendsArrayList.get(1));

        //E o tamanho do Array?
        System.out.println(friendsArray.length); //o Lenght
        //E o tamanho do ArrayList?
        System.out.println(friendsArrayList.size());

        //Para adicionar num ArrayList:
        friendsArrayList.add("NovoElemento");

        //Se eu quiser mudar um elemento no Array?
        friendsArray[0] = "SubstituindoOPrimeirOLugar";
        //E no ArrayList? Passamos a posição, e o valor.
        friendsArrayList.set(0,"SubstituindoOPrimeirOLugar");

        //Arrays não podem remover um elemento e diminuir o tamanho do Array, é fixo.

        //ArrayList pode remover de 2 jeitos:
        //1-Passando o Index
        friendsArrayList.remove(0);
        //2-Passando o elemento que eu quero remover
        friendsArrayList.remove("Adler");

        //Print Array
        System.out.println(friendsArray);
        //Quando você faz dessa maneira mostra o endereço da memória.
        //Se você quiser mostrar, precisa fazer um loop pra mostrar.
        for (String friend:friendsArray) {
            System.out.println(friend);
        }

        //Para mostrar os valores do ArrayList é mais simples,
        //Porque tem um ToString em algum lugar implementado que faz a conversão para mostrar os valores.
        System.out.println(friendsArrayList);
    }
}
