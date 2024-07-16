class LinerSearch
{
public static void main(String[] args)
{
int a[] ={10,26,6,47,3,24,9,6,27,3,6,17,4,13};
int item = 6,temp =0;
for(int i=0; i<a.length; i++)
{
if(item == a[i])
{
System.out.println("this item is available in " +i);
temp = temp+1;
}
}
if(temp == 0)
{
System.out.print("item is not found");
}
}
}
