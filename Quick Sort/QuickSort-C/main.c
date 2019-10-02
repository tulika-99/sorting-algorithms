#include<stdio.h>

void quick_sort(int arr[], int left, int right) {
    int i, j, x, y;
     
    i = left;
    j = right;
    x = arr[(left + right) / 2];
     
    while(i <= j) {
        while(arr[i] < x && i < right) {
            i++;
        }
        while(arr[j] > x && j > left) {
            j--;
        }
        if(i <= j) {
            y = arr[i];
            arr[i] = arr[j];
            arr[j] = y;
            i++;
            j--;
        }
    }
     
    if(j > left) {
        quick_sort(arr, left, j);
    }
    if(i < right) {
        quick_sort(arr, i, right);
    }
}

int main(){
    int i, N, aux;
    scanf(" %d", &N);
    int arr[N];
    for(i = 0; i < N; i++){
        scanf(" %d", &aux);
        arr[i] = aux;
    }
    quick_sort(arr, 0, N - 1);
    for(i = 0; i < N; i++){
        printf("\n%d", arr[i]);
    }
}