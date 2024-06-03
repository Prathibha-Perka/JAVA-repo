/* PatternInherit3

1 : quadratic equation
2 : 1 1 1 1
    2 2 2 
    3 3
    4

*/

import java.util.*;
class Quadratic
{
public void equation()
{
double a,b,c,d,root1,root2;
	System.out.println("enter a ,b , c values= ");
        Scanner s = new Scanner(System.in);
	a=s.nextDouble();
	b=s.nextDouble();
	c=s.nextDouble();
	d= (b*b) - (4*a*c);
	System.out.println(" d value is ="+d);
	if(d==0)
	{
	System.out.println("roots are real and equal");
	root1= (-b+Math.sqrt(d))/(2*a);
	System.out.println(" root1 value is ="+root1);
	root2= (-b+Math.sqrt(d))/(2*a);
	System.out.println(" root2 value is =" +root2);
	
	}
	else if(d>0)
	{
		System.out.println("roots are real and unequal");
		root1= (-b)/(2*a);
		System.out.println(" root1 value is ="+root1);
		root2= (-b)/(2*a);
		System.out.println("root2 value is = " +root2);
	}
	else
	{
		System.out.println("roots are imagenary");
	}
}
}
class Pattern extends Quadratic
{
public void square()
{
for( int i=1;i<=4;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" "+i);
}
System.out.println();
}
}
}
class PatternInherit3
{
public static void main(String args[])
{
Pattern obj = new Pattern();
obj.equation();
obj.square();
}
}


