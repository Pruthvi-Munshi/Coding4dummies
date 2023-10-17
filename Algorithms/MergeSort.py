# Merge sort
# cuts the list into sublists and compares
# Runtime: O(n log n)

def merge_sort(my_list):
    if len(my_list) <= 1:
        return my_list
    
    # split the input list into two halves
    mid = len(my_list) // 2 # gets the middle index of our list
    left_half = my_list[:mid]
    right_half = my_list[mid:]

    # recursive call to sort the left and right halves
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)

    # merge the sorted halves
    return merge(left_half, right_half) #keeps breaking down the list until there is single item in each

def merge(left, right):
    merged = []
    left_index, right_index = 0, 0

    # compare elements in both lists and merge them in a sorted order
    while left_index < len(left) and right_index < len(right):
        if left[left_index] < right[right_index]:
            merged.append(left[left_index])
            left_index = left_index + 1
        else:
            merged.append(right[right_index])
            right_index = right_index + 1

# left = [1, 4, 7]      right = [2, 5, 8]       merged = []
# left = [1, 4, 7]      right = [2, 5, 8]       merged = [1]
# left = [1, 4, 7]      right = [2, 5, 8]       merged = [1, 2]
# left = [1, 4, 7]      right = [2, 5, 8]       merged = [1, 2, 4]
# left = [1, 4, 7]      right = [2, 5, 8]       merged = [1, 2, 4, 5]
# left = [1, 4, 7]      right = [2, 5, 8]       merged = [1, 2, 4, 5, 7]

    # add remaining elements if there are any from both lists
    merged.extend(left[left_index:])
    merged.extend(right[right_index:])
# left = [1, 4, 7]      right = [2, 5, 8]       merged = [1, 2, 4, 5, 7, 8]
    
    return merged

# Example Usage:
unsorted_list = [42, 60, 91, 38, 25, 12, 54, 72, 87, 21]

sorted_list = merge_sort(unsorted_list)
print("Sorted list:", sorted_list)