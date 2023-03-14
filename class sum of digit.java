class sum of digit{
    public static void main(string args[])
    {
        int n=1234;
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10
        }
        system.out.print("sum of the digit is"+sum);
    }
}