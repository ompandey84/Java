import java.util.Scanner;
class LogicalOperators{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number :");
 float a= sc.nextFloat();
 System.out.println("enter the number :");
 float b= sc.nextFloat();
 System.out.println("enter the number :");
 float c= sc.nextFloat();

//logical &&  
 if(a == b && b == c) System.out.println(" everyone was equal are equal");
 else if (a < b && a < c) System.out.println("smallest number is" + a);
 else if (b < a && b < c) System.out.println("smallest number is" + b);
 else System.out.println("smallest number is" + c);

 if (a > b && a > c) System.out.println("greatest number is" + a);
 else if (b > b && b > c) System.out.println("greatest number is" + a);
 else System.out.println("greatest number is" + c);

//logical || (OR)
 System.out.println((3>2) || (3>5));  
 
//Logical ! (NOT)
System.out.println(!(3>2));
}
}
