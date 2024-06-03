/* Pattern5
		i  j
1		1  1
1 2		2  2
1 2 3		3  3
1 2 3 4 	4  4
1 2 3 4 5 	5  5
1 1 1 1 	1  4
2 2 2 		2  3
3 3		3  2
4		4  1
*/

class Pattern5
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" "+j);
}
System.out.println();
}
for(int i=1;i<=4;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" " +i);
}
System.out.println();
}
}
}
