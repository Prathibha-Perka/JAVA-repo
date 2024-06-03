/* PatternInherit7

1 : * 		1
    * *         2 2
    * * *       3 3 3
    * * * *     4 4 4 4
    1 1 1       1 1 1 
    2 2         2 2
    3           3
*/

import java.util.*;
class Pattern1
{
public void rhombus1()
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
System.out.print(" "+i);
}
System.out.println();
}
}
}
class Pattern2 extends Pattern1
{
public void rhombus2()
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" "+i);
}
System.out.println();
}
for(int i=1;i<=3;i++)
{
for(int j=3;j>=i;j--)
{
System.out.print(" "+i);
}
System.out.println();
}
}
}
class PatternInherit7
{
public static void main(String args[])
{
Pattern2 obj=new Pattern2();
obj.rhombus1();
obj.rhombus2();
}
}
   