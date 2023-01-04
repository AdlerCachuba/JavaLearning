package org.example.typesOfClasses;

public record RecordClass(String name, int idade) {
    //Uma Record é um tipo no java, assim como class, enum.
    //Ele cria automaticamente esses métodos com base nos parametros, que serão os atributos da Record.
    //toString
    //hashCode
    //equals
    //constructor
    //get atributos (name/idade)

    //Uma record não pode ter outros atributos que não sejam definidos nos parametros da criação (name,idade)
    //private String nomeError;

    //Uma record não pode extender nenhuma classe

    //Uma record já cria o método construtor usando os parametros como obrigatório
    //Como se fosse exatamente isso:
    //    public RecordClass(String name, int idade) {
    //        this.name = name;
    //        this.idade = idade;
    //    }

    //Uma record pode ter constantes dentro dela, como por exemplo:
    public static final String STRING_DEFAULT = "Teste";

    //E podemos ter métodos normal nela
    public String nameUpperCase(){
        return name.toUpperCase();
    }

}
