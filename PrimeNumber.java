import java.util.Scanner;
class PrimeNumber{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number :");
 int a= sc.nextInt();
if(a>2){
 for(int i =2; i<=a;i++){
  if(a%i==0){
  System.out.println("a is a non-prime number is : "+a);
break;
}
else 
 System.out.println("a is a prime number is : "+a);
}
}
else System.out.println("a is a prime number is : "+a);
}
}