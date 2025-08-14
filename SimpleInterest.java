import java.util.Scanner;
class SimpleInterest{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the principal_amount :");
 float principal_amount= sc.nextFloat();
System.out.println("enter rate of change :"); 
float rate =sc.nextFloat();
 System.out.println("enter the time :");
float time = sc.nextFloat();
double Simple_Interest = (principal_amount*rate*time)/100;
System.out.println("the Simple Interest is :" + Simple_Interest);
}
}