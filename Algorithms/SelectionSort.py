# Selection Sort
# Finds the smallest element and moves it to the front until the list is sorted
# Runtime: O(n^2)

def selection_sort(my_list):
    my_list_length = len(my_list)

    # traverse through all elements of the list
    for i in range(my_list_length): # i is just common short form for index
        # find the minimum element
        min_index = i 
        for j in range(i + 1, my_list_length):
            if my_list[j] < my_list[min_index]:
                min_index = j
        
        # swap the found minimum element with the first element
        my_list[i], my_list[min_index] = my_list[min_index], my_list[i]

    return my_list

        # another way to write the swap
        # temp = my_list[i]
        # my_list[i] = my_list[min_index]
        # my_list[min_index] = temp

unsorted_list = [92, 42, 50, 38, 58, 20, 19, 4, 12, 21]

sorted_list = selection_sort(unsorted_list)
print("Sorted list:", sorted_list)