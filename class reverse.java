class reverse
{
    public static void main(string args[])
    {
        int n=1234;
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        system.out.println("reverse of the number is "+rev);
    }
}