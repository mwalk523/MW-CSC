#To be used in conjunction with Unit Tests

def main():
   x = int(input("What's x? "))
   print("x squared is", square(x))
   
#Define the square() function   
def square(n):
   return n * n  
if __name__ == "__main__": #Conditional to execute main (I think this is applicable in VSCode)
   main()