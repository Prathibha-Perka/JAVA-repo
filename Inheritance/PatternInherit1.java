/* PatternInherit1

* * * *		1 2 3 4
* * * *		1 2 3 4
* * * *		1 2 3 4
* * * * 	1 2 3 4
*/

import java.util.*;
class Pattern1
{
public void square1()
{
for( int i=1;i<=4;i++)
{
for( int j=1;j<=4;j++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
class Pattern2 extends Pattern1
{
public void square2()
{
for( int i=1;i<=4;i++)
{
for( int j=1;j<=4;j++)
{
System.out.print(" "+j);
}
System.out.println();
}
}
}
class  PatternInherit1
{
public static void main(String args[])
{
Pattern2  obj1 =new Pattern2();
obj1.square2();
obj1.square1();

}
}