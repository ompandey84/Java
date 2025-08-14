import java.util.Scanner;

class Claculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float a = sc.nextFloat();

        System.out.println("Enter the second number:");
        float b = sc.nextFloat();
        
        // Consume the leftover newline character
        sc.nextLine(); 

        System.out.println("What do you want (+, -, *, /, %)? Choose any one:");
        String c = sc.nextLine();

        switch (c) {
            case "+":
                System.out.println("Sum of the two numbers is: " + (a + b));
                break;
            case "-":
                System.out.println("Subtraction of the two numbers is: " + (a - b));
                break;
            case "*":
                System.out.println("Multiplication of the two numbers is: " + (a * b));
                break;
            case "/":
                System.out.println("Division of the two numbers is: " + (a / b));
                break;
            case "%":
                System.out.println("Modulus of the two numbers is: " + (a % b));
                break;
            default:
                System.out.println("Wrong option chosen.");
        }
        
        sc.close();
    }
}