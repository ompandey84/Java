import java.util.Scanner;
class FunctionParameterr{
static int Num(int x, int y){
int sum = x+y;
return sum;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number :");
int a =sc.nextInt();
System.out.println("enter the number :");
int b =sc.nextInt();
   System.out.println(Num(a,b));
}
}