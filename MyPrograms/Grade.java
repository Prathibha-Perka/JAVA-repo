// Grade
import java.util.*;
class Grade
{
public static void main(String args[])
{
int s1,s2,s3,s4,s5,s6,total,avg;
System.out.println("enter student marks=\n");
Scanner sc=new Scanner(System.in);
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
s4=sc.nextInt();
s5=sc.nextInt();
total=s1+s2+s3+s4+s5;
System.out.println("total marks = "+total);
avg=total/5;
System.out.println("average of student marks="+avg);
switch(avg/10)
{
case 9 :
System.out.println("o garde");
break;
case 8 :
System.out.println("A garde");
break;
case 7 :
System.out.println("B garde");
break;
case 6 :
System.out.println("C garde");
break;
case 5 :
System.out.println("D garde");
break;
case 4 :
System.out.println("Pass");
break;
default :
System.out.println("Fail");
}
}
}
