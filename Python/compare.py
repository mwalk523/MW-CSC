#Conditionals 
"""
Python uses the same operators as Java:
<
>
<=
>=
++
!=
"""

#Basic conditional statements  

print("Basic conditional statements")
x = int(input("What's x? "))
y = int(input("What's y? "))

if x < y: #instead of uses parentheses you use the statement followed by a colon 
   print ("x is less than y") #indentation tells python to only execute line 5 if the boolean expression is true
#If you do not indent the code will not work

if x == y:  
   print("x is equal to y")
   
if x > y:
   print("x is greater than y")

# Using elif  
print("\nUsing elif")
x = int(input("What's x? "))
y = int(input("What's y? "))

if x < y: #instead of uses parentheses you use the statement followed by a colon 
   print ("x is less than y") #indentation tells python to only execute line 5 if the boolean expression is true

elif x == y: #Combination of "else-if", takes into account whether a previous question was true or false.  
   print("x is equal to y")
# If the previous expression/question was false, the program moves to the next question  
# However, if the statement is true, it will execute the associated code and ignore the other questions   
elif x > y: #elif makes the conditionals mutually exclusive so the program isn't asking those questions each time
   print("x is greater than y")

#Using else 
print("\nUsing else")
x = int(input("What's x? "))
y = int(input("What's y? "))

if x < y: #instead of uses parentheses you use the statement followed by a colon 
   print ("x is less than y") #indentation tells python to only execute line 5 if the boolean expression is true

elif x == y: #Combination of "else-if", takes into account whether a previous question was true or false.  
   print("x is equal to y")

else: #you can use else as well
   print("x is greater than y")
   
#Using or 

print("\nUsing or")
x = int(input("What's x? "))
y = int(input("What's y? "))

if x < y or x > y: #no || operator, you can just type or 
   print("x is not equal to y")
   
else: 
   print ("x is equal to y")
   
#Using !=

print("\nUsing !=")
x = int(input("What's x? "))
y = int(input("What's y? "))

if x != y:
   print("x is not equal to y")
   
else: 
   print ("x is equal to y")

#Using and

print ("\nUsing \"and\"")
score = int(input("\nScore: "))

if score >= 90 and score <= 100:
   print ("Grade: A")
elif score < 90 and 80 <= score:
   print ("Grade: B")
elif 80 > score >= 70: #combining ranges/boolean expressions
   print ("Grade: C")
elif score >= 60 and score < 70:
   print ("Grade: D")
elif score < 60: 
   print ("Grade: F")
  
#Defining a function to tell if a number is even or odd 

def main():
   x = int(input("What's x? "))
   if is_even(x): #if is_even is true 
      print ("Even")
   else:
      print ("Odd")
      
def is_even(n):
   if n % 2 == 0:
      return True #using a bool (like a flag)
   else:
      return False

#A more condensed way to write the above code  

   
def is_even(n):
   return True if n % 2 == 0 else False
   
   #or 
   
   return n % 2 == 0

      
main()