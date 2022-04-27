
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

public class Automorphic {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        //last digits of square of given number is the given number itself
        // Write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String givenNumber = n+"";
        String square = n*n+"";
        String result = square.substring(square.length()-givenNumber.length(),square.length());  
        if(result.equals(givenNumber))
        {
            System.out.print("Automorphic");
        }
        else
        {
            System.out.print("Not");
        }  
        in.close();    
    }
}
