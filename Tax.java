import java.util.Scanner;
class Tax{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("enter the your income in lacks :");
float a = sc.nextFloat();
if(a<5){
System.out.println("0% tax");
}
else if(a>=5 && a<10){
 System.out.println("20% tax :" + (a*0.2));
}
else{
System.out.println("20% tax :" + (a*0.3));
}
}
}