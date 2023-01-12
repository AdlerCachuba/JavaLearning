package org.example.typesOfClasses.Abstract;

public abstract class Animal {
    //AbstractClass não podem ser instanciadas, mas pode ser ter subclasses que extends Animal que são instanciadas
    int idade;
    String nome;

    public void fazerBarulho(){
        System.out.println("Barulho de animal");
    };

    public void printName(){
        System.out.println("My name is:" + nome);
    }
}
