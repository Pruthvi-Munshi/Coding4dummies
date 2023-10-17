# Linear/selective searching
# moves sequentially until an item is found
# time complexity: O(n)

def linear_search(my_list, target):
    for element in my_list:
        if element == target:
            return True
    return False

my_list1 = [3,1,4,6,5,8,2,8,9,2]
target = 9

if linear_search(my_list1, target):
    print(f"element {target} found in list.")
else:
    print(f"element {target} not found in the list.")

# For this example the time complexity is O(10) cuz in worst case scenario it can go through 10 times.