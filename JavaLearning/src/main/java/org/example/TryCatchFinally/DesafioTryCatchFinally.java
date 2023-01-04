package org.example.TryCatchFinally;

public class DesafioTryCatchFinally {
    public static void main(String[] args) {
        System.out.println(printNumberTryCatchFinally());
    }

    //Por exemplo, com esse método printNumberTryCatchFinally, o que deve ser retornado?
    private static int printNumberTryCatchFinally(){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
    //A resposta é 3.
    //Porque quando usamos o try catch finally, o FINALLY sempre será o último bloco a ser executado.
    //Se for uma função que possui um retorno e tenha o try catch finally,
    //Mesmo que dentro do try ou do catch diga para retornar um valor X, e caia nessa execução,
    //Antes de retornar o valor da função, ele vai executar o bloco finally.
}
