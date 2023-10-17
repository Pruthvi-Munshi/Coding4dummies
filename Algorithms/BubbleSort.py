# Bubble sort
# swaps each pair until items are sorted
# runtime: O(n^2)

def bubble_sort(my_list):
    n = len(my_list)

    # traverse through all the elements in the list
    for i in range(n):
        for j in range(0, n-i - 1):
            # swap the element if th element found is greater than the next element
            if my_list[j] > my_list[j + 1]:
                my_list[j], my_list[j + 1] = my_list[j + 1], my_list[j]
    return my_list

# Example usage:
unsorted_list = [64, 32, 54, 81, 12, 40, 29, 89, 1, 73]
sorted_list = bubble_sort(unsorted_list)
print("Sorted list:", sorted_list)