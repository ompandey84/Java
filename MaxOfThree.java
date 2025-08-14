import java.util.Scanner;
class MaxOfThree{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the first number :");
 float a= sc.nextFloat();
System.out.println("enter the second number :"); 
float b =sc.nextFloat();
 System.out.println("enter the third number :");
float c = sc.nextFloat();
 if(a>b && a>c){
  System.out.println("largest number is : "+a);
}
else if(b>a && b>c){
  System.out.println("largest number is : "+b);
}
else{
System.out.println("largest number is : "+c);
}
}
}