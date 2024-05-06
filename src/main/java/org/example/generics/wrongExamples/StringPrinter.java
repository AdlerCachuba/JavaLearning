package org.example.generics.wrongExamples;

public class StringPrinter {

    String thingToPrint;

    public StringPrinter(String thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print (){
        System.out.println(thingToPrint);
    }
}
