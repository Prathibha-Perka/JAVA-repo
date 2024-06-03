/* Pattern10
		i  j
1 1 1 1		1  4
2 2 2		2  3	
3 3 		3  2
4		4  1
*/

import java.util.*;
class Pattern10
{
 public static void main(String[] args)
 {
  for(int i=1;i<=4;i++)
   {
    for(int j=4;j>=i;j--)
     { 
      System.out.print(" "+i);
     }
    System.out.println();
   }
 }
}
