class armstrong{
    public static void main(string args[])
    {
        int n=153;
        int sum=0;
        int temp=n;
        while(temp!=0)
        {
            int r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
    }
}