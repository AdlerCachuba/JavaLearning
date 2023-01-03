package org.example;

public class EqualsEigualigualClass {
    public static void main(String[] args) {

        String stringOne = new String("hello"); //cria um objeto String, e aponta para um lugar na memoria
        String stringTwo = new String("hello"); //cria um objeto String, e aponta para um novo lugar na memoria
        if(stringOne==stringTwo){ //False
            //Porque o JAVA olha a localização da memória desses dois objetos
            System.out.println("Ambas strings são iguais");
        }
        else {
            System.out.println("São strings diferentes");
        }

        //A mesma coisa pro Double.
        Double doubleTest = 3.0;
        Double doubleTest2 = 3.0;
        if(doubleTest == doubleTest2){ //FALSE
            System.out.println("Sao iguais os doubles");
        }
        else{
            System.out.println("São double's diferentes");
        }

        //Tipos primitivos olham exatamente o valor que está armazenado na variavel
        //Quando classes, olhamos aonde está apontando na memória
        //Entao para tipo primitivos sempre vai funcionar o ==
        double primitiveDoubleTest = 3.0;
        double primitiveDoubleTest2 = 3.0;
        if(primitiveDoubleTest == primitiveDoubleTest2){ //TRUE
            System.out.println("Sao iguais");
        }
        else{
            System.out.println("São diferentes");
        }

        //Para funcionar para essas Classes, basta usar o método Equals.
        if(stringOne.equals(stringTwo)){ //true
            System.out.println("Ambas strings são iguais");
        }
        else {
            System.out.println("São strings diferentes");
        }

        //E para uma Classe que eu criei, como por exemplo: Cat
        //Bom, precisamos implementar o método Equals (Botão direito, generate, Equals and HashCode)
        //Com isso, é possível utilizar o equals da mesma maneira.
        Cat cat1 = new Cat("Pat",3);
        Cat cat2 = new Cat("Pat",3);
        if(cat1.equals(cat2)){//True
            System.out.println("Os gatos são iguais");
        }
        else {
            System.out.println("Os gatos não são iguais.");
        }

        //Mas se eu não implementar o método Equals, ele dará false.
        CatWithoutEquals catWithoutEquals1 = new CatWithoutEquals("Cat",1);
        CatWithoutEquals catWithoutEquals2 = new CatWithoutEquals("Cat",1);
        if(catWithoutEquals1.equals(catWithoutEquals2)){//False
            System.out.println("Os gatos sem equals são iguais");
        }
        else {
            System.out.println("Os gatos sem equals não são iguais!");
        }

        //Mas uma curiosidade do Java, é que se você criar uma String dessa maneira
        String stringBoom1 = "hello";
        String stringBoom2 = new String("hello");
        if (stringBoom1.equals(stringBoom2)){
            System.out.println("Usando o equals dá certo, como deve ser.");
        }
        String strinBoom3= "hello";
        if(stringBoom1==strinBoom3){
            System.out.println("Usando o == também funciona");
        }// O Java irá fazer com que a stringBoom1 armazene um lugar na memória
        //E fará com a stringBoom2 também aponte para esse mesmo lugar na memõria
        //Para economizar processamento.
        //E com isso, sim, elas são ==, porque ambas apontam pro mesmo endereço de memória.
        //Mas se iniciarmos uma String da outra forma:
        String testeExplication = new String("Teste");
        //Dessa maneira irá apontar para um endereço de memória único.

        //Com isso podemos concluir que, quando vamos utilizar diversas Strings repetidas
        //É melhor utilizar o método mais rápido de criar elas
        //Exemplo: String teste = "teste";


    }
}
