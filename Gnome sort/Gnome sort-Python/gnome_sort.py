# Python implementation of Gnome sort

def gnome_sort(arr):
    """ Sort an array in-place using Gnome sort

    Args:
        arr (list): Array to sort
    """
    pos = 0
    while pos < len(arr):
        """
        If two adjacent elements are in right order, move forward, otherwise
        swap both elements and move backward
        """
        if (pos == 0 or arr[pos] >= arr[pos - 1]):
            pos = pos + 1
        else:
            arr[pos], arr[pos - 1] = arr[pos - 1], arr[pos]
            pos = pos - 1

def main():
    """ Driver program """
    # List of test arrays
    test_arr = [[1, 2, 3], [3, 2, 1], [5, 3, 2, 4]]
    for arr in test_arr:
        print('Initial array: {}'.format(arr))
        gnome_sort(arr)
        print('Sorted array: {}'.format(arr))
        print('---')

if __name__=='__main__':
    main()
