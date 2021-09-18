# What to expect in recursion?

If you are a driver you tend to realize that for many destinations there are multiple ways of getting there. Some routes are shorter in distance but slower in time to arrival. Programmers are always afforded options of solving problems. There is a Turing complete toolset that you learned in **Programming Fundamentals I:** *Variables* and *assignments,* *Decision Structures,* and *Loops.* As knowledge increases, a programmer learns even more sophisticated approaches to solving problems.

!!!info Loops **are a basic programming concept. If a condition is true, execute the adjoining statement(s) then check to see if the condition is still true.** 

!!!info Recursion **borrows that concept but instead of using trademarked looping keywords `[for, while, do-while]` recursion understands that a method that calls itself repeats the statements defined in the method. That is essentially a loop.**

!!!info Recursion **understands that a method that calls itself repeats the statements defined in the method. That is essentially a loop.**

* This chapter helps to break down the concept of how Recursion works. 

* There is a solution condition that is the simplest solution of the algorithm. 

* Then the other portion of the method works to the breakdown of the complex to the simple. 

!!!caution One thing to note is that it is wise that recursive methods be **parameterized,** otherwise, that method will never end.

Recursion gives programmers another way to approach complex algorithms and in many cases can save programmers a lot of lines of code. 

In my opinion, there are two trade-offs; the first is system-related and the second is coder-related. 

* **First,** method calls require much more system overhead usage. There is more to a method call than meets the eye. 
  * The state of the current method has to be saved and placed on the system stack with the return point in mind. 
  * The called method will then execute. 
  * That many repeated calls can make flippant use of recursive techniques a performance hindrance. 
  * Recursion should be used in a sparing, code-conscious manner. 
* **Secondly,** for beginner programmers, recursion does not come readily to mind. In many instances programmers will choose to program using a loop rather than recursion. More understanding of recursion and its benefits will allow programmers to eventually become more comfortable and use recursion wisely in their endeavors.