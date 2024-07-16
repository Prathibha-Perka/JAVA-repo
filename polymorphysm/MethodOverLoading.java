class Test
{
void display()
{
System.out.println(" this is from display method");
}
void display( int a)
{
System.out.println(" a = " +a);
}
}
class MethodOverLoading
{
public static void main(String[] args)
{
Test t1 = new Test();
t1.display();
t1.display(100);
}
}