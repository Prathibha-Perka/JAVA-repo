class SelectionSort
{
public static void main(String[] args)
{
int a[] = {21,16,35,6,20,4,37,11};
int min,temp;
for(int i=0;i<a.length-1;i++)
{
 min = i;
for(int j=i+1;j<a.length;j++)
{
if(a[min] > a[j])
{
min = j;
}
}
temp = a[i];
a[i] = a[min];
a[min] = temp;
}
for(int i =0;i<a.length;i++)
{
System.out.print(a[i] + " ");
}
}
}

