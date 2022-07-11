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
  * **ENQUEUE**(insert) $O(1)$ time & space
  * **DEQUEUE**(remove) $O(1)$ time & space
  * **SEARCH**(remove) $O(N)$ time & $O(1)$ space
  * **PEAK**(look at end) $O(1)$ time

