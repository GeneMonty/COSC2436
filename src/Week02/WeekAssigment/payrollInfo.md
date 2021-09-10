# Instructions
In this assignment, you are to create a class named `Payroll.`  

In the class, you are to have the following data members:

`name: String` (5 pts)
`id: String `  (5 pts)
`hours: int`   (5 pts)
`rate: double` (5 pts)
`private members (5` pts)

You are to create no-arg and parameterized constructors and the appropriate **setters(accessors)** and **getters** (mutators).  (20 pts)

### The class definition should also handle the following exceptions:

- An employee name should not be empty, otherwise an exception should be thrown. (10 pts)
- An employee id should have the form **LLNNNN (Letter Letter Number Number Number Number).**  
  - If that form is not received, an exception should be thrown. (10 pts)
- An employee's hours should neither be negative nor greater than **84.**  
  - `!((-n) and > 83)`
  - An exception should be thrown otherwise. (10 pts)
- An employee's pay rate should neither be negative nor greater than 25.00. 
  - `!((-n) and > 25.00)`
  - An exception should be thrown otherwise. (10 pts)
- Demonstrate this class in a program (separate class or in the same class).  (5 pts)

!!!The exception messages should be appropriate to the specific exception that has occurred. (5 pts)