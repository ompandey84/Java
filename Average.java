import java.util.Scanner;
class Average{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the total number of scores :");
 int a= sc.nextInt();
 float sum =0;
 for(int i=1;i<=a;i++){
 System.out.println("enter the markes of score : "); 
 float b=sc.nextFloat();
 sum +=b;
}
System.out.println("the average of all scores :"+sum/a);
}
}