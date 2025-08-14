import java.util.Scanner;
class RelationalOperators{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number :");
 float a= sc.nextFloat();
 System.out.println("enter the number :");
 float b= sc.nextFloat();

 if(a == b) System.out.println(" both are equal");
 else if (a != b) System.out.println((a != b));
 else if (a < b) System.out.println((a < b));
 else if (a > b) System.out.println((a > b));
 else if (a <= b) System.out.println((a <= b));
 else if (a >= b) System.out.println((a >= b));
 else System.out.println(" None of the above");

}
}
