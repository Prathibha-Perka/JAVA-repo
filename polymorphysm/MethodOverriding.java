class Test1
{
void apple()
{
System.out.println("apple is red in color");
}
}
class Test2 extends Test1
{
void apple()
{
super.apple();
System.out.println(" apple is green in color" );
}
}
class MethodOverriding
{
public static void main(String args[])
{
Test2 t = new Test2();
t.apple();
}
} 