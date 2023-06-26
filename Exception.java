import java.util.Scanner;
class except
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the a:");
a=sc.nextInt();
System.out.println("Enter the b:");
b=sc.nextInt();
try
{
c=a/(a-b);
System.out.println("c="+c);
}

catch(ArithmeticException e)
{
System.out.println("arithmetic Exception"+e);
}
finally
{
System.out.println("final block");
}
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("End Bye");
}
}
