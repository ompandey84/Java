import java.util.Scanner;
class ROTATEDHALFPYRAMIDpattern{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the length of rectangle :");
int a =sc.nextInt();
int b=a;
for(int i =1;i<=a;i++){
for(int j =1;j<=a;j++){
if(j<=a-i){
System.out.print(" ");
}
else System.out.print("*");
}
System.out.println();
}
}
}