//SingleInheritance1

import java.util.*;
class Person
{
void single()
{
System.out.println(" Indian Citizen");
}
}
class PrimeMinister extends Person
{
void power()
{
System.out.println("Head of the Country");
}
}
class SingleInheritance1
{
public static void main(String[] args)
{
PrimeMinister p=new PrimeMinister();
p.single();
p.power();
}
}
