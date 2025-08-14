import java.util.Scanner;
class factorialnum{
static void fact(int x){
int fact =1;
for(int i = 1;i<=x;i++){
fact *=i;
}
System.out.println("factorial of number is :"+ fact);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int a=sc.nextInt();
 fact(a);
}
}