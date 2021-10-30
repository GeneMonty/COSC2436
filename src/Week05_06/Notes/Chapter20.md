# Lists, Stacks, Queues, and Priority Queues

Keywords

- Collection
- Iterator
- forEach
- ArrayList or LinkedList
- Comparable
- Comparator
- Collection class
- Vector
- Stack
- Queue
- PriorityQueue

## 20.2 Collections

**Definition:**  A collection is a container that stores objects.

`Set` store a group of nonduplicate elements.
`List` store an ordered collection of elements.
`Stack` store objects that are processed in a last-in-first-out fashion.
`Queue` Store objects that are processed in a first-in-first-out fashion.
`PriorityQueue` store objects that are processed in the order of their priorities.

`Collection` interfaces is root interface to manipulate collections objects.
`AbstractCollection` class porvides partial implementation for the `collection` interface.

### Methods

All return boolean.

- `add()` adds an element to the collection.
- `addAll()`adds all the elements in the specified collection to this collection.
- `remove()`removes an element from the collection.
- `removeAll()`removes the elements from this collection that are present. in the specified collection.
- `retainAll()`retains the elements in this collection that are also present in the specified collection.
- `clear()`removes all the elements from the collection.

#### Query operations

`size()` returns number of elements in the collection.
`contains()` checks whether the collection contains the specified element.
`containsAll()` checks whether the collection contains all the elements in the collection
`isEmpty()` returns true if the collection is empty.

`toArray()` returns an array of objects.
`toArray(T[])` returns an array of T[] type.

!!!info Page 779 for sample program that creates a collection of objects using ArrayList and invokes collection interface.

## 20.3 Iterators

!!!info Each collectionis *iterable*. You can obtain its `Iterator` object to traverse all the elements in the collection.

`Iterator` Clasic design pattern for walking through a data structure without exposing the details of how the data is stored.

`Collection` interfaces `extends` the **Iterable** interface. You can obtain
### Methods 

`iterator()` uniform traverse the elements collection
`next()` provide sequential access to the elements in the collection
`hasNext()` checks wheter there are more element sin the iterator
`remove()` removes last element returned by iterator

!!!info P.780 for iterator code sample.

**Tip**
You can simplify the code in lines 11–14 using a foreach loop without using an iterator, as follows:

```java
for (String element: collection) 
    System.out.print(element.toUpperCase() + " ");
```

*This loop is read as “for each element in the collection, do the following.” The foreach loop can be used for arrays (see Section 7.2.7) as well as any instance of Iterable.*

### Using `var`

The compiler automatically figures out the type of the variable based on the context. For example,

!!!Warning bad of of `var`

```java
var x = 3;
var y = x;
```

The real good use of the var type is to replace long types. For example,

```java
Iterator<String> iterator = new ArrayList<String>().iterator(); 
```

!!!info Good use of `var`

```java
var iterator = new ArrayList<String>().iterator();
```

## 20.4 Using `forEach` Method

!!!info You can use the forEach method to perform an action for each element in a collection.

`Consumer<? super E>` Consumer interface defines the `accept(E e)` methods, by performing an action on element `e`.

!!!info P.782 sample for each method.

```java
import java.util.*;
public class TestForEach{
    public static void main(String[] args){
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        
        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
    } // above is a lambda expression
}

```

!!!info Output: NEW YORK ATLANTA DALLAS MADISON

## 20.5 Lists

`ArrayList` class and `LinkedList` class are two concrete implementations of the `List` interface.

!!!info `List` interface `extends` the `Collection` interface and defines a collection for storing elements in sequential order.

`ArrayList` defined under `List` interface.
`LinkedList` 
`List`

### Common Methods in List interface

The `List` interface `extends` `Collection` to define an ordered collection with duplicates allowed.

`List` interface adds position-oriented operations and a new list iterator that allows bidirectional traverse.

`add(index,element)` inserts element at specific index 
`addAll(index, collection)` inserts collection at specific index
`remove(index)` remoes element of the specificed index
`set(index,element)` set the specficied index using
`indexOf(element)` 
`lastIndexOf(element)`
`subList(fromIndex, toIndex)`
`listIterator(startIndex)`


#### ArrayList

trimToSize()

ArrayList(Collection) or ArrayList(initialCapacity)

### LinkledList

