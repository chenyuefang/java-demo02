package demo.day02;

public class _11_Daffodils {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a,b,c,i;
        int sum=0;
        for (i=100;i<999;i++)
        { a=i%10;
            b=i/10%10;
            c=i/100;
            sum=(a*a*a)+(b*b*b)+(c*c*c);
            if (sum==i)
                System.out.println("水仙花数："+sum);}

    }
}
