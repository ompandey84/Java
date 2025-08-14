import java.util.Scanner;
class PositiveOrNegative{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter the number :"); 
 int a = sc.nextInt(); 
 if(a<0){
 System.out.println(" the number is negative");  
}
else System.out.println(" the number positive"); 
}
}