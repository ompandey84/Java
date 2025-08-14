import java.util.Scanner;
class AraeOfCircle{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the radius of circle :");
 float radius= sc.nextFloat();
 double area_of_circle = (22*radius*radius)/7;
System.out.println("the area of circle is :" + area_of_circle);
}
}