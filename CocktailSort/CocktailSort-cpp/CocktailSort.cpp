#include <iostream>
#include <vector>
using namespace std;

void cocktailSort(vector<int >&v, int n){
    bool sorted = true;

    for(int i=0;i<n-1;i++){
        if(v[i]>v[i+1]){
            swap(v[i],v[i+1]);
            sorted = false;
        }
    }

    if(sorted)
        return;

    sorted = false;

    for(int i=n-1;i>0;i--){
        if(v[i]<v[i-1]){
            swap(v[i],v[i-1]);
            sorted = false;
        }
    }

    if(sorted)
        return;

    cocktailSort(v,n);

}

int main(){
    int n;
    cin>>n;

    if(n<0){
        return 0;
    }

    vector<int > v(n,0);

    for(int i=0;i<n;i++){
        cin>>v[i];
    }

    cocktailSort(v,n);

    for(int i=0;i<n;i++){
        cout<<v[i]<<" ";
    }

    return 0;
}