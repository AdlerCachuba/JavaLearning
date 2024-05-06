package exercices.hackerrank;


//Task
//Given an integer,n , perform the following conditional actions:
//
//If n is odd, print Weird
//If n is even and in the inclusive range of  to , print Not Weird
//If n is even and in the inclusive range of  to , print Weird
//If n is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
//
//Input Format
//
//A single line containing a positive integer, n.
//

//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.
public class WeirdNotWeird {
    public static void main(String[] args) {

    }

    public static String isWeird(int n) {
        if (n % 2 != 0) {
            return "Weird";
        }
        if (n % 2 == 0 && (n >= 2 && n <= 5)) {
            return "Not Weird";
        }
        if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            return "Weird";
        }
        if (n % 2 == 0 && n > 20) {
            return "Not Weird";
        }
        return null;
    }
}
