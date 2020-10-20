#include<iostream>

using namespace std;
int main()
{
    int arr[1000];
    int size, i;
    cout<<"Enter the Array Size: ";
    cin>> size;
    cout<<"\nEnter the Array ELements :- ";

    for(i=0; i<size; i++)
    {
        cout<<"\nEnter elements as "<<i+1<<" position: ";
        cin>>arr[i];
    }

    int flag = 0, item;
    cout<<"\nEnter the element You want to search: ";
    cin>>item;

    for(i=0; i<size; i++)
    {
        if(arr[i] == item)
        {
            flag = 1;
            break;
        }
    }

    if(flag == 1)
    cout<<"\nItem Found at "<<i+1<<" position as: "<<item;
    
    else 
    cout<<"\nItem not Found";

    return 0;    
}