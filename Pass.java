import java.util.Scanner;
class Pass{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("enter your marks :");
Float a = sc.nextFloat();
String pass = a<33 ? "fail" : "pass";
System.out.print(pass);
/*if(a<33){
System.out.println("You are fail");
}
else System.out.print("You are pass");
*/
}
}