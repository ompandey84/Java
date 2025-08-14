import java.util.Scanner;
class StringInput{
public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the charecter:");
  char a = 'a';
  System.out.println("charecter is "+a);
  System.out.println("Enter the String:");
  String b = sc.nextLine();
  System.out.println("String is " + b);
}
}