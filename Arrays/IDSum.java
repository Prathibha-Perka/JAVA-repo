class IDSum
{
public static void main(String args[])
{
int a[] = new int[6];
a[0] = 6;
a[1] = 21;
a[2] = 4;
a[3] = 31;
a[4] = 7;
a[5] = 9;

// int a[] = {6,21,4,31,7,9};
int sum = 0;
for(int i=0 ; i<a.length; i++)
{
System.out.print(a[i] + " ");
sum = sum + a[i];
}
System.out.println(" sum of elements = " +sum);
}
}