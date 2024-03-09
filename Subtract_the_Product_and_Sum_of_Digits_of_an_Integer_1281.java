public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281
{
    public static  int subtractProductAndSum(int n)
    {
        int s=0,p=1;
        while(n!=0)
        {
            int r=n%10;
            s+=r;
            p=p*r;
            n/=10;
        }
        return Math.abs(p-s);
    }
    public static void main(String[] args)
    {
        int n=4421;
        System.out.println(subtractProductAndSum(n));
    }
}
