/* Pattern11
		i  j
1		1  1
2 2		2  2
3 3 3		3  3
4 4 4 4		4  4
1 1 1		1  3
2 2 		2  2
1		1  1
*/

import java.util.*;
class Pattern11
{
public static void main(String[] args)
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{ 
System.out.print(" "+i);
}
System.out.println();
}
for( int i=1;i<=3;i++)
{
for(int j=3;j>=i;j--)
{
System.out.print(" "+i);
}
System.out.println();
}
}
}