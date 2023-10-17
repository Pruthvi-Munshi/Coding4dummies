# Big O: Notation, is a way to describe the performance of an algorithm. Used to analyze
#        and compare the efficiency of a algorithm

# 1. What is Big O notation?
#    Big O notation describes the upper bound of the time or space complexity of an
#    algorithm in the wort-case scenario.

# 2. Why is Big O important?
#    Efficiency matter: Efficient algorithms can process data faster and use less memory.
#    Scalability: Big O helps us predict how our algorithms will perform as the input size grows.

# 3. Common Time Complexities:
#    O(1) - Constant time: Operations will take the same amount of time regardless of the input size.
#       Example: accessing an element in an array using its index.

#    O(log n) - Logarithmic Time:the time it takes to complete an operation is reduced by a fraction
#    with each operation. Common in divide and conquer algorithms like bninary search.

#    O(n) - Linear Time: the time taken by an operation increases lineraly with the size on the input.
#        Example: iterating through an array.

#    O(n log n) - Linerithmic Time: common in efficient sorting algorithms like quicksort and merge sort.

#    O(n^2) - Quadratic Time: Time is proportional to the square of the input size. Common in nested loops.

#    O(2^n) - Exponential Time: time grows exponentially with the input size. Often found in recursive
#    algorithms without memoization.

# 4. Common space complexities:
#    O(1) - Constant space: the algorithm uses a fixed amount of memoery, regardless of the input size.
#    O(n) - Linear space: Memory usage grows linearly with the input size. Example: sorting input
#    elements in a array
#    O(n^2) - Quadratic Space: Memory usage growms quadratically withthe input size. Common in algorithms 
#    using nested arrays or matrices.

# 5. Tips of understanding and analyzing Big O:
#    Focus on dominant terms: For complex algorithsm, focus on the term that grows the fastest as the input
#    size increases.
#    Drop Constants: Big O natation ignores constants, focusing on the overall trend of the algorithm's growth.
#    Worst-case analysis: Big O often represents the worst-case scenario, helping us understand the ipper limit
#    of an algorithm's performance.