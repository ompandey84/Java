import java.util.Scanner;
class AssignmentOperators{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number :");
 float a= sc.nextFloat();
 System.out.println("enter the number :");
 float b= sc.nextFloat();

 System.out.println(a +=a);
 System.out.println( a -= a);
 System.out.println(a*=a);
 System.out.println(a/=a);
 System.out.println(a%=a);
 System.out.println(a=b);

}
}