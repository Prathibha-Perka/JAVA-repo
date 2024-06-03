/* Pattern6
		i  j  k   i=columns
      *		1  3  1   j=spaces
    * *  	2  2  2   k=starts(*)
  * * *		3  1  3
* * * *		4  0  4
*/

class  Pattern6
{
public static void main(String args[])
{
for( int i=1;i<=4;i++)
{
for(int j=3;j>=i;j--)
{
System.out.print("  ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}