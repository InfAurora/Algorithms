# Algorithms

## Big O Notation (Space & Time complexity Analysis)
* **Time Complexity** - The amount of **time** it takes to execute your algorithm/code (time using big O notation, not literal seconds or milliseconds etc...)
* **Space Complexity** - The amount of **space** in memory that is needed to execute your algorithm/code
* **$O(1)$** - Constant time
* **$O(log(n))$** - Logarithmic
* **$O(n)$** - Linear
* **$O(nlog(n))$** - Linearithmic
* **$O(n^2)$** - Quadratic
* **$O(2^n)$** - Exponential
* **$O(n!)$** - Factorial
  * **NOTE** ~ When speaking about complexity, you must specify if you are talking about avg. or worst case

## **Logarithms**
 * In computer science base (b) is assumed to be 2. So $log{_b}(n) = y$ becomes $log{_2}(n) = y$. 
 * $log{_2}(n) = y$ is the equivalent to $2^y=n$ 
 * Logarithms are basically cutting n in half repeatedly. Example ${0 |,1 |,2,3 |,4,5,6,7}$

## **Arrays**
 * **Static Arrays**
    * Arrays need to store spaces in memory back to back
   * A static array, is an array where you have to specify the size of the array, and that array size will never change.
   * **Getting** or **setting** in a static array runs in constant time $O(1)$
   * **Creating**(Initializing) an array will take up $O(n)$ space
   * **Traversing** an array will take $O(n)$ time and $O(1)$ space
   * **Copying** an array will take $O(n)$ time and $O(n)$ space
   * **INSERT** an array will take $O(n)$ time and $O(1)$ space

 * **Dynamic Arrays** 
    * A dynamic array, is an array that can change in size
    * The array will allocate more(roughly double) space then what is being asked for
    * If you try to add more then the space that was originally allocated, the system will then copy the array and give you more(roughly double) space again
    * **INSERT** amortized an array will take $O(1)$ time and $O(1)$ space. It will be $O(1)$ time, because the more it doubles, the more $O(1)$ operations will appear compared to $O(n)$ operations.
      * **Worst case** is $O(n)$ time
      * Inserting at the **middle** or **beginning** will be $O(n)$, because you have to shift over all the other elements
    * **Popping** $O(1)$ time and space (if you are removing the last element of the array)
    * **Shifting**(popping) from the middle or beginning of an array will be $O(n)$ time $O(1)$ space
    
## **Stacks and Queues**
* **Stack**
  * Data structure that inserts and removes using **LIFO**
  * Under the hood a stack is implemented with a **dynamic array** or **singly linked list**
  * Cost to store a stack is $O(n)$ space
  * Can create a **max or min stack** (keeps track of max or smallest element)
  * LIFO - Last in First out. The last thing that is inserted in, is also going to be the first thing that comes out
  * **PUSH**(insert) $O(1)$ time & space
  * **POP**(remove) $O(1)$ time & space
  * **SEARCH**(remove) $O(N)$ time & $O(1)$ space
  * **PEAK**(look at top) $O(1)$ time

* **Queue**
  * Data structure that inserts and removes using **FIFO**
  * Under the hood a Queue is implemented with a **doubly linked list**
  * Cost to store a queue is $O(n)$ space
  * Can create a **priority queue** (keeps track of what has the highest priority)
  * FIFO - First in First out. The first thing that is inserted in, is also going to be the first thing that comes out
  * **ENQUEUE**(insert) * **Stack** time & space
  * **DEQUEUE**(remove) $O(1)$ time & space
  * **SEARCH**(remove) $O(N)$ time & $O(1)$ space
  * **PEAK**(look at end) $O(1)$ time

## **Linked List**
* Conceptually similar to an array.
* It differs by how it is implemented/stored in memory
  * Linked lists will store elements **anywhere** in memory, and will **connect them using pointers**
  * The element and its pointer need to be stored back to back in memory
* **Head** - beginning of linked list
* **Tail** - end of linked list
* **Circular** - you can make a circular linked list (head points to tail or vice versa)
* **SINGLY**
  * **INIT** $O(n)$ time & space
  * **GET** $O(i)$(i is the index) time, & $O(1)$ space
  * **SET**(override) $O(i)$(i is the index) time, & $O(1)$ space
  * **COPY** $O(n)$ time & space
  * **TRAVERSE** $O(n)$ time & $O(1)$ space
  * **INSERT** worst $O(n)$ time & $O(n)$ space
    * If you have reference to head or tail then it is $O(1)$ time & $O(n)$ space

* **DOUBLY**
  * Every single element has two pointers (next and previous)
  * Doubly linked lists should almost always have a reference to the tail, so you could go from the tail back to the head if you wanted to

## **Hash Tables**
* **Hash Table** is a data structure that allows you to store pairs of keys and values
* Hash tables are built on top of arrays. **Each value** in the array will be a **linked list**
* Hash tables can use any data type as a key to reference a value
  * A **hashing function** will be used to transorm an index position to be the data type you want it to be
  * If you are using a string as the key, each character in the string will be transformed into an integer(ascii value) and then all the numbers will get added up and divided(using modulo or %) by the number of index positions(length of array). The number you get will be the index position. **intValue % lengthOfArray = indexInArray**
  * A **collision** is when you get multiple values that need to be stored in the same index position. When a collision occurs, the value will be added to the linked list at that index
  * Each value within the linked list in the array, needs to point back to its key
  * If a hash table has run out of space, **resizing** can be used to adjust the size of the array. Example. if the array has used a little over have of its indices, it will double its array size and then use a different hashing function to fill itself back up
* Storing a hash table is $O(n)$ space
* **INSERTING** a key/value pair: $O(1)$ on average; $O(n)$ in the worse case
* **REMOVING** a key/value pair: $O(1)$ on average; $O(n)$ in the worse case
* **SEARCH** a value given a key: $O(1)$ on average; $O(n)$ in the worse case

## **Strings**
* **Strings** are typically mapped to an integer using an encoding standard (like ASCII).
  * Under the hood strings are stored as an array of characters
  * All operations done a single character on string (that are a fixed amount of bytes) will $O(1)$ time
  * Many languages strings are immutable (java, js, python)
  * If you are working with an immutable string ``` foobar += " word" ``` is not $O(1)$(constant) time operation it is $O(n + m)$(linear), because a copy of the original string is being created with the new string attatched to it to it
* **TRAVERSE** $O(N)$ time & $O(1)$ space
* **COPY** $O(N)$ time & space
* **GET** $O(1)$ time & space