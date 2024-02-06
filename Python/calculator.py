#Math functions and Return Values

print("calculator\n")

x = int(input("What's x? ")) #x and y are int variables
y = int(input("What's y? "))
"""
nesting functions (int and input) using casting operators. 
You must use casting operators here otherwise the program will read the input as a string and not execute correctly
"""
print("", x + y, sep = "x + y is ") 

#same thing but with float variables
x = float(input("What's x (decimal)? ")) #x and y are int variables
y = float(input("What's y (decimal)? "))#nesting functions (int and input) using casting operators 
z = round(x + y)
print("", z, sep = "x + y is ") #using round function to round to the nearest integer 
print(f"x + y is {z:,}") #the :, next to z adds a comma for readability
"""
round(number[ndigits]) < format 
"ndigits" is optional and would be replaced with however many digits you wish to round to. It rounds to the nearest int by default
"""

z = round((x / y), 2) #rounding to a specific number of decimals 
print (z)

z = x / y
print(f"{z:.2f}") #another way to round in a print function, similar to format strings in java 

#Return Values 
print("Return Values")
def main():
   x = int(input("What's x? "))
   print("x squared is", square(x)) #square(x) is a function
   
def square(n):
   return n * n #return keyword lets you pass the return value to another function, such as print 
   
main()
"""
Other method for increasing something by a power include:
x ** {power}
pow(x, {power})
"""

   
