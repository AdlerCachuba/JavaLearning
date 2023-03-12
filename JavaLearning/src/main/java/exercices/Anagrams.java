package exercices;

import java.util.Arrays;

public class Anagrams {

    public boolean stringsAnagrams(String name, String nameCompared){
        char[] nameChar = name.toCharArray();
        char[] nameComparedChar = nameCompared.toCharArray();
        Arrays.sort(nameChar);
        Arrays.sort(nameComparedChar);
        if (Arrays.equals(nameChar,nameComparedChar)){
            return true;
        }else {
            return false;
        }
    }
}
