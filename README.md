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
    * **INSERT** an array will take $O(1)$ time and $O(1)$ space. It will be $O(1)$ time, because the more it doubles, the more $O(1)$ operations will appear compared to $O(n)$ operations.
      * **Worst case** is $O(n)$ time
      * Inserting at the **middle** or **beginning** will be $O(n)$, because you have to shift over all the other elements
    * **Popping** $O(1)$ time and space (if you are removing the last element of the array)
    * **Shifting**(popping) from the middle or beginning of an array will be $O(n)$ time $O(1)$ space
    


