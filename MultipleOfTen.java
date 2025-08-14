import java.util.Scanner;
class MultipleOfTen{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number :");
int a =sc.nextInt();
/*
while(a>0){
if(a%10 ==0){
break;
}
else{
System.out.println("enter the number :");
a =sc.nextInt();
}
}
*/
while(a>0){
if(a%10 ==0){
continue;
}
else{
System.out.println("enter the number :");
a =sc.nextInt();
}
}
}
}