"""
print ("1. Inside voice \n", end = "")
input = input("Please enter input: ")
input = input.lower() #lower() is the python equivalent of toLowerCase()
print(f"{input}")
print("shhhh... inside voice")
"""

"""
print ("2. Playback Speed")
def playback(to):
   to = to.replace(" ", "...") #replace(x, y) replaces x with y 
   print (to)

input2 = input("Please enter a sentence: ")
playback(input2)
"""
print ("3. Making faces")
def makingFaces(face):
   face = face.replace(":happy_face:", ":)").replace(":sad_face:", ":(")
   print(face)
   
input3 = input("Please enter an input with either :happy_face: or :sad_face: ")
makingFaces(input3)
  
print("4. einstein")
mass = int(input("Enter a value for mass: "))
def square(x):
   return x * x #remember, return allows you to pass the function to another function, such as a print function, or in this case, a mathematical operation


def emc(x):
   E = x * square(300000000)
   print(f"E = {E} joules")

emc(mass)

