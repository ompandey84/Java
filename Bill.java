import java.util.Scanner;
class Bill{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number of pencil :");
 float pencil= sc.nextFloat();
 System.out.println("enter the number of pen :");
 float pen= sc.nextFloat();
 System.out.println("enter the number of eraser :");
 float eraser= sc.nextFloat();
 float total = pencil + pen + eraser;
 System.out.println(" bill is : "+ total);
 float new_total = total +(0.18f * total);
 System.out.println(" bill after tax is : "+ total);
}
}