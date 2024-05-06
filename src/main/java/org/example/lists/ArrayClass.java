package org.example.lists;

import org.example.equals.Cat;
import org.example.lists.classesForExample.CatWithToString;

public class ArrayClass {
    public static void main(String[] args) {

        //Um Array NUNCA mudará de tamanho depois de criado.
        //E precisa passar a quantidade para ser iniciado.
        String[] friendsArray2 = new String[4];

        //Outra forma de iniciar, já passando os nomes para ser inserido,
        //E com isso, o tamanho do array.
        String[] friendsArray = {"Adler", "Crystal", "Axe", "Trend"};

        //Um Array pode ser de tipos primitivos e classes java.
        boolean[] listaBool = new boolean[3];
        //Array sempre começa do lugar 0, como por exemplo: [0][1][2][3], 4 posições.

        //Para pegar valores do Array:
        System.out.println(friendsArray[1]); //Crystal

        //Tamanho do Array:
        System.out.println(friendsArray.length); //o lenght

        //Mudar um elemento no Array:
        friendsArray[0] = "SubstituindoOPrimeirOLugar";

        //Arrays não podem remover um elemento e diminuir o tamanho do Array, é fixo.

        //Print Array
        //Exemplos errados:
        System.out.println(friendsArray);//Quando você faz dessa maneira mostra o endereço da memória.
        System.out.println(friendsArray.toString()); //Ainda assim, mostra o endereço da memória.

        //Exemplo certo:
        //Se você quiser mostrar, precisa fazer um loop pra mostrar.
        for (String objetoDoArray : friendsArray) {
            System.out.println(objetoDoArray);
        }

        //Um Array pode ser de tipos primitivos e classes java.
        CatWithToString blueEyesCat = new CatWithToString("BlueEyes", 3);
        CatWithToString[] catsList = new CatWithToString[1];
        catsList[0] = blueEyesCat;
        for (CatWithToString cat : catsList) {
            System.out.println(cat.toString());
        }

        Boolean[] booleanList = new Boolean[3];
        boolean[] booleanPrimitiveList = new boolean[3];
        //...
    }
}
