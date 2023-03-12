package org.example.misc;

public class Regex {
    public static void main(String[] args) {
        String test = "Welcome To The Night";
        String testInsideMatch = "(.*)Wel(.*)";
        System.out.println(test.matches(testInsideMatch));
        //Regex faz com que o (.*) busque em qualquer lugar, seja no começo ou no final de qlqr palavra

    }
}
