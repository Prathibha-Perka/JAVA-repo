// coverting digit to word

import java.util.*;
class TwoDigit
{
public static void main(String[] args)
{
int num;
System.out.println("enter a number");
Scanner s= new Scanner(System.in);
num=s.nextInt();
switch(num/10)
{
case 1 :
System.out.print(" One ");
break;
case 2 :
System.out.print(" Two ");
break;
case 3 :
System.out.print("Three ");
break;
case 4 :
System.out.print(" Four ");
break;
case 5 :
System.out.print(" Five ");
break;
case 6 :
System.out.print(" Six ");
break;
case 7 :
System.out.print("Seven");
break;
case 8 :
System.out.print("Eight ");
break;
case 9 :
System.out.print(" Nine ");
break;
default :
System.out.print("enter valid number");
}
switch(num%10)
{
case 0:
System.out.print("zero");
break;
case 1:
System.out.print("one");
break;
case 2:
System.out.print("two");
break;
case 3:
System.out.print("three");
break;
case 4:
System.out.print("four");
break;
case 5:
System.out.print("five");
break;
case 6:
System.out.print("six");
break;
case 7:
System.out.print("seven");
break;
case 8:
System.out.print("eight");
break;
case 9:
System.out.print("nine");
break;
default :
System.out.print(" please enter valid number");
}
}
}
