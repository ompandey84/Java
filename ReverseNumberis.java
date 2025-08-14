import java.util.Scanner;
class ReverseNumberis{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number :");
int a =sc.nextInt();
int last =0;
while(a>0){
/*
last = (last + (a%10)) * 10;
*/
int r = a%10;
last= last*10 + r;
a = a/10;
}
System.out.println(last);
}
}