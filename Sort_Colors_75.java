public class Sort_Colors_75
{
    public static void sort(int a[])
    {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                c0++;     
            }
            else if(a[i]==1)
            {
                c1++;     
            }
        }
        int j0=0,j1=0;
        for(int i=0;i<a.length;i++)    
        {
            if(j0<c0)  
            {
                a[i]=0;  
                j0++; 
            }
            else if(j1<c1 && j0==c0)
            {
                a[i]=1;
                j1++;
            }
            else
            {
                a[i]=2;
            }
        }
    }

    public static void main(String[] args)
    {
        int a[]={2,0,0,2,1,0,1,2,0,1,0,2};
        sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}