import java.util.Scanner;

class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String x = sc.nextLine();
        System.out.println("First string is: " + x);
        
        String y = "hello world!";
        System.out.println("Second string is: " + y);
        
        // length() method
        System.out.println("\nLength of the first string is: " + x.length());
        
        // toUpperCase() method (Corrected name)
        System.out.println("Uppercase version of the first string is: " + x.toUpperCase());
        
        // toLowerCase() method (Corrected name)
        System.out.println("Lowercase version of the first string is: " + x.toLowerCase());
        
        // indexOf() method
        System.out.println("Index of 'world' in the second string is: " + y.indexOf("world"));
        
        // concat() method (Corrected name)
        System.out.println("Concatenation of the two strings is: " + x.concat(y));

        //CharAt methods
        System.out.println(y.CharAt(4));

        //Replace method
        String str = y.replace('h','H');
        System.out.println(str);

        sc.close();
    }
}