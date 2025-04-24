name = input("What's your name? ")

#save the person's name to a file
with open ("names.txt", "a") as file: #the "a" indicates that we want to append (save) to the file
    file.write(f"{name}") #by indenting this line under the "with" line ensures that the line executes within the context of the line above. This way, the file will close on its own
#the close command is not necessary if you use the "with" command (see nameswith.py)
"""
rm [text file name].txt to delete a file
code [text file name].txt to open a file in visual studio code
"""