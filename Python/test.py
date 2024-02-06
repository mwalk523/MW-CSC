#Print functions
#This is a test program for python in jgrasp
#notice differences from java, such as no structure

"""
Multiline comment: 3 quotation marks
"""


name = input("What's your name? ") #input command only works for Strings
print("hello, \n" + name + "\n") #uses plus signs to add variables in a print statement, similar to java
#\n, \t, and other shortcuts also work  

name = name.strip().title()

#split user's name into first and last name
first, last = name.split(" ")  

""" String manipulation 
{string name}.strip() < removes excess spaces on the right and left of the string
.capitalize() < capitalizes first letter of string
.title() < capitalizes the first letter of each word in the string
These commands can be chianed together (name.capitalize().title())
"""

print("hello,", end="") 
"""
using the "end" argument, you can change how the print statement ends
instead of having it end with \n and moving the cursor to the next line
which it would normally do when
the next statement is on a different line, we leave it blank to remove that 
so it prints the name on the same line 
"""
print(name)

print("hello,", name)  
"""
alternatively, you can use a comma
to add a space so that you don't have to add it in the quotes 
"""

print("hello,", name, sep=' uhhh ')  
#can use the sep parameter to change what the comma does

#sep and end are named parameters, the values you've been passing through print (ie the actual statements) are positional parameters

print (f"hello, {first}.")
"""
similar to java format specifiers, except the f goes inside parentheses 
and there is no variable list at the end, just put them in {} braces.
"""

