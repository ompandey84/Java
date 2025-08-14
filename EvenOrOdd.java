import java.util.Scanner;
class EvenOrOdd{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number :");
 int a= sc.nextInt();
if(a>1){
if(a%2==0){
System.out.println("it is a even number :"+a);
}
else System.out.println("it is a odd number is : "+a);
}
else System.out.println("it is not a even or not a odd number : "+a);
}
}