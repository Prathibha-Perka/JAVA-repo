/* Pattern7
		i  j
1		1  1
1 2		2  2
1 2 3		3  3
1 2 3 4		4  4
1 2 3 4 5	5  5
*/

class Pattern7
{
public static void main(String args[])
{
for( int i =1; i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" "+j);
}
System.out.println();
}
}
}



