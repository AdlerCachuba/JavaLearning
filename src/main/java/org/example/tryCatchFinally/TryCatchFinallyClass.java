package org.example.tryCatchFinally;

public class TryCatchFinallyClass {

    public static void main(String[] args) {

        try {
            int myInt = Integer.parseInt("errorint");
        }
        //Perceba que no Catch é apenas uma barra para fazer a condição "OR", e só no final colocamos o nome da variavel.
        catch (NumberFormatException | NullPointerException e){
            System.out.println("Aconteceu um erro: " + e);// A variavel e pode ser tanto NumberFormatException quanto NullPointerException.
        }
        finally {
            //Esse bloco sempre será executado INDEPENDENTE do que acontecer acima.
            System.out.println("Finally block always executed.\n\n");
        }

        //Por exemplo, vou fazer um try que retorna, e mesmo assim, vai executar o bloco do finally
        //Ele vai executar TUDO que tem pra executar, e antes do return, vai executar o bloco finally e voltar.
        try{
            System.out.println("Acontecimento 0");
            System.out.println("---------------");
            System.out.println("Acontecimento 1");
            System.out.println("---------------");
            return;
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("Acontecimento 2 - Finally blocks always executed.\n\n"); //E aí então, volta para o return
        }

        //Como o tryCatchFinally acima usa o "return", isso faz com que a execução pare alí.
        //Sendo a última linha do sistema a ser executada.
        //Logo, o print abaixo não é exibido
        System.out.println("End main block. :( i'm invisible "); //Fim da execução do main.
    }
}
