import java.util.*;
class sel
{
    int n;

    int A[]=new int[100];
    void accept()
    {
        int i;
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter how many numbers?");
        n=in.nextInt();
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            A[i]=in.nextInt();
        }
    }
    void sort()
    {
        int i,j,temp,small,pos;
        small=A[0];
        pos=0;
        
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(small>A[j])
                {
                    small=A[j];
                    pos=j;
                }
            }
            temp=A[pos];
            A[pos]=A[i];
            A[i]=temp;
        }
    }
    void display()
    {
            int i;
        System.out.println("The sorted array is");
        for(i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }
    }
    public static void main(String args[])
    {
        sel obj=new sel();
        obj.accept();
        obj.sort();
        obj.display();
    }
}
