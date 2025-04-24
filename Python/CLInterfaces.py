#Command Line Interfaces 
#sys library - docs.python.org/3/libray/sys.html

import sys 
if len (sys.argv) < 2: #detects if sys.argv is a certain length, in other words if the user entered something for sys.argv[1]
   sys.exit("Too few arguments") #similar to a return statement, prints the associeted string and exits the code
elif len(syn.argv) > 2:  
   print ("Too many arguments")
print ("hello, my name is", sys.argv[1]) #If you place a first AND last name in "", python and sys views them as one thing 


#Printing every name/element in argv 
if len (sys.argv) < 2: 
   sys.exit("Too few arguments") 
for arg in sys.argv:
   print ("hello, my name is", arg)  
#However, this would print ALL elements in argv, including argv. How do we print just a subset of the argv list?


#Slices 
if len (sys.argv) < 2: 
   sys.exit("Too few arguments") 
for arg in sys.argv[1:]: #The [1:] indicates the range from 1 to the end of the list. The omission of
   print ("hello, my name is", arg)#   a second number in the brackets indicate the "end" of the range is the end of the list itself


#Packages - A third-party library that you can download on your computer. Packages can be found at pypi.org
#Package Manager - A programa available for Python and other languages that allows you to install packages onto your computer by just running a command
"""
argv - argument vector
Describes the list of words that the user typed in at their prompt before 
  hitting enter

In something like VScode, where you manually typed run command, this would allow 
you to enter your name before pressing enter on run, so that the program 
already knows your name 

The [1] returns list index 1 aka the seconds entry in the list. Your name would be
second because the first entry ([0]) is the name of the program.

Example of command line -
   python name.py Miles < where Miles is argv[1]
If you do not type anything after name.py, you will receive an index error as argv[1] doesn't exist 

This doesn't work in Jgrasp because of how it works, but imagine this was in VS Code or something
"""

#Requests - A library that allows you to make web requests using python code