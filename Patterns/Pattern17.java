/* Pattern17
		i  j
* 		1  1
* *		2  2
* * *		3  3
* * * *		4  4
1 2 3		1  3
1 2 		2  2
1		3  1
*/

import java.util.*;
class Pattern17
{
public static void main(String[] args)
{
for( int i=1;i<=4;i++)
{
for( int j=1;j<=i;j++)
{
System.out.print(" *");
}
System.out.println();
}
for( int i=3;i>=1;i--)
{
for( int j=1;j<=i;j++)
{
System.out.print(" "+j);
}
System.out.println();
}
}
}