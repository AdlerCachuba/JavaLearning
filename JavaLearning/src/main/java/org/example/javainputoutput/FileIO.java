package org.example.javainputoutput;

import java.io.*;

public class FileIO {

    public static void main(String[] args) {

        String[] names = {"Adler","Katarina","Juggernaut"};
        try {
            BufferedWriter writerRelative = new BufferedWriter(new FileWriter("output.txt")); //Cria dentro do projeto o arquivo, Relative Path.
            BufferedWriter writerAbsolute = new BufferedWriter(new FileWriter("C:\\Teste\\output.txt"));//Cria no lugar desejado, Absolute Path

            //Ele cria, e se já tiver um arquivo, ele vai sobrepor o arquivo.
            writerRelative.write("Writing to a file");
            writerRelative.write("\n In Another line"); // \n usado para pular linhas no arquivo

            //Percorrer uma lista e adicionar todos os nomes na lista:
            for (String name : names){
                writerRelative.write("\n" + name);
            }
            writerRelative.close();//Precisa fechar o Writer para salvar as informações.


        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt")); //O nome do arquivo
            System.out.println(reader.readLine());//Ler uma linha apenas

            //Exibir todas as linhas do arquivo percorrendo pelas linhas.
            String linha;
            while((linha=reader.readLine()) != null){ //Se tiver uma linha null, significa que chegamos no fim do arquivo
                System.out.println(linha);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
