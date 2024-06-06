// Claculator
import java.util.*;
class Calculator
{
public static void main(String args[])
{
double a,b,result;
System.out.println("enter a , b values=\n");
Scanner sc=new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
System.out.println("enter a oprtator(+,-,*,/,%)");
char operator=sc.next().charAt(0);
switch(operator)
{
case '+':
result=a+b;
System.out.println(a+" "+operator+" "+b+"="+result);
break;
case '-' :
result=a-b;
System.out.println(a+" "+operator+" "+b+"="+result);
break;
case '*' :
result=a*b;
System.out.println(a+" "+operator+" "+b+"="+result);
break;
case '/' :
result=a/b;
System.out.println(a +" "+ operator+" "+b+"="+result);
break;
case '%' :
result=a%b;
System.out.println(a+" "+operator+" "+b+"="+result);
break;
default:
System.out.println("enter a valid operator");
}
}
}
