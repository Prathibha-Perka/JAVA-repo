/* PatternIntherit1

*             * * * *
* *             * * *
* * *		  * *
* * * *		    *
*/


import java.util.*;
class Pattern1
{
public void square()
{

for(int i=1;i<=4;i++)
{
for( int j=1;j<=i;j++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
class Pattern2 extends Pattern1
{
public void rSquare()
{
for( int i=1;i<=4;i++)
{
for( int j=4;j>=i;j--)
{
System.out.print(" *");
}
System.out.println();
}
System.out.println();
}
}
class  PatternIntherit
{
public static void main(String args[])
{
Pattern2 obj=new Pattern2();
obj.square();
obj.rSquare();
}
}