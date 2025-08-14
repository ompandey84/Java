import java.util.Scanner;
class EqualAllForm{
public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number :");
  int x=sc.nextInt();
  System.out.println("first number after intializing the value:"+x);
  System.out.println("Enter the second number :");
  int y=sc.nextInt();
  System.out.println("second number after intializing the value:"+y);
  if(x==y){
  System.out.println("both are equal and (==) operator is comparison");
}
else System.out.println("not equal");

 String a ="hello world!";
 String b ="hello world!";
 System.out.println(a.equals(b)+"  it was use for string");
}
}