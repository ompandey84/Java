import java.util.Scanner;
class DatatypesinJava{
public static void main (String[] args){
 Scanner input = new Scanner(System.in);
System.out.println("Enter the first number :");
//integer types
 int x= input.nextInt();
 System.out.println(x);

//floating type
float y= input.nextFloat();
 System.out.println(y);

//boolean type
boolean z= true;
 System.out.println(z);

//character type
char a = input.next().charAt(0);// here this is the indexing of the element to take 
 System.out.println(a);

//string type
String str= input.nextLine();
 System.out.println(str);

}
}