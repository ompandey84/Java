import java.util.Scanner;
class HOLLOWRECTANGLEpattern{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the length of rectangle :");
int a =sc.nextInt();
System.out.println("enter the width of rectangle :");
int b =sc.nextInt();
for(int i =1; i<=a; i++){
for(int j=1;j<=b;j++){
if(i==1 || i == a){
System.out.print("*");
}
else if((i==b || j==b) || j==1 ){
 System.out.print("*");
}
else{
 System.out.print(" ");
}
}
System.out.println();
}
}
}