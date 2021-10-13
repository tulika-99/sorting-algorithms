import java.util.Scanner;
 class ZeroOneKnapsack {
    static int max(int a,int b)
    {
        return (a>b)?a:b;
    }
    static void Knapsack (int n, int c, int wt[],int val[])
    {
        int i,w;
        int K[][]= new int[n+1][c+1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= c; w++) {
                if((i==0) || (w==0))
                    K[i][w] = 0;
                else if(wt[i-1]>w)
                    K[i][w] = K[i-1][w];
                else
                    K[i][w] = max(K[i-1][w],val[i-1]+K[i-1][w-wt[i-1]]);
            }
        }
        System.out.println("Maximum profit stored: " + K[n][c]);
        int res = K[n][c];
        w=c;
        for (i = n; i >0 && res>0; i--) {
            if(res == K[i-1][w])
                continue;
            else {
                System.out.println("Weight contributed is " + wt[i-1]);
                res -= wt[i-1];
                w -= wt[i-1];
            }
        }
 
    }
 
    public static void main(String[] args) {
        int n, i, c;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of items: ");
        n = sc.nextInt();;
 
        int wt[] =  new int[n];
        int val[] = new int[n];
 
        System.out.println("Enter weight of items: ");
        for (i = 0; i < n; i++) {
            wt[i] =  sc.nextInt();
        }
        System.out.println("Enter values of items: ");
        for (i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        System.out.println("Enter the maximum capacity of Knapsack: ");
        c = sc.nextInt();
        Knapsack(n,c,wt,val);
    }
    }
