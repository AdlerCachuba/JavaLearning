package org.example.typesOfClasses;

import org.example.equals.Cat;

public class PrimitivesDataTypesClass {
    public static void main(String[] args) {
        //Temos oito tipos primitivos no java:
        //byte, short, int, long, float, double, bolean, char

        // -128 até 127
        byte myByte = 8;
        byte myByteChar = 'c'; // Podemos colocar letras também, e irá associar ao valor da tabela ASC II
        System.out.println(myByteChar); // 99 o valor do c na tabela ASC II
        //1byte = 8 bits
        //O tipo primitivo byte também não permite você colocar mais de uma letra, ou usar aspas duplas:
        //Os exemplos abaixo irão gerar erro:
        //byte myByteChar2 = "c";
        //byte myByteChar3 = "ca";

        // -32,768 até 32,767
        short myShort = 1234;

        // -2,147,483,648 até -2,147,483,647
        int myInt = 2879;

        // -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807
        long myLong = 12312;
        long myLongHuge = 21412515111l; //Colocamos o l para números mais longos.

        //O float possui aproximadamente 6 casas decimais de precisão
        float myFloat = 5.3f;

        //O double possui aproximadamente 15 casas decimais de precisão
        double myDouble = 12;

        // true ou false
        boolean myBoolean = false;
        boolean moreThan1000 = (myInt>1000);

        //One character = CHAR
        char myChar = 'W';
        //Aqui gera erro porque o Java entende que aspas duplas("") significa que vai vir uma String.
        //char myChar2 = "C";

        //Outro caso importante, é a comparação com o null.
        //Tipos primitivos não podem ser nulos, logo a linha abaixo não é possível executar:
        //int numeroInt = null;

        //Porem quando associamos a um Objeto, é possível, como por exemplo:
        Integer numeroIntegerNull = null;
        Cat gatoNull = null;


        System.out.println(gatoNull == null);
    }
}
