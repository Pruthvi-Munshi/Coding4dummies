# list vs arrays

# list
# - not fixed in size
# - can have various data types
# my_list = [1, "hello", 3.5]
# - built in data structure in python

# array
# - fixed in size
# - can only store one single data type
#       - ex. can have array of all ints or of all strg but cannot have both
# my_array = [type, size]
# - not built in, must import in python
# - more compact and memory efficient
#       - memory efficient cuz of the fixed in size
import array as arr

# general syntaxy
# my_array = array(typecode, [elements])

numbers = arr.array("i", [10, 20, 30])

print(numbers[0]) # gets the 1st element
print(numbers[1]) # gets the 2nd element
print(numbers[2]) # gets the 3rd element

print(numbers.index(10)) # find index of 10
# first element has a index of 0

# both
# both are mutable (they can be changed)
# in array you can change the value in the position but you cannot add a value
# both are ordered sequence of elements


# linked lists
# - data structure that has a collection of notes that a re linked with each other
# adavantages:
# - if it requires frequent insertion or deletion in the middle
# - good for navigation systems, conversations, playlists, browser history

# create a node class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

#  create linked list class
class LinkedList:
    def __init__(self)
        self.head = None

        # add item to linked list
    def insertAtBegin(self, data):
        new_node = Node(data)
        if self.head is None: # if our linked list is empty then i assign new node to head
            self.head = new_node
            return
        else: #if linked list is not empty
            new_node = self.head # the current head is now the new nodes next
            self.head = new_node

# adding a node at any index
# indexing starts at 0

    def insertatindex(self, data, index):
        new_node = Node(data)
        current_node = self.head
        position = 0

        if position == index:
            self.insertAtBegin(data)
        else:
            while current_node != None and position + 1 != index:
                position = position + 1
                current_node = current_node.next

                if current_node != None:
                    new_node.next = current_node.next
                    current_node.next = new_node

                else:
                    print("Index not present")

# method to add node at the end of linked list
    def insertAtEnd(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        
        current_node = self.head
        while current_node.next:
            current_node = current_node.next

        current_node.next = new_node

# update a node of a  linked list
    def updateNode(self, val, index):
        current_node = self.head
        position = 0
        if position == index:
            current_node.data = val
        else:
            while current_node != None and position != index:
                position = position + 1
                current_node = current_node.next
            if current_node != None:
                current_node.data = val
            else:
                print("index not present")

# method to remove first node of a linked list
    def remove_first_node(self):
        if self.head == None:
            return
        self.head = self.head.next

# Method to remove the last node of a linked list
    def remove_last_nade(self):
        if self.head is None:
            return
    
        current_node = self.head
        while current_node.next.next:
            current_node = current_node.next

        current_node.next = None

# Method to remove at given index
    def remove_at_index(self, index):
        if self.head == None:
            return
        
        current_node = self.head
        position = 0
        if position == index:
            self.remove_first_node()
        else:
            while current_node != None and position + 1 != index:
                position = position + 1
                current_node = current_node.next
            
            if current_node != None:
                current_node.next = current_node.next.next
            else:
                print("Index not present")

# Method to remove a node from linked list
    def remove_node(self, data):
        current_node = self.head

        while current_node != None and current_node.next.data != data:
            current_node = current_node.next

        if current_node == None:
            return
        else:
            current_node.next = current_node.next.next

# print the size of a linked list
    def size_of_linked_list(self):
        size = 0
        if self.head:
            current_node = self.head
            while current_node:
                size = size + 1
                current_node = current_node.next
            return size
        else:
            return 0
        
#__repr__ means representation, tells comp how you want object to be represented
    def __repr__(self): 
        node = self.head
        nodes = []
        while node is not None:
            nodes.append(node.data)
            node = node.next
        nodes.append("None")
        return " -> ".join(nodes)
    
# create a new linked list
# llist = LinkedList()

# add nodes to the linked list
# llist.insertAtEnd("a")
# llist.insertAtEnd("b")
# llist.insertAtBegin("c")
# llist.insertAtEnd("d")
# llist.insertAtIndex("g", 2)

# print the linked list
# print("Node Data")
# print(llist)

# remove a nodes from the linked list
# print("\nRemove First Node")
# llist.remove_first_node()
# print(llist)
# print("Remove Last Node")
# llist.remove_last_node()
# print(llist)
# print("Remove Node at Index 1")
# llist.remove_at_index(1)
# print(llist)


# print the linked list again
# print("\nLinked list after removing a node:")
# print(llist)

# print("\nUpdate node Value")
# llist.updateNode("z", 0)
# print(llist)

# print("\nSize of linked list :", end=" ")
# print(llist.sizeOfLL())
# print(llist)