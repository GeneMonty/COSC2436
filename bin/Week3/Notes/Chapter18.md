# Chapter 18 Recursion

A recursive method is one that invokes itself **directly** or **indirectly.**

## Base Case ( stopping condition)

A statemnt in a method to solve the simplest cases

``` java
0! = 1;
n!= n * (n-1)!;n>0

if(n == 0)
    return 1;
else
    return n* factorial(n-1);
```

If you call the method with `n > 0` it reduces the problem into a **subproblem** for computing the factorial of `n − 1` . 

The subproblem is essentially the same as the original problem, but it is simpler or smaller. Because the **subproblem** has the same property as the original problem, you can call the method with a different argument, which is referred to as a **recursive call.**

!!! info Rursive call is calling the method with a differente argument that has the same property as the original argument.

- A recursive call can result in many more recursive calls because the method keeps on dividing a subproblem into new subproblems.
- To terminate, the problem must eventually be reduced to a stopping case, at which point the method returns a result to its caller.
- The caller then performs a computation and returns the result to its own caller and continues continues until the result is passed back to the original caller.

!!!note Using a loop is simpler and more efficient than recursive calls.

!!!note If recursion does not reduce the problem in a manner that allows it to eventually converge into the base case or a base case is not specified, **infinite recursion** can occur. For example, suppose you mistakenly write the factorial method as follows:

```java
public static long factorial(int n) { return n * factorial(n − 1);
}
```

this method casues  a **StackOverflowError**

## Direct Recursion

A function that calls itself.

## Indirect Recursion

A `Method A` that calls a `Method B`, which directly or indirectly calls `Method A`.

## Performance 

Recursive methods requrie more time and memory than using loops. Not always practical they have their uses.

### Table of calls for a fib(index)

| Number of Recursive Calls in fib(index)                                                              |||||||||
| --------------------------------------- | - | - | - | --- | ------ | --------- | ----------- | ------------- |
| index                                   | 2 | 3 | 4 | 10  | 20     | 30        | 40          | 50            |
| \# of calls                             | 3 | 5 | 9 | 177 | 21,891 | 2,692,537 | 331,160,281 | 2,075,316,483 |

## 18.4  Problem Solving Using 
!!!info If you think recursively, you can solve many problems using recursion.

### Charactersitc of Recursive methods

- Implemente using `if-else` or `switch` statements
- One or more Base cases to stop recursion.
- Every recursive call reduces the original problem, until it becomes a base case.

To solve using recursion:
- break into sub-problems.
- each is same as original, but smaller.
- recursive approach can be applied to sub-problems.

#### Drinking cofee recursivley
```java
public static void drinkCoffee(Cup cup){
    if (!cup.isEmpty()){
        cup.takeOneSip();
        drinkCoffee(cup);
    }
}
```

### Print Messege Recursively

```java
public static void nPrintln(String messege, int times){
    if (times >=1) {
        System.out.println(messege);
        nPrintln(messege,times-1);
        
    }// The base case is times==0
}
```

## Palindrome
If you **think recursively** you can use recursion to solve many of the problems presented in earlier chapters of this book.

**Palindrome** reads from left to right the same.
"dad" and "mom","kayak".

- Check if `first` & `last` char of the string are equal.
- Ignore the two end character and check wehtere the rest of the substring is palindrome.

