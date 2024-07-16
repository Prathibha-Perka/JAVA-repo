class TwoDArray
{
public static void main(String[] args)
{
int[][] a = {{6,21,4,13} , {3,14,7}};
for(int i=0; i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(a[i][j] + " " );
}
System.out.println();
}
}
}