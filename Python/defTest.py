#Defining Functions
#Use the "def" keyword to define a function
#Functions can be identified by the () at the end of them

def hello():
   print("Hello") #every indented line underneath the "def" statement (line 5) will considered a part of the function
   
name = input("(1)What's your name? ").strip().title()
"""
strip removes extra spaces between words 
Title capitalizes the first letter of every word
"""
hello()
print(f", {name}.")

#2- customizing the hello function to display the name on a single line
def hello2(to): # < The text in the () is the parameter
   print("Hello,", to)

name = input("(2)What's your name? ").strip().title()
hello2(name)#< The "name" variable replaces the "to" parameter
#Parameter essentially functions as a placeholder for a variable

#3- Giving parameters default values
def hello3(to="world"):
   print ("hello,", to) 

hello3()
name = input("(3)What's your name? ") 
hello3(name) #You can still assign a different variable in place of the default parameter

#4- Using multiple functions 

def main():
   name = input("(4)What's your name?").strip().title()
   hello4(name)
   
def hello4(to = "World"):
   print ("Hello,", to)
   
main()