import java.util.Scanner;
class Weeks{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter the number of weeks :"); 
 int a = sc.nextInt();
 switch(a){
 case 1 :
 System.out.println("Monday");
 break;
 case 2 :
 System.out.println("Tusday");
 break;
 case 3 :
 System.out.println("wednesday");
 break;
 case 4 :
 System.out.println("Thursday");
 break;
 case 5 :
 System.out.println("friday");
 break;
 case 6 :
 System.out.println("saturday");
 break;
 case 7 :
 System.out.println("Sunday");
 break;
 default : 
 System.out.println(" worng option choosen ");
}
}
}