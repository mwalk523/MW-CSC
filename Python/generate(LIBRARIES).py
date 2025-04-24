#Library - files of code (written by you or others) that can be shared and used in other programs 
#Module - Library with one or more functions built into it
"""Library examples:
random - docs.python.org/3/libray/random.html
statistics - docs.python.org/3/libray/statistics.html
sys - docs.python.org/3/library/sys.html
"""

#Flipping coin example
#----------------------
import random #use "import" to import the random module, similar to java

coin = random.choice(["heads", "tails"]) #choice is one function within the random module
               #the [] indicate the presence of a list  
print ("coin: " + coin)
#--------------------


#"From" keyword 
"""
#---------------------
from random import choice

coin = choice(["heads", "tails"]) #"from" allows you to use choice without the random.
print (coin)
#---------------------
"""

#random integer
#-------------------
number = random.randint(1, 10)
print (f"Random int: {number}")
#------------------

#Shuffle 
#-----------------
cards =  (["jack", "queen", "king", "ace"])
random.shuffle(cards)
print(cards) #just using print on its own will print out the list of cards, instead of one by one
for card in cards: #for each card in that list, print out one at a time
   print(card)
#-----------------

#Statistics library 
#-------------------
import statistics

print ("Mean:", end = " ")
print (statistics.mean([100,90])) #prints the average of whatever's in the brackets
#-------------------

#Command-line arguments/ interfaces
#A feature that allows you to provide inputs to the program just when you're executing at the command line
#sys - a module that contains functionality specific to the system itself