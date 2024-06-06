// MultiLevelInheritance1

import java.util.*;
class Person
{
void individual()
{
System.out.println("Citizen");
}
}
class State extends Person
{
void chiefMinister()
{
System.out.println("Head of State");
}
}
class Country extends State
{
void primeMinister()
{
System.out.println("Head of Country");
}
}
class MultiLevelInheritance1
{
public static void main(String[] args)
{
Country c=new Country();
c.individual();
c.chiefMinister();
c.primeMinister();
}
}

