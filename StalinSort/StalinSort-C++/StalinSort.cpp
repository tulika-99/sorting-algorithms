#include <iostream>
#include <vector>

// Function to sort a vector using Stalin Sort algorithm
void stalinSort(std::vector<int>& vec) {
    int maxVal = vec[0];
    
    for (int i = 1; i < vec.size(); i++) {
        if (vec[i] < maxVal) {
            vec.erase(vec.begin() + i); // Remove element if it is not in sorted order
            i--;
        } else {
            maxVal = vec[i];
        }
    }
}

// Driver code to test the stalinSort function
int main() {
    std::vector<int> vec = {4, 2, 5, 1, 3};
    
    std::cout << "Original vector: ";
    for (int i = 0; i < vec.size(); i++) {
        std::cout << vec[i] << " ";
    }
    std::cout << std::endl;
    
    stalinSort(vec);
    
    std::cout << "Sorted vector: ";
    for (int i = 0; i < vec.size(); i++) {
        std::cout << vec[i] << " ";
    }
    std::cout << std::endl;
    
    return 0;
}