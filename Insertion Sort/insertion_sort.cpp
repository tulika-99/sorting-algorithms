#include<bits/stdc++.h> // Almost all required in 1 header
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); //fast io
    cin.tie(NULL);
    
    int n;
    printf("Enter number of elements : ");
    cin>>n; // Array size input
    
    int arr[n];
    printf("Enter the elements separated by space : \n");
    for(int i=0;i<n;i++)cin>>arr[i]; // array elements input()
    
    // Insertion Sort Algorithm
    for(int i=1;i<n;i++)
    {
        int elm=arr[i];
        for(int j=i-1;j>=0;j--)
        {
            if(elm<arr[j])arr[j+1]=arr[j];
            else
             {
                arr[j+1]=elm;
                break;
             }
            if(j==0)
            {
                arr[j]=elm;
                break;
            }
        }
    }
    
    // sorted Array Print
    for(int i: arr)cout<<i<<" ";
    return 0;

}
