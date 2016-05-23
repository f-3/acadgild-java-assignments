class PrimeSet
{
public static void main(String arg[])
{
int n,i,flag;
for(n=1;n<=100;n++)
{
flag=0;
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println(n);
}
}
}