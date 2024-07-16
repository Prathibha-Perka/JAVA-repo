class EvenAndOdd
{
public static void main(String[] args)
{
int[] a = {21,6,47,3,9,48,7,71,64,3,97};
int sum1 = 0, sum2 = 0;
System.out.print("even number = ");
for(int i=0;i<a.length;i++)
{
if(a[i]%2 ==0)
{
System.out.print(a[i] + " ");
sum1 = sum1+a[i];
}
}
System.out.println("sum of even no = " +sum1);
System.out.println(" odd numbers = ");
for(int j=0;j<a.length;j++)
{
if(a[j]%2 !=0)
{
System.out.print(a[j] + " " );
sum2 = sum2+a[j];
}
}
System.out.println("sum of odd numbers =" +sum2);
}
}

