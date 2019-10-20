import java.util.*;
class bubsort
{
    //global variables
    int A[]=new int[100];
    int n;
    void accept()
    {
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter how many numbers");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            A[i]=in.nextInt();
        }
    }
    void bsort()
    {
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                if(A[j]>A[j+1])
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }
    void print()
    {
        int i;
        System.out.println("The sorted elements are");
        for(i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }
    }
    public static void main(String args[])
    {
        bubsort obj=new bubsort();
        obj.accept();
        obj.bsort();
        obj.print();
    }
}
        
    
    
