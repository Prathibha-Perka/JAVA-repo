/* PatternInherit6

1 : *
    * * 
    * * *
    * * * *
    * * *
    * *
    *
2 : prime number 111 to 999
*/

import java.util.*;
class Pattern1
{
public void rhombus()
{
for( int i=1;i<=4;i++)
{
for( int j=1;j<=i;j++)
{
System.out.print(" *");
}
System.out.println();
}
for(int i=1;i<=3;i++)
{
for(int j=3;j>=i;j--)
{
System.out.print(" *");
}
System.out.println();
}
}
}
class primeNo extends Pattern1
{
public void test()
{
int i,j,count;
for(i=111;i<=999;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
count=count+1;
}
}
if(count==2)
{
System.out.println(i);
}
}
}
}

class PatternInherit6
{
public static void main(String args[])
{
primeNo obj=new primeNo();
obj.test();
obj.rhombus();	
}
}
