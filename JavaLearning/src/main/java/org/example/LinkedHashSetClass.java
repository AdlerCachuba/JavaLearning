package org.example;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {

        //Uma LinkedHashSet é menos rápida que uma HashSet, e mais rápida que a TreeSet.
        //A principal difirença é que a ordem que é adicionado os elementos é respeitada.
        //Enquanto no HashSet não
        Set<String> names = new LinkedHashSet<>();
        names.add("Ciclano");
        names.add("Beltrano");
        names.add("Zed");
        names.add("Adler");
    }
}
