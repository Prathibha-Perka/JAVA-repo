class DeleteElement
{
public static void main(String[] args)
{
int[] a = {6,4,13,2,14,9,21};
int delete=2;
for(int i=0;i<a.length;i++)
{
if(delete != a[i])
{
System.out.println(a[i]+ " ");
}
}
}
}