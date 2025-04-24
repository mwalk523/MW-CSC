#Importing custom library
import sys

from sayings import hello #import hello function from the sayings file/library

if len(sys.argv) == 2:
   hello(sys.argv[1])