import java.util.Scanner;
class TypeCasting{
public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number :");
  int x=sc.nextInt();
  System.out.println("Enter the second number :");
  float y=sc.nextFloat();
//implict type casting : where it convert automatic from upper datatype
  System.out.println("after adding two number"+(x+y));
  
//explict type casting : where it converted by user 
 System.out.println("Enter the first number :");
  float a=sc.nextFloat();
System.out.println("it convert by user");
int b=(int) a;
System.out.println("after convert the number :"+b);
}
}