# Java-TDD_Kata_Even_Odd
Simple java local application, using Test Driven Development methodology.

**Level: EASY**<br>
**Status: Completed**

Setup:
 - JDK 1.8.0_191
 - IDE IntelliJ Idea
 - Maven (IntellliJ Idea)

References:
[TDD Kata](https://www.programmingwithwolfgang.com/tdd-kata/)

# 1. Introduction
  TDD is a methodology that let implement efficient code. To use TDD in a project, all team members musth think in TDD mode, from functional analist to junior developer.
  The TDD paradigm consist in:
  1. Take funtional requirements like technical test cases
  2. Implement an basic unit test case
  3. Write the minimun code to pass the test case
  4. Refactoring the code
  5. Repeat the poings 2, 3 and 4 to cover all requirements.

In this example I will develop a simple application using TDD. Imagine you take the next requirements:
___
Given an array of numbers, determine whether the sum of all of the numbers is odd or even.

Give your answer in string format as ‘odd’ or ‘even’. If the input array is empty consider it as: [0] (array with a zero).

Example:

oddOrEven([0]) returns “even”
oddOrEven([2, 5, 34, 6]) returns “odd”
oddOrEven([0, -1, -5]) returns “even”<br>
___
Now we must think in basic unit test to cover every cases.
