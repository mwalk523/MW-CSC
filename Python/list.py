#experimenting with lists
names = [] #square brackets indicate a list 

for _ in range(3):
    names.append(input("What's your name? ")) #"append" adds the result of the input to the list

for name in sorted(names): #sorted function sorts the list (alphabetically?)
    print (f"hello, {name}")

#names.py uses file i/o to save the information in the lists