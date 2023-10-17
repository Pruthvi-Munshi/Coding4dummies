# Trees
# - a data structure in which data items are connected using references
#   in a hierachical manner in the form of edges and nodes

# Child Node
# - child nodes of a parent node are the nodes at which the parent node
#   is pointing using the references

# Edge
# - the refernce through which a parent node is connected to a child node

# Leaf Node
# - a node that has no children

# Internal Node
# - a node that has at least one child

# Root
# - the top most node

# Binary tree
# - a tree structure where each node can only have one, two, or no children

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self, root_data):
        self.root = TreeNode(root_data)

    def insert_left(self, parent_node, data):
        new_node = TreeNode(data)
        parent_node.left = new_node

    def insert_right(self, parent_node, data):
        new_node = TreeNode(data)
        parent_node.right = new_node