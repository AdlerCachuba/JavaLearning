package org.example.patterns.factory;

public class AnimalFactory {
    //Imaginando o contexto que temos a criação de animais, e todo animal recebe uma coleira.
    //Conforme o animal, cada coleira é escolhida, por exemplo, damos coleira de couro para gatos, e coleira de metal para cachorros
    //Qual o objetivo da factory?

    //Não colocar a responsabilidade nos construtores, sendo assim, se essa regra de todo animal precisa de uma coleira foi uma coisa nova
    //Eu posso colocar essa responsabilidade na minha factory de animais, e então, posso atribuir a coleira ao animal
    //Sem precisar mudar todos os construtores, sem ter que alterar as regras de criação de cada animal.

    //Sendo assim, se posteriormente eu tiver um animal ovelha, que recebe uma coleira de algodão, eu posso atribuir isso na minha factory
    //E se por ventura um dia a regra das coleiras mudar, eu não vou ter que ir em cada classe animal alterar a regra.

    //Em suma: Esconder a complexidade de criação de um objeto.


}
