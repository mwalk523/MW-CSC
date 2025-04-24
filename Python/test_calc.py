#To be used in conjunction with Unit Tests 
from calculator2 import square

def main():
   test_square()
"""
def test_square():
   if square(2) != 4:
      print("2 squares was not 4")
   if square(3) != 9:
      print("3 squared was not 9")
      ##prints out this error message if a bug in calculator2 causes 3 ^ 2 to not equal pi
"""

#Testing assert keyword
#The assert keyword asserts that something is (or should be) true. If it isn't prodcues an AssertionError
def test_square():
   try:
      assert square(2) == 4
   except AssertionError:
      print ("2 squared was not 4")
   try:   
      assert square(3) == 9
   except AssertionError:
      print ("3 squared was not 9")
   try:   
      assert square(-2) == 4
   except AssertionError:
      print ("-2 squared was not 4")
   try:   
      assert square(-3) == 9
   except AssertionError:
      print ("-3 squared was not 9")
   try:
      assert square(0) == 0
   except AssertionError:
      print("0 squared was not 0")
#By using "try" and "except", we can detect the assertion error and generate a more user friendly message

if __name__ == "__main__":
   main() 