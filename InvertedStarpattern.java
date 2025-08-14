import java.util.Scanner;
class InvertedStarpattern{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the length of rectangle :");
int a =sc.nextInt();
for(int i =1;i<=a;i++){
for(int j =1;j<=a-i+1;j++){
System.out.print("*");
}
System.out.println();
}
/*
that was my logic
int b=a;
for(int i =1;i<=a;i++){
for(int j =1;j<=b;j++){
System.out.print("*");
}
b--;
System.out.println();
}
*/
}
}