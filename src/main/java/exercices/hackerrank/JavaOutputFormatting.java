package exercices.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class JavaOutputFormatting {
    //Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
    //
    //To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
    //
    //Input Format
    //
    //Every line of input will contain a String followed by an integer.
    //Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
    //
    //Output Format
    //
    //In each line of output there should be two columns:
    //The first column contains the String and is left justified using exactly  characters.
    //The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes

    //Sample Input
    //
    //java 100
    //cpp 65
    //python 50


    //Sample Output
    //
    //================================
    //java           100
    //cpp            065
    //python         050
    //================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d\n", s1, x);
        }
        System.out.println("================================");

    }

//https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax/
    //First s1 which is formatted using %-15s. The % means that what follows is an argument that will be formatted. Then follows a - resulting in left alignment. 15 fills the string up to a length of 15 characters (adding spaces at the end). Finally the s means, that you are formatting a string.
    //
    //Second x which is formatted using %03d. Here the 0 is the fill character, meaning that, if necessary, zeros are added. The 3 is again the width, meaning the fill character 0 is added as many times as necessary to make it 3 digits long (this time at the beginning). Finally d means, that a integer is formatted.
    
}
