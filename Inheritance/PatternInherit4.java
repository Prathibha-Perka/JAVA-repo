/* PatternInherit4

1 : *
    * *
    * * *
    * * * *
    * * *
    * *
    *
2 : swapping of 2 numbers
*/

import java.util.*;
class Pattern1
{
public void rhombus()
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" *");
}
System.out.println();
}
for( int i=1;i<=3;i++)
{
for(int j=3;j>=i;j--)
{
System.out.print(" *");
}
System.out.println();
}
}
}
class Swapping extends Pattern1
{
public void swap()
{
int a,b,temp;
System.out.println(" enter a,b values ");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
System.out.println("a,b values before swapping are " +a+" "+b);
temp=a;
a=b;
b=temp;
System.out.println("a,b values after swapping are" +a+" "+b);
}
}
class PatternInherit4
{
public static void main(String args[])
{
Swapping obj=new Swapping();
obj.rhombus();
obj.swap();
}
}


