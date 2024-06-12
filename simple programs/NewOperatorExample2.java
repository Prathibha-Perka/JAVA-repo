class Employee
{
int id=1;
String name="john";
public void work()
{
System.out.println("working...");
}
}
public class NewOperatorExample2
{
public static void main(String args[])
{
Employee obj1=new Employee();
Employee obj2=new Employee();
System.out.println(obj1);
System.out.println(obj2);
System.out.println(obj1.id+"  "+obj1.name);
System.out.println(obj2.id+"  "+obj2.name);
obj1.id=2;
obj1.name="Ruth";
System.out.println(obj1.id+"  "+obj1.name);
System.out.println(obj2.id+"  "+obj2.name);
}
}