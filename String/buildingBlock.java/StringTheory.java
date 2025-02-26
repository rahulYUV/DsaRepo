import java.util.Arrays;
import java.util.Scanner;

public class StringTheory {
    public static void main(String[] args) {
        // String Comparison
        stringComparison();
        
        // String Concatenation
        stringConcatenation();
        
        // String Operations
        stringOperations();
        
        // Mutable Strings (StringBuffer & StringBuilder)
        mutableStrings();
        
        // User Input Handling
        userInputHandling();
    }
    
    // Method to demonstrate string comparison
    public static void stringComparison() {
        String s1 = "Java";
        String s2 = "Java";
        char[] cArr = {'J', 'a', 'v', 'a'};
        String s3 = new String(cArr);
        
        // Comparing using equals()
        if (s1.equals(s3)) {
            // System.out.println("They are same");
        } else {
            // System.out.println("Not same");
        }
        
        String b1 = "Java";
        String b2 = new String("Java");
        
        // Comparing using == (reference comparison)
        if (b1 == b2) {
            // System.out.println("They are correct");
        } else {
            // System.out.println("Not true");
        }
        
        // Comparing content using equals()
        if (b1.equals(b2)) {
            // System.out.println("Equal content");
        } else {
            // System.out.println("Content not equal");
        }
    }
    
    // Method to demonstrate string concatenation
    public static void stringConcatenation() {
        String a = "Java";
        String b = "Script";
        String c = a + b; // Using + operator
        String d = a.concat(b); // Using concat() method
        
        // System.out.println(c.equals(d));
    }
    
    // Method to demonstrate various string operations
    public static void stringOperations() {
        String st = "ISHWAR,CHANDRA,VIDYASAGAR";
        
        // System.out.println(st.toLowerCase());
        // System.out.println(st.trim());
        // System.out.println(st.charAt(5));
        // System.out.println(st.length());
        // System.out.println(st.contains("A"));
        // System.out.println(st.contains("SAGAR"));
        // System.out.println(st.lastIndexOf("I"));
        // System.out.println(st.isEmpty());
        
        // Splitting string based on 'V'
        String[] arr = st.split("V");
        // System.out.println(Arrays.toString(arr));
    }
    
    // Method to demonstrate mutable strings
    public static void mutableStrings() {
        // Using StringBuffer
        StringBuffer sb = new StringBuffer("Suraj Mall");
        sb.append(" Boshling"); // Appending
        sb.delete(1, 8); // Deleting a portion
        
        // Using StringBuilder
        StringBuilder sb2 = new StringBuilder("Java");
        sb2.append(" iOS JavaScript");
        sb2.append(" new");
    }
    
    // Method to handle user input
    public static void userInputHandling() {
        Scanner sc = new Scanner(System.in);
        
        // Taking an integer input
        // System.out.println("Enter an Integer: ");
        // int num = sc.nextInt();
        // System.out.println("The int is: " + num);
        
        // Taking a string input
        // System.out.println("Enter a String: ");
        // String input = sc.next();
        
        sc.nextLine(); // Handling buffer problem
        
        // Taking a full line input
        // System.out.println("Enter a full line of text: ");
        // String line = sc.nextLine();
        // System.err.println(line); // Printing in red
        
        sc.close();
    }
}

/*
Assignment:
1. Write a program to compare two strings ignoring case sensitivity.
2. Implement a function that reverses a given string.
3. Write a method to check if a given string is a palindrome.
4. Create a program that counts the occurrences of each character in a string.
5. Implement a function to remove duplicate characters from a string.

Interview Questions:
1. What is the difference between `==` and `.equals()` in Java?
   - `==` compares memory references, while `.equals()` compares the actual content of strings.

2. Why are strings immutable in Java?
   - Strings are immutable for security, synchronization, and performance reasons. It helps in caching, avoids memory leaks, and prevents accidental changes.

3. What is the difference between `String`, `StringBuffer`, and `StringBuilder`?
   - `String`: Immutable, slow for modifications.
   - `StringBuffer`: Mutable, thread-safe but slower.
   - `StringBuilder`: Mutable, not thread-safe but faster.

4. How does `intern()` method work in Java?
   - `intern()` ensures that strings with the same content share the same reference in the string pool, optimizing memory usage.
*/
