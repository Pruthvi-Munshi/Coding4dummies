# Binary Search 
# splits the data in half until the item is found
# the data has to be sorted before the binary search is ever used
# Time complexity: O(log n)

def binary_search(my_list, target):
    left, right = 0, len(my_list) - 1

    while left <= right:
        mid = (left + right) // 2
# // divides and returns a whole number so 5/2 = 2.5, 5//2 = 2
        if my_list[mid] == target:
            return True # Element was found
        elif my_list[mid] < target:
            left = mid + 1 # discard left half
        else:
            right = mid - 1 # discard right half
    return False # element wasn't found

my_list1 = [1,2,3,4,5,6,7,8,9,10]
target = 3
if binary_search(my_list1, target):
    print(f"Element {target} found in list")
else:
    print(f"element {target} not found in list")