/* PatternInherit2

1		* * * *
2 2		* * *
3 3 3		* *
4 4 4 4		*
*/

import java.util.*;
class Pattern1
{
public void triangle1()
{
for( int i=1;i<=4;i++)
{
for( int j=1;j<=i;j++)
{
System.out.print(" "+i);
}
System.out.println();
}
}
}
class Pattern2 extends Pattern1
{
public void triangle2()
{
for( int i=1;i<=4;i++)
{
for( int j=4;j>=i;j--)
{
System.out.print(" *");
}
System.out.println();
}
}
}
class  PatternInherit2
{
public static void main(String args[])
{
Pattern2 obj=new Pattern2();
obj.triangle1();
obj.triangle2();
}
}

