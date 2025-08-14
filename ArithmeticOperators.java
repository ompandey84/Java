import java.util.Scanner;
class ArithmeticOperators{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number :");
 float a= sc.nextFloat();
 System.out.println("enter the number :");
 float b= sc.nextFloat();

//binary Operators
 System.out.println(" sum of two number is : "+ (a+b));
 System.out.println(" substraction of two number is : "+ (a-b));
 System.out.println(" multipication of two number is : "+ (a*b));
 System.out.println(" devision of two number is : "+ (a/b));
 System.out.println(" modulas of two number is : "+ (a%b));

//unary Operators
System.out.println(" post increment by one is : "+ (a++));
System.out.println(" pre increment by one is : "+ (++a));
System.out.println(" post decrement by one is : "+ (a--));
System.out.println(" pre decrement by one is : "+ --a);

}
}