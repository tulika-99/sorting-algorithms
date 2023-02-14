import random

class BeadSort:
    def main(self):
        arr = [random.randint(0, 9) for i in range(random.randint(5, 15))]
        print("Unsorted:", arr)

        sort = self.bead_sort(arr)
        print("Sorted:", sort)

    def bead_sort(self, arr):
        max_val = max(arr)
        grid = [['_'] * max_val for i in range(len(arr))]
        level_count = [0] * max_val

        for i in range(len(arr)):
            num = arr[i]
            for j in range(num):
                grid[i][j] = '*'
                level_count[j] += 1

        sorted_arr = [0] * len(arr)
        for i in range(len(arr)):
            putt = 0
            for j in range(max_val):
                if grid[len(arr) - i - 1][j] == '*':
                    putt += 1
            sorted_arr[i] = putt

        return sorted_arr

    def display_1d(self, arr):
        print(' '.join(str(x) for x in arr))

    def display_2d(self, arr):
        for i in range(len(arr)):
            self.display_1d(arr[i])


if __name__ == '__main__':
    bead_sort = BeadSort()
    bead_sort.main()
