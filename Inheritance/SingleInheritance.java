// SingleInheritance
import java.util.*;
class Prathibha1
{
int salary =40000;
}
class Prathibha2 extends Prathibha1
{
int bonus=20000;
}
class SingleInheritance
{
public static void main(String args[])
{
Prathibha2 p=new Prathibha2();
System.out.println("total salary="+(p.salary+p.bonus));
}
}



