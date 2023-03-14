class fibonacci{
    public static void main(string[]args)
    {
        while(true)
        {
            int n=10;
            int a=0;
            int b=1;
            int c=0;
            system.out.println(a);
            system.out.println(b);
            while(c<=n)
            {
                c=a+b;
                system. out.println(c);
                a=b;
                b=c;
            }
            break;
        }
    }
}