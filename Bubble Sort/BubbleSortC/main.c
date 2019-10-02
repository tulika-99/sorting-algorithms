#include<stdio.h>

void bbSort(int arr[], int N) {
    int i, j, aux;
    for (i = 1; i < N; i++) 
    for (j = 0; j < N - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            aux = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = aux;
        }
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
    bbSort(arr, N);
    for(i = 0; i < N; i++){
        printf("\n%d", arr[i]);
    }
}