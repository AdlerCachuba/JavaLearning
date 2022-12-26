package org.example;

public class MainClass {
    //JRE - Java Runtime Enviroment do computador chama os programas do seu computador.
    public static void main(String[] args) {
        //Porque é public o método main?
        //Porque esse método precisa ser chamado por outros lugares fora dessa classe
        //Se fosse private/protect o JRE não conseguiria executar
        //E também nem aparece a opção de executar a classe quando coloca private/protected

        //Porque static o método main?
        //Porque nós não vamos instanciar a classe main.
        //Por exemplo: as linhas abaixo não vão existir:
        //  MainClass mainClass = new MainClass();
        //  mainClass.main(args);
        //O design é feito para ser executado diretamente na classe,
        //Não vai ser chamado em uma instância da sua classe.

        //Porque void o método main?
        //Porque o programa é feito para executar, e não precisa retornar nada.
        //Quando é chamado esse método, ele executa, e termina.
        //E caso você tente mudar para retornar outra coisa, como String por exemplo: public static String main(String[] args) { return "Teste"}
        //Acontecerá um erro quando tentar executar:
        //Error: Main method must return a value of type void in class org.example.MainClass, please
        //define the main method as: public static void main(String[] args)

        //Porque main?
        //Colocar o main é uma regra, e esse nome não pode ser alterado.
        //Caso você tente mudar o nome main para outra coisa, acontecerá um erro como:
        //Error: Main method not found in class org.example.MainClass, please define the main method as:
        //public static void main(String[] args)

        //Porque String[] args no método main?
        //String[] args é um array de string que os argumentos podem ser passados.
        //Por exemplo, você pode usar um argumento e usar o programa.
        //Se você for no debug configurations, e na aba de Program Arguments
        //Você pode adicionar coisas ali, como por exemplo, vamos adicionar: sanremo
        //Se adicionarmos isso, e mandarmos printar o argumento 0, ele vai aparecer "sanremo"
        System.out.println(args[0]);
    }
}
