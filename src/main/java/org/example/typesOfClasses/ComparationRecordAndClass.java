package org.example.typesOfClasses;

public class ComparationRecordAndClass {
    public static void main(String[] args) {

        RecordClass recordClass = new RecordClass("NomeAdler",20);
        System.out.println(recordClass.name());//Pegamos o atributo name() sem o getter.
        System.out.println(recordClass.idade());//Pegamos o atributo idade() sem o getter.

        SameClassWithoutRecord sameClassWithoutRecord = new SameClassWithoutRecord("NomeAdler",20);
        System.out.println(sameClassWithoutRecord.getName()); //Aqui precisa do getter.

    }
}
