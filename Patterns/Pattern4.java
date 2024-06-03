/* Pattern4
		i  j		
*		1  1	
* *     	2  2	
* * *		3  3
* * * *		4  4
* * * * *	5  5
* * * * 	1  4
* * *		2  3
* *		3  2
*		4  1
*/

class Pattern4
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" *");
}
System.out.println();
}
for(int i=1;i<=4;i++)
{
for( int j=4;j>=i;j--)
{
System.out.print(" *");
}
System.out.println();
}
}
}