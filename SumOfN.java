import java.util.Scanner;
class SumOfN{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number :");
 int a= sc.nextInt();
if(a>1){
int sum = 1;
 for(int i =2; i<=a;i++){
 sum +=i; 
}
System.out.println("Sum of "+a+" numbers is :"+sum);
}
else System.out.println("a is a prime number is : "+a);
}
}