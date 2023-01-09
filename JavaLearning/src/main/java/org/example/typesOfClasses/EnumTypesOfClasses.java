package org.example.typesOfClasses;

public enum EnumTypesOfClasses {

    WARRIOR("Guerreiro com 3 de força", 3),
    SORC("Mago com 2 de inteligencia", 2),
    ARCHER("Arqueiro com 3 de agilidade", 3),
    DRUID("Druida com 3 de inteligencia", 3);

    //Final faz com que seja imuntável os valores definidos.
    final String description;

    final int power;

    EnumTypesOfClasses(String description, int power){
        this.description=description;
        this.power = power;
    }

}
