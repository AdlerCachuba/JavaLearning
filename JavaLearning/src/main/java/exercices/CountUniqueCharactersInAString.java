package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class CountUniqueCharactersInAString {
    //Given a string s, find the lenght of a String without repeating characters.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(countUniqueCharInString(inputString));
    }

    public static Integer countUniqueCharInString(String inputString) {
        char[] charArrayInput = inputString.toCharArray();
        ArrayList<String> wordsUsed = new ArrayList<>();
        for (char letter : charArrayInput) {
            if (!wordsUsed.contains(String.valueOf(letter))) {
                wordsUsed.add(String.valueOf(letter));
            }
        }
        return wordsUsed.size();
    }


}
