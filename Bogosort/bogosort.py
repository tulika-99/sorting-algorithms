from random import randint, shuffle
from typing import List


def bogosorted(to_sort: List[int]) -> List[int]:
    """Apply the bogosort on a list of integers
    :param to_sort: List of elements to sort
    :return: A sorted list of those elements
    """
    while not is_sorted(to_sort):
        shuffle(to_sort)
    return to_sort


def is_sorted(array: List[int]) -> bool:
    """Check if an array is sorted
    :param array: Array to check
    :return: `True` if the array is sorted, `False` otherwise
    """
    return all(array[i] <= array[i+1] for i in range(len(array)-1))


if __name__ == '__main__':
    # Initialize data
    array = [randint(1, 42) for _ in range(5)]
    sorted_array = bogosorted(array)

    # Display them
    print(f'original: {array}')
    print(f'result: {sorted_array}')
