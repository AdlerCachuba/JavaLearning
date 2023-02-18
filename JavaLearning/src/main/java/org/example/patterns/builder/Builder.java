package org.example.patterns.builder;

public class Builder {

    //Por exemplo, temos uma classe banco com vários atributos.
    class BD{
        String name;
        String url;
        String user;
        String password;
        String option2;
        String option3;
    }

    // A ideia de criar um builder é exatamente quando vamos ter um construtor com coisas obrigatórias, e coisas opcionais.
    // Pensando que nome,url,user e password como obrigatórios, e as outras opções como opcionais,
    // A ideia do builder é exatamente para não ter diversos construtores para cada uma, digamos que as vezes recebe opcao2, as vezes opcao2 e 3..

    class BDBuilder{
        String name;
        String url;
        String user;
        String password;
        String option2;
        String option3;

        public void build(        String name,String url,String user,String password,String option2,String option3){
            if (option2!=null){
                //faz tal coisa
            }
            // e no final devolve um BD
        }
    }
}
