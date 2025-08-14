import java.util.Scanner;
class Swap{
public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number :");
  int x=sc.nextInt();
  System.out.println("Enter the second number :");
  int y=sc.nextInt();
  int w=x;
  x=y;
  y=w;
  System.out.println("after swaping");
  System.out.println("first number :"+x);
  System.out.println("second number :"+y);

}
}