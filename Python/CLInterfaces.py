#Command Line Interfaces 
#sys library - docs.python.org/3/libray/sys.html

import sys 
try:
   print ("hello, my name is", sys.argv[1])
except IndexError:
   print("Too few arguments")
"""
argv - argument vector
Describes the list of words that the user typed in at their prompt before 
  hitting enter

In something like VScode, where you manually typed run command, this would allow 
you to enter your name before pressing enter on run, so that the program 
already knows your name 

The [1] returns list index 1 aka the seconds entry in the list. Your name would be
second because the first entry (0) is the name of the program.
"""

