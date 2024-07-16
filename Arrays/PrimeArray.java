class PrimeArray
{
public static void main(String[] args)
{
int a[] = {3,4,21,27,7,19,26,13};
int count;
int sum=0;
for(int i=0;i<a.length;i++)
{
count = 0;
for(int j=1;j<=a[i];j++)
{
if(a[i]%j==0)
{
count = count+1;
}
}
if(count == 2)
{
System.out.print(a[i] + " " );
sum = sum+a[i];
}
}System.out.println("sum of prime numbers = "+sum);
}
}


