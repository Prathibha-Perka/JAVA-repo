class ThreeDEx
{
public static void main(String[] args)
{
int sum=0;
int[][][] a={{6,1,4},{3,2},{14,16,18}};
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
for(int k =0; k<a[i][j].length;k++)
{
System.out.print(a[i][j][k]+ " ");
sum=sum+a[i][j][k];
}
System.out.println("sum of all elements = " +sum);
}
}
}
}
