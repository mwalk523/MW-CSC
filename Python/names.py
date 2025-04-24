"""
Use in conjunction with with nameswith.py, names.txt, namesw.txt, and openwith.py
"""

name = input("What's your name? ")

#save the person's name to a file
file = open ("names.txt", "a") #the "a" indicates that we want to append (save) to the file
file.write(f"{name}\n") #ensures that the names are saved with a new line
file.close()
#the close command is necessary to save the changes to the file
#the close command is not necessary if you use the "with" command (see nameswith.py)
"""
rm [text file name].txt to delete a file
code [text file name].txt to open a file in visual studio code
"""