import java.util.Scanner;
class product{
static void pro(float x,float y){
float pro = x*y;
System.out.println("product of two number is :"+ pro);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number :");
float a=sc.nextFloat();
System.out.println("Enter the second number :");
float b=sc.nextFloat();
 pro(a,b);
}
}