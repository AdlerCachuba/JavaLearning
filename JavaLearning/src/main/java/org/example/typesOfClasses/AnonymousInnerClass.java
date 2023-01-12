package org.example.typesOfClasses;

import org.example.Cat;
import org.example.typesOfClasses.Abstract.Dog;

public class AnonymousInnerClass {
    public static void main(String[] args) {


        //Uma AnonymousInnerClass é uma subclasse de uma classe, que existe apenas um objeto.
        //E dentro dessa subclasse a gente consegue implementar métodos ou coisas especiais apenas para esse objeto.

        //Por exemplo, temos a classe cachorro, que faz 'au'
        Dog novoDog = new Dog();
        novoDog.fazerBarulho();

        //Mas se eu quero criar apenas um único cachorro especial que faça algo diferente?
        //Nós usamos a AnonymousInnerClass
        Dog dogEspecial = new Dog(){
            @Override //Funciona com ou sem o @Override, quando usado, a gente tá sobrescrevendo o do método pai.
            public void fazerBarulho() {
                System.out.println("EU sou um cachorro especial e único, e eu posso falar.");
            }
            public void soltarRaioLaser() {
                System.out.println("Posso implementar novos métodos ");
                System.out.println("Mas como esses métodos não estão na classe pai, eu não posso utilizar.");
            }
        };
        dogEspecial.fazerBarulho();
        //dogEspecial.soltarRaioLaser(); Não funciona.

    }
}
