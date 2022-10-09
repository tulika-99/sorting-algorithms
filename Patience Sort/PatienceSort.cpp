// C++ program of the above approach

#include <bits/stdc++.h>//If VSCode is unable to locate the bits folder,then open the bits folder in your mingw folder on your program files and then add the path to the include folder in your vs code folder
using namespace std;

// Function to merge piles in a sorted order
vector<int> merge_piles(vector<vector<int> >& v)
{

	// Store minimum element from
	// the top of stack
	vector<int> ans;

	// In every iteration find the smallest element
	// of top of pile and remove it from the piles
	// and store into the final array
	while (1) {

		// Stores the smallest element
		// of the top of the piles
		int minu = INT_MAX;

		// Stores index of the smallest element
		// of the top of the piles
		int index = -1;

		// Calculate the smallest element
		// of the top of the every stack
		for (int i = 0; i < v.size(); i++) {

			// If minu is greater than
			// the top of the current stack
			if (minu > v[i][v[i].size() - 1]) {

				// Update minu
				minu = v[i][v[i].size() - 1];

				// Update index
				index = i;
			}
		}

		// Insert the smallest element
		// of the top of the stack
		ans.push_back(minu);

		// Remove the top element from
		// the current pile
		v[index].pop_back();

		// If current pile is empty
		if (v[index].empty()) {

			// Remove current pile
			// from all piles
			v.erase(v.begin() + index);
		}

		// If all the piles are empty
		if (v.size() == 0)
			break;
	}
	return ans;
}

// Function to sort the given array
// using the patience sorting
vector<int> patienceSorting(vector<int> arr)
{

	// Store all the created piles
	vector<vector<int> > piles;

	// Traverse the array
	for (int i = 0; i < arr.size(); i++) {

		// If no piles are created
		if (piles.empty()) {

			// Initialize a new pile
			vector<int> temp;

			// Insert current element
			// into the pile
			temp.push_back(arr[i]);

			// Insert current pile into
			// all the piles
			piles.push_back(temp);
		}
		else {

			// Check if top element of each pile
			// is less than or equal to
			// current element or not
			int flag = 1;

			// Traverse all the piles
			for (int j = 0; j < piles.size(); j++) {

				// Check if the element to be
				// inserted is less than
				// current pile's top
				if (arr[i] < piles[j][piles[j].size() - 1]) {
					piles[j].push_back(arr[i]);

					// Update flag
					flag = 0;
					break;
				}
			}

			// If flag is true
			if (flag) {

				// Create a new pile
				vector<int> temp;

				// Insert current element
				// into temp
				temp.push_back(arr[i]);

				// Insert current pile
				// into all the piles
				piles.push_back(temp);
			}
		}
	}

	// Store the sorted sequence
	// of the given array
	vector<int> ans;

	// Sort the given array
	ans = merge_piles(piles);

	// Traverse the array, ans[]
	for (int i = 0; i < ans.size(); i++)
		cout << ans[i] << " ";

	return ans;
}

// Driver Code
int main()
{
	vector<int> arr = { 6, 12, 2, 8, 3, 7 };

	// Function Call
	patienceSorting(arr);
}
