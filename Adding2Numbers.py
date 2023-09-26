# Write pseudocode to calculate and display the sum of two numbers entered by the user.

# assign var, var1 var2, for the numbers user will enter
# var1 = number 1, var2= number 2
# ask user to enter two numbers
# convert str to int
# assign var for var+var2
# print var1 + var2

x = input("Enter a number: ")
y = input("Enter another one: ")
# xInt = int(x)
# yInt = int(y)

try:
    x = int(x)
    y = int(y)
except:
    print("A number dumbass")

# c = (xInt + yInt)

c = (x+y)

print(x," + ",y," = ", c)

