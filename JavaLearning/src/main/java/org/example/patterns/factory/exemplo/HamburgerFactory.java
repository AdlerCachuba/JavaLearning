package org.example.patterns.factory.exemplo;

public class HamburgerFactory {

    //A lógica de negócio não está associado a factory, e sim a lógica de criação de objeto.
    public HambugerAbstract criaHamburger(String nomeDoHamburgerPedido) {

        if (nomeDoHamburgerPedido.equals("HamburgerDeBacon")) {
            return new HamburgerDeBacon();
        } else {
            return new HamburgerVegetariano();
        }
    }
}
