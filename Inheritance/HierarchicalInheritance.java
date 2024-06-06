// HierarchicalInheritance

import java.util.*;
class Engine
{
void test()
{
System.out.println("Engines are important components in vehicles");
}
}
class Bike extends Engine
{
void vehicle1()
{
System.out.println("bike runs with help of Engine");
}
}
class Car extends Engine
{
void vehicle2()
{
System.out.println("car runs with help of Engine");
}
}
class  HierarchicalInheritance
{
public static void main(String[] args)
{
Car c=new Car();
c.test();
c.vehicle2();
}
}