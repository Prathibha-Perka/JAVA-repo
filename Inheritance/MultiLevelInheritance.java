// MultiLevelInheritance

import java.util.*;
class Herbivores
{
void grass()
{
System.out.println(" the animal which can eat only grass are called herbivores");
System.out.println("example - Cows");
}
}
class Carnivores extends Herbivores
{
void meet()
{
System.out.println(" the animal which can eat only meet are called carnivores");
System.out.println("example - Lion");
}
}
class Omnivores extends Carnivores
{
void both()
{
System.out.println(" the animal which can eat both grass and meet are called Omnivores");
System.out.println("example - Bear");
}
}
class MultiLevelInheritance
{
public static void main(String[] args)
{
Omnivores obj=new Omnivores();
obj.both();
obj.meet();
obj.grass();
}
}



