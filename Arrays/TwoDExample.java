class TwoDExample
{
public static void main(String[] args)
{
int[][] a = {{2,6,13},{20,22,26},{4}};
for(int i =0; i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+ " ");
}
System.out.println();
}
}
}