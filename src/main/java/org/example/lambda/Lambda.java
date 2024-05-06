package org.example.lambda;

public class Lambda {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.print();
        //Assim ele irá executar a função print

        //Usando a função que passa como parametro uma interface.
        printThing(tiger);

        //Agora com o lambda...
        //Temos uma classe implementando o Printable
        //O Lambda permite passar uma implementação específica
        //Por exemplo:

//        printThing(
//            public void print() {
//                System.out.println("Rawr");
//            }
//        );

        //O Lambda não precisa de método acesso, então  public é removido.
        //O Lambda não precisa de retorno, o compilador consegue descobrir automaticamente, então o void é removido.
        //O Lambda não precisa de um nome do método, então não precisa do print

//        printThing(
//            () {
//                System.out.println("Rawr");
//            }
//        );

        //Os () são os parametros
        // E o restante é o método da função print
        // E para transformar esse método em lambda basta adicionar a arrow function ->

        printThing(
            ()-> {
                System.out.println("Rawr");
            }
        );

        //Quando conseguimos colocar tudo em uma linha, não precisamos das {} no lambda

        printThing(() -> System.out.println("Rawr"));


        //Nós ainda podemos criar um objeto da interface usando o Lambda, e passar ele por parametro.
        Printable printable = () -> System.out.println("Rawr");
        printThing(printable);

        // O Lambda PERMITE você transformar implementações de métodos em objetos
        //Como definimos que o parametro é String na interface, não precisa colocar que é uma String
        //E tem o retorno que é uma String
        PrintableWithParameter printableWithParameter = (s) -> {
            System.out.println("Rawr" + s);
            return "Rawr" + s;
        };
        printThingWithParameter(printableWithParameter);

        //Mas também podemos fazer de uma forma mais simples.
        //O java interpreta da mesma maneira, dizendo que vai retornar
        PrintableWithParameter printableWithParameter2 = (s) -> "Rawr" + s;


    }

    static void printThing(Printable thing){
        thing.print();
    }

    static void printThingWithParameter(PrintableWithParameter thing){
        thing.print("!");
    }

}
