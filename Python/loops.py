#Loops (and lists)
print ("\n1. While loops")
x = 0 
while x <= 4: # != is a conditional operator that means "not equal"  
   print("\nmeow", x, sep = ", x equals ")
   x += 1

#for loops and lists
print ("\n2. For loops and lists")
for x in [0, 1, 2]: #0 is initialization of the variable, 1 and 2 are values that x is updated to each loop. Each 'x' is basically one of these values (think of enhanced for loop)
   print ("moew")
#The list basically ensures that the for loop executes 3 times 

#Using range function 
for x in range(5): #similar to enhanced for loop 
   print ("\nmeow", end = "") #prints meow 5 times
print ("\n")

# An easier way to set the number of loops is to use the range function, which specifies the number of values the user wants back 

#Using print function in a similar way 
print ("\nmeow" * 3, end = "")

print ("3. Using loops for validation")
#How do you use loops to ensure a user enters the correct number???
while True: #while True will always produce an infinite loop
   y = int(input("Enter a positive integer for number of meows"))
   if y < 0:
      continue #continue is a keyword that does just that: continue the loop
   elif y >= 0:
      break #keyword that breaks out of the loop

for _ in range(y): 
   print ("\nmeow", end = "") #prints "meow" however many times the user entered 
  
print("\n4. Using functions for validation\n")

def main():
   number = get_number()
   meow(number)

def get_number():
   while True: 
      n = int(input("What's n? "))
      if n > 0: 
         return n #remember that using return gives the user an actual value that they can then use in other functions
         #Return both breaks out of the loop AND hands back a value  
      else:
         continue
         
def meow(n):
   for _ in range (n): 
      print ("meow")
      """
      How the for loop works:
      - Assigns creates a variable by the name of whatever is in the place of _
      - Assigns that variable to the first object in the list (in the case of range, this would be 1)
      - Then assigns i to the next thing in the list and then executes the indented code each time
      """

main()

   