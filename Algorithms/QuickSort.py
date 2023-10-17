# Quick sort
# picks a pivot element, partitions list into two sublist and recursivly sorts the two sublists
# Runtime: O(n log n)

def quick_sort(my_list):
    if len(my_list) <= 1:
        return my_list
    
    # choose a pivot
    pivot = my_list[len(my_list) // 2]

    # partition the list into three parts

    left = [] # less than pivot
    equal = [] # equal to pivot
    right = [] # greater than pivot

    for num in my_list:
        if num < pivot:
            left.append(num)
        elif num == pivot:
            equal.append(num)
        else:
            right.append(num)

    # recursivly sort yhe sublists
    sorted_left = quick_sort(left)
    sorted_right = quick_sort(right)

    return sorted_left + equal + sorted_right

# Example usage:
unsorted_list = [12, 98, 28, 85, 39, 76, 41, 63, 50, 81]
sorted_list = quick_sort(unsorted_list)
print("Sorted list:", sorted_list)
