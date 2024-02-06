#1. Using loops in lists
print ("1. Using loops in lists")
students = ["Hermoine", "Harry", "Ron"] #cloased barackets indicates a list
print (students[0]) #use the number in closed brackets to indicatie which entry in the list gets pulled
#Or, you can use a loop

print("\n")
for student in students: #Students isn't necessarily needed but specifies what is being pulled and printed
   print (student) #Python initializes the students in the list as the "student" variable
   
print("\n2. Iterate using numbers with len")

for i in range(len(students)): #len takes the length of the list (in this case, 3) and returns it to length
   print(students[i])
   
print("\n")

for i in range(len(students)):
   print(i + 1, students[i]) #this will print out the students preceded by their placement in the list
#remember, the comma will automatically add a space
"""
      How the for loop works:
      - Assigns creates a variable by the name of whatever is in the place of _ (in this case, students)
      - Assigns that variable to the first object in the list (in the case of range, this would be 0)
         - Range itself is a list
         - However, since this is still a list of strings, each number in the range corresponds to an entry
      - Then assigns the variable to the next thing in the list and then executes the indented code each time
"""

#Dictionaries - Used to associate something with something (in this case, a student with a house)
print ("\nUsing Dictionaries")
students = ["Hermoine", "Harry", "Ron", "Draco"]
houses = ["Gryffindor", "Gryffindor", "Gryffindor", "Slytherin"]
#Instead of using lists here, we can use dictionaries as shown below

students = {
   "Hermoine" : "Gryffindor", 
   "Harry" : "Gryffindor",
   "Ron" : "Gryffindor",
   "Draco" : "Slytherin"
} #Curly braces used to create dictionaries, instead of []
print (students["Hermoine"]) #Instead of using numbers to call entries as seen in lists, we ca use words here to get what said word is associated with
print (students["Harry"])
print (students["Ron"])
print (students["Draco"])

for student in students:
   print (student, students[student], sep = ", ") #Indexes the dictionary and prints out both the name and the associated string

#Lists of Dictionaries - Used to make multiple dictionaries with multiple keys (in this case, a student with their house AND patronus)
print ("\nLists of dictionaries")
students = [ #Beginning of list
   {"name": "Hermoine", "house": "Gryffindor", "patronus": "Otter"}, #beginning of dictionary (don't forget the comma at the end!)
   {"name" : "Harry", "house" : "Gryffindor", "patronus" : "Stag"}, #Beginning of second dictionary
   {"name" : "Ron", "house" : "Gryffindor", "patronus" : "Jack Russell Terrier"}, #Name and house are called keys
   {"name" : "Draco", "house" : "Slytherin", "patronus" : None} #End of dictionaries
] #End of list
#"None" is its own keyword

for student in students:
   print (student["name"], student["house"], student["patronus"], sep = ", ")