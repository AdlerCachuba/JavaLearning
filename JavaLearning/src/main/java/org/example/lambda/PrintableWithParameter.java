package org.example.lambda;

@FunctionalInterface
public interface PrintableWithParameter {
    //Um método abstrato é um método que não tem implementação.
    //Quando temos uma interface com apenas UM método abstrato, ela é chamada de Functional Interface

    //É uma boa prática fazer isso,
    //Porque o compilador vai forçar que você tenha apenas um método abstrato na sua interface
    //Sendo assim, é impossível criar outro método sem implementação aqui.
    String print(String stuff);


    //E se nós tivermos uma interface com mais de um método abstrato?
    //Então não será uma FunctionalInterface, e o LAMBDA nas implementações irá dar erro.
    //Dizendo que não sabem qual função utilizar

    //Descomentar esse código e ira gerar os erros.
    //void doThing();
}
