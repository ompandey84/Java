import java.util.Scanner;
class bionaminal{
static void bio(int x,int y){
int fact =1;
for(int i = 1;i<=x;i++){
fact *=i;
}
int r=1;
for(int i = 1;i<=y;i++){
r *=i;
}
int c =1;
for(int i = 1;i<=(x-r);i++){
c *=i;
}
int bio=fact/(r*c);
System.out.println("bionominal of number is :"+ bio);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number n :");
int a=sc.nextInt();
System.out.println("Enter the number r :");
int b=sc.nextInt();
 bio(a,b);
}
}