#Using "match" syntax 
print ("Using match syntax\n")
name = input("What's your name? ")

#match is basically the same as switch statement
match name:
   case "Harry" | "Ron" | "Hermoine": #Use | to separate cases
      print ("Griffindor")
   case "Draco":
      print ("Slytherin")
   case _: #case functions as the default in a switch statement
      print ("Who?")