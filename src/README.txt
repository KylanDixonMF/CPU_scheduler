****************
* Lab 1
* CS321
* 2/4/22
* Kylan Dixon
**************** 

OVERVIEW:

This is an up to 2 level Cache project that stores copy data
in the cache to enable efficient use of access the information.



INCLUDED FILES:
 * Cache.class - source file
 * Cache.java - source file
 * test.java - source file
 * README - this file


COMPILING AND RUNNING:

 From the directory containing all source files, compile the
 driver class (and all dependencies) with the command:
 $ javac test.java

 Run the compiled class file with the command:
 $ java test 2 1000 2000 ../Encyclopedia.txt
 **Note the number in args 2 must be larger than args 1 to run.

 Console output will give the results after the program finishes.


PROGRAM DESIGN AND IMPORTANT CONCEPTS:

I created this 2 level cache system based on a cache class
that only contains one linked list. I am able to run it as a 2 
level cache via the multiple cache system in the test.java file.

The linked list is created as level one and a seperate linked list 
is created as level 2. From there the code is able to distinguish
between the 2 levels of the cache.

The cache class finds the capacity of the cache, as well as the data stored in it
using the find method. It also adds data and moves it around as necessary.

The caches are set to null and filled in as the scanner parses through
the lines and words of the .txt file. If the word is not located in either
cache it is added to the cache system. If it is found then it moves the word
to the front of the cache and increments accordingly.

Finally the results of the hits, accesses, and ratios are calculated
and the output is published to the console.
 

TESTING:

 Testing was first done with the small .txt file to see where errors occurred. If
 a bug was located from the error message I would directly fix it. When the error
 was more subtle I would create breakpoints to see where it was going wrong.
 Typically it was a logic or syntax error that was relatively easy to fix.
 Then it was tested on Encyclopedia.txt to see if it would return correct
 results with larger data sets.


DISCUSSION:
 
I had code initially that worked, but was messy and didn't run well.
I optimized it and simplified it to get a more efficient output and
better looking arangement.
 
 


----------------------------------------------------------------------------

All content in a README file is expected to be written in clear English with
proper grammar, spelling, and punctuation. If you are not a strong writer,
be sure to get someone else to help you with proofreading. Consider all project
documentation to be professional writing for your boss and/or potential
customers.
