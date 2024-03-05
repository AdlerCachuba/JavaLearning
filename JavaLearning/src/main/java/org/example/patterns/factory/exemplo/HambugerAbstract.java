package org.example.patterns.factory.exemplo;

public abstract class HambugerAbstract implements HamburgerInterface {
    //Uma classe abstrata, que não é instanciável, ao implementar a interface não precisa do método preparar()
    String nome;
    Double peso;
    Double preco;
    Boolean vegetariano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}

