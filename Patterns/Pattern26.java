/* Pattern26
		i  j  k
      1 	1  3  1				
    2 2		2  2  2     	      
  3 3 3		3  1  3 		      
4 4 4 4		4  0  4			     
  1 1 1         1  1  3			      
    2 2         2  2  2			       
      3        3  3  1			        
*/

import java.util.*;
class  Pattern26
{
public static void main(String[] args)
{
for( int i=1;i<=4;i++)
{
for(int j=3;j>=i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(i);
}
System.out.println();
}
for(int i=1;i<=3;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" ");
}
for(int k=3;k>=i;k--)
{
System.out.print(i);
}
System.out.println();
}
}
}