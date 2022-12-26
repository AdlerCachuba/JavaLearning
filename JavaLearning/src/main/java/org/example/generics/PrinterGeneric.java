package org.example.generics;

                //Colocamos o tipo do parametro como por exemplo: T.
public class PrinterGeneric<T> {
    T thingToPrint;

    public PrinterGeneric(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print (){
        System.out.println(thingToPrint);
    }

}
