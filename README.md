# overlap-algorithm
Algorithm description

Write a method called that calculate overlapping area of two rectangles. Parameters of the method are coordinates of bottom-left and top-right corners of both rectangles. You should write tests for that method, covering all important cases.

Input data

All parameters of your method should follow these rules (names are used for explanation, use parameters names that you think are understandable and clean):

Both x andy y of all corners are integrers, and can have both positive and negative values.
bottom-left-x - integer, possible values range: -2 147 483 648 <= bottom-left-x <= 2 147 483 647
bottom-left-y - integer, possible values range: -2 147 483 648 <= bottom-left-x <= 2 147 483 647
top-right-x - integer, possible values range: -2 147 483 648 <= bottom-left-x <= 2 147 483 647
top-right-y - integer, possible values range: -2 147 483 648 <= bottom-left-x <= 2 147 483 647
Examples

Example #1
Input data:

-1, -1, 10, 10, -1, 0, 3, 9

Expected output:

36
Example #2
Input data:

-12, -4, -1, -2, 0, 0, 100, 3000

Expected output:

0
