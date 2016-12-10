# Functional Programming in Scala

Done as part of Coursera's Functional Programing in Scala course. Each project folder uses SBT to run units tests, and code.
Using `sbt` with the `test` command in the root folder will run all of the unit test for each project.

Using `sbt` with the `run` command will run the code in the main functions in src/main/scala.


##Week 1
###Exercise 1
Make a recursive function that calculates pascal's triangle.

###Exercise 2
Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String. For example, the function should return true for the following strings:

* (if (zero? x) max (/ 1 x))

I told him (that it’s not (yet) done). (But he wasn’t listening)
The function should return false for the following strings:
* :-)
* ())(

### Exercise 3
Write a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.