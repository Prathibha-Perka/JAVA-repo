import java.lang.String;
import java.lang.System;
class One
{
int a=10;
static int b=20;
public void methodOne()
{
System.out.println(" from methodOne");
}
public static void methodTwo()
{
System.out.println(" from methodTwo");
}
}
public class MemberOperatorEx
{
public static void main(String args[])
{
One obj=new One();
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(One.b);
obj.methodOne();
obj.methodTwo();
One.methodTwo();
}
}


