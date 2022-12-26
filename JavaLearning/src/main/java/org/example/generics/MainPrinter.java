package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class MainPrinter {

    public static void main(String[] args) {
        PrinterGeneric<Integer> printerGeneric = new PrinterGeneric<>(23);
        printerGeneric.print();

        PrinterGeneric<Double> doublePrinterGeneric = new PrinterGeneric<>(23.5);
        doublePrinterGeneric.print();

        //Um ArrayList de Object é um arraylist que aceita qualquer Objeto
        //Mas é perigoso, pode gerar muitos erros:
        ArrayList<Object> listaGenerica = new ArrayList<>();
        listaGenerica.add(new Double(2.0));
        listaGenerica.add(new Integer(1));

        //Esse exemplo abaixo geraria um erro por exemplo, porque tentaria pegar um Integer e fazer o Cast pra Double.
        //Double valorInseridoNaListaGenerica = (Double) listaGenerica.get(1);

        //E mesmo se fizermos as conversões, dará um erro da mesma forma.
        //Double valorInseridoNaListaGenerica = Double.valueOf((Double) listaGenerica.get(1));

    }

    //Podemos fazer métodos genéricos também, por exemplo
    //Vamos fazer um método que recebe alguma palavra e printa ela com !!! no final.
    public static <T> void printSomething(T something){
        System.out.println(something + "!!!");
    }

    //Se eu quiser imprimir uma lista e eu não sei o tipo da lista?
    //Dessa maneira eu consigo imprimir qualquer tipo:
    private static void printList(List<?> myList){
        System.out.println(myList);
    }
    //Se eu usar List<Object> no paramêtro não dará certo.
    //Porque integer é subclasse de object, mas uma lista de integer não é uma subclasse de lista de object.
    //E na hora de executar em uma lista de integers o método printList em daria erro.
}

