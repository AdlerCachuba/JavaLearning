package org.example.lists;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {

        //Hashmap serve para criar um mapeamento entre 2 tipos, no qual o primeiro é a CHAVE e o segundo o VALOR.
        //Não aceita tipos primitivos.

        //Exemplo:
        //Na linha abaixo descreve que o nome do funcionário está atrelado a um id:
        //o Nome é a chave, e o id é o valor.
        HashMap<String, Integer> employerIds = new HashMap<>();

        employerIds.put("John", 123);
        employerIds.put("Adler", 321);
        employerIds.put("Stranger", 666);

        //Vai mostrar todos: {Stranger=666, Adler=321, John=123}
        System.out.println(employerIds);

        //Se eu quiser saber o ID de quem só se chama Adler. : 321
        System.out.println(employerIds.get("Adler"));

        //Se eu quiser saber se dentro desse HashMap tem alguma chave com Adler : true
        System.out.println(employerIds.containsKey("Adler"));

        //Se possui algum valor dentro do HashMap : true
        System.out.println(employerIds.containsValue(321));

        //Mas e se eu quiser alterar algum valor no HashMap?
        employerIds.replace("Adler", 333);
        System.out.println(employerIds);

        //Mas digamos que eu escrevi o nome errado do "Adler"
        employerIds.replace("Adler3", 333);//Não faz nada
        System.out.println(employerIds);
        //O Replace só serve para SUBSTITUIR quando existir.
        //Se não encontrou o objeto para dar replace dentro do HashMap, não irá fazer nada.

        //O putIfAbsent serve para colocar caso não existe
        employerIds.putIfAbsent("Adler", 222);
        System.out.println(employerIds);
        //No caso, o Adler já existe alí dentro, então não irá fazer nada.

        //Mas e se colocamos algum valor dentro do HashMap que queremos remover?
        employerIds.remove("Adler");
        System.out.println(employerIds);
    }
}
