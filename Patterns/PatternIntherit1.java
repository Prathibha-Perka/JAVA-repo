/* PatternIntherit1

*             * * * *
* *             * * *
* * *		  * *
* * * *		    *
*/


import java.util.*;
class Pattern1
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
class Pattern2 extends Pattern1
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
class  PatternIntherit1
{
public static void main(String args[])
{
Pattern2 obj=new pattern2();
}
}