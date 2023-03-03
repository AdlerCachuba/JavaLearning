package org.example.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

    //Criação de um array com 7 elementos
    ArrayList<Integer> listNumber = new ArrayList<>(Arrays.asList(1,2,4,5,7,9,11));

    //Digamos que eu quero buscar o número 9 dentro do meu array.
    //Uma busca binária sempre estará considerando um array ordenado, assim como o criado.
    //Então iremos buscar o elemento do meio, o número 5, ele não é o meu número que eu quero
    //Então nós desconsideramos tudo o que está pra trás dessa posição do array, e buscamos pra frente.
    //E vai buscar da mesma maneira feita anteriormente.
    //Agora tem 3 elementos: 7,9,11 no array para buscar.
    //Ele vai buscar no meio do array, o número 9. Então é esse, OK, correto.

    //E se o número não estiver no array? Por exemplo, número 6.
    //Ele vai fazer a mesma coisa, buscando da mesma forma. acha o 5, deopis vai pro 7, e verifica pra trás.
    //E não tem o seis. Então vai retornar o -1.

        int[] intsNumbers = {1,2,4,5,7,9,11};
        System.out.println(binarySearch(intsNumbers,9));

        //A Classe ARRAYS já possui o método de binarySearch, e faz exatamente a mesma coisa.
        System.out.println(Arrays.binarySearch(intsNumbers,9));
        //O Java não faz você recriar a roda, e muitas coisas já estão prontas
        //Mas é necessário saber como as coisas funcionam na prática.
    }

    private static int binarySearch(int[] numbers, int numberToFind){
        int low = 0; //first element of array
        int high = numbers.length-1; //last element of array

        while(low<=high){
            int middlePosition = (low+high)/2;  //average of low and high
            int middleNumber = numbers[middlePosition];
            if(numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middlePosition-1; //vai considerar a metade pra trás do array
            }else{
                low = middlePosition+1; //vai considerar metade pra frente do array
            }
        }
        return -1;
    }


}
