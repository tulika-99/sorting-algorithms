#include <iostream>
#include <stdlib.h>

using namespace std;

int isSorted(int *arr, int i) {
    while (--i >= 1) {
        if (arr[i] < arr[i-1]) {
            return 0;
        }
    }
    return 1;
}

void bogoSort(int *arr, int i) {
    while (!isSorted(arr, i)) {
        for (int j = 0; j < i; j++) {
            int temp = arr[i];
            int randomIndex = rand() % i;

            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }

    int main() {
        int arr[] = { 3, 1, 2 };
        bogoSort(arr[], 3);
        
        for (int i = 0; i < 3; i++) {
            cout << arr[i] << " ";
        }

    }

}
