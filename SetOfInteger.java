import java.util.Scanner;
class SetOfInteger{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of set : ");
int a = sc.nextInt();
int sum_Of_even = 0;
int sum_Of_odd = 0;
for(int i = 1; i<=a;i++){
System.out.println("Enter the number of set : ");
int b = sc.nextInt();
if(b%2==0){
sum_Of_even += b;
}
else sum_Of_odd += b;
}
System.out.println("The sum of even number of set : " + sum_Of_even);
System.out.println("The sum of odd number of set : " + sum_Of_odd);
}
}