#supplementary exercise to exceptions.py 
while True:
   try: #try block is basically the same as in java 
      x = int(input("What's x? ")) 
   except ValueError: #except is essentially a catch phrase
      print("x is not an integer", end = "!\n")

   else: #the else keyword is usable with conditions to indicate "otherwise", with exceptions it indicates "if nothing goes wrong do this"
      break
"""
by using the while loop, we can have the program prompt the user to enter again.
break exits the loop early, so if nothing goes wrong, exits the loop
"""    

print (f"x is {x}")

"""
If you try to do the print statement without the else keyword,
Name Error is thrown, because a string is entered instead of an int.
The ValueError occurs before x gets defined, and the value 
never actually passed to the variable.

The except block for NameError  would look like this: 

except NameError:
   print ("Can only print integer")
"""