# geeksforgeeks
My approach for solving problems

## TextJustification
Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified. 

You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly L characters. 

Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right. 

For the last line of text, it should be left justified and no extra space is inserted between words.

**For example**

words: ["This", "is", "an", "example", "of", "text", "justification."]

L: 16.

Return the formatted lines as:

```
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
```

## SumOfTwo
Given two arrays of integers 'A', 'B', and a value v, return true if there exists atleast one pair of sum, one value from A and B equal to v.

You may assume that the values are only positive.

**Example:**

```
A = {10, 35, 67, 9, 18};
B = {30, 44, 90, 31};
int v = 111;
```

Returns 'True' as there exists a pair 67 + 44 = 111 

## KMPAlgorithm
Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function that searches pattern in txt and prints true if there exists. You may assume that n > m.

## RearrangeZeroOne
You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once

```
Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 
```
