import java.util.*;
class StudentGrade
{
void grade()
{
int s1,s2,s3,s4,s5, total,avg;
System.out.println("enter student marks of all subjects=");
Scanner s=new Scanner(System.in);
s1=s.nextInt();
s2=s.nextInt();
s3=s.nextInt();
s4=s.nextInt();
s5=s.nextInt();
total = s1+s2+s3+s4+s5;
System.out.println("total marks of a student ="+total);
avg=total/5;
System.out.println("Average of student marks =" +avg);
if(avg>90)
System.out.println("0 Grade");
else if(avg>80 && avg<=89)
System.out.println("A Grade");
else if(avg>70 && avg<=79)
System.out.println("B Grade");
else if(avg>60 && avg<=69)
System.out.println("C Grade");
else if(avg>50 && avg<=59)
System.out.println("D Grade");
else if(avg>40 && avg<=49)
System.out.println("Pass");
else
System.out.println("Fail");
}
}
class Swapping extends StudentGrade
{
void swap()
{
int a,b,temp;
System.out.println("enter a,b values = ");
Scanner s = new Scanner(System.in);
a = s.nextInt();
b = s.nextInt();
System.out.println("a,b values before swapping =" +a+"," +b);
temp=a;
a=b;
b=temp;
System.out.println("a,b values after Swapping = " +a+","+b);
}
}
class SingleInh1
{
public static void main(String[] args)
{
int i,num,count=0;
System.out.println("enter a number=");
Scanner s = new Scanner(System.in);
num=s.nextInt();
for(i=1;i<=num;i++)
{
if(num%i ==0)
{
count=count+1;
}
}
if(count==2)
{
System.out.println("number is prime");
}
else
{
System.out.println("not a prime");
}
Swapping sa = new Swapping();
sa.grade();
sa.swap();
}
}



