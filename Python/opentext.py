with open ("namesw.txt", "r") as file: #the "r" indicates that we want to read the file
    lines = file.readlines() #reads the lines of the file and returns them

for line in lines: 
    print ("Hello,", line)