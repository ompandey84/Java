import java.util.Scanner;
class SumOfNnaturalNumber{
public static void main (String[] args){
 Scanner input = new Scanner(System.in);
System.out.println("Enter the number :");
 int x= input.nextInt();
int i=1;
int sum =0;
while(i<=x){
 sum += i;
i++;
}
System.out.println(sum);
}
}