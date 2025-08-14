import java.util.Scanner;
class Factorial{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number that you find factorial :");
int a = sc.nextInt();
int i = 1;
int fact =1;
while(i<=a){
fact *= i;
i++;
}
System.out.println("factorial of " + a +" is "+ fact);
}
}