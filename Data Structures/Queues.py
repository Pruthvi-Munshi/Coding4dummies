# Queue - a data structure that follows FIFO (first in first out)
# use the list data structre and modify with our own classes and methods

# Operations
# enqueue(item): Add an item to the queue
# dequque(): Removes an item from the queue
            #    - in the same order they are pushed
# front()/peek(): gets the front item from the queue, depends on program some say peek some say front
# rear(): gets the last item from the queue

# advantages
# - easy to implement as it follows fifo
# - easy to insert/delete items in the queue
# - can add an element(iten) any time in the end

# disadvantages
# - not easy to delete elements from the middle
# - difficult to create and maintain

# my_list = [1,2,3]
# print(my_list[-1]) #returns 3, the negative in here just means you wwant to return the last object, -3 would return 1

class Queue:
    def __init__(self):
        self.queue = []

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if not self.is_empty():
            return self.queue.pop(0) #.pop removes the last item
        else:
            return "Queue is empty"

    def peek(self):
        if not self.is_empty():
            return self.queue[0]
        else:
            return "Queue is empty"

    def front(self):
        return self.peek()
        
    def rear(self):
        if not self.is_empty():
            return self.queue[-1]
        else:
            return "Queue is empty"
        
    def is_empty(self):
        return len(self.queue) == 0