import java.util.Scanner;

class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients for the equation (ax^2 + bx + c = 0)");
        System.out.print("Enter a: ");
        // Use double to allow for any real number input
        double a = sc.nextDouble(); 

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Use double for the discriminant to maintain precision
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two real roots:");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (discriminant == 0) {
            // Use floating-point division by making 2*a a double
            double root = -b / (2.0 * a); 
            System.out.println("The equation has one real root:");
            System.out.println("x = " + root); // Correctly printing the result
        } else {
            // Correctly calculate the real and imaginary parts separately
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2.0 * a);
            System.out.println("The equation has two complex roots:");
            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
        }
        
        // Good practice to close the Scanner object
        sc.close();
    }
}