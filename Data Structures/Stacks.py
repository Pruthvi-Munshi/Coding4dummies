# Stacks
# - a data structure that follows LIFO (last in first out)
class Stack:
    def __init__(self):
        self.stack = []

# Operations:

# push(item) - adds an item to the stack
    def push(self, item):
        self.stack.append(item)

# top()/peek() - returns the last item pushed to the stack
    def peek(self):
        if not self.is_empty():
            return self.stack[-1]
        else:
            return "Stack is empty"

# pop() - removes the most recently pushed item from the stack
    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        else:
            return "Stack is empty"

# is_empty() - true if no items can be popped
    def is_empty(self):
        return len(self.stack) == 0

# is_full() - true if you cant push anything else
# get_size() - returns the number of elements on the stack

# Advantages
# - efficient memory utilization
# - fast access time to add/remove elements
# - supports back tracking

# Disadvantages
# - limited capacity
# - there is no random access
# - no suitable for searching and sorting



