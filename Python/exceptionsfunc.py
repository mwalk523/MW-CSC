#supplementary exercise to exceptions.py, except in this one I write it as a function
def main():
   x = getInt("What's x? ") #Executes get_int with the prompt/what's int 
   print(f"x is {x}")

def getInt(prompt):
   while True: #while loop
      try: #try block is basically the same as in java 
         return int(input(prompt)) #functions in a similar manner to break, but actually returns x from the function
                           #Adding "prompt" allows the code to pass to input whatever the user has provided (if they wanted to ask for y, for example)
         """              
         using a parameter such as prompt makes the code more reusable 
         by allowing the user to ask for any variable they want
         """ 
      except ValueError: #except is essentially a catch phrase
         pass #the pass keyword enables your code to catch the exception, but ignores it instead of doing anything further 
   
main() #call the main function at the end, in which the getInt() function is called
"""
by using the while loop, we can have the program prompt the user to enter again.
break exits the loop early, so if nothing goes wrong, exits the loop
"""    

#print (f"x is {x}") < print statement we would use if not for main()

"""
If you try to do the print statement without the else keyword,
Name Error is thrown, because a string is entered instead of an int.
The ValueError occurs before x gets defined, and the value 
never actually passed to the variable.

The except block for NameError  would look like this: 

except NameError:
   print ("Can only print integer")
""" 

#NEXT: Libraries