import java.util.Scanner;
class OneToN{
public static void main (String[] args){
 Scanner input = new Scanner(System.in);
System.out.println("Enter the number :");
 int x= input.nextInt();
int i=1;
while(i<=x){
 System.out.println(i);
 i++;
}
}
}