# strobogrammaticnum
A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

#aliceappleproblem
There are different kinds of apple trees in the four directions (East, West, North, South), which may grow both red and green apples such that each tree grows exactly K apples, in the following manner:

N – number of trees to the north do not have red apples.
S – number of trees to the south do not have green apples.
W – number of trees in the west have some red apples.
E – number of trees in the east have some green apples.
However, the colors of apples can not be distinguished outside the house. So, the task is to find the minimum number of apples to be collected from the trees to guarantee M red apples. If it is not possible, print -1.

Examples:

Input: M = 10, K = 15, N = 0, S = 1, W = 0, E = 0
Output: 10
Explanation: It simply gets 10 apples from the 1st south tree

Input: M = 10, K = 15, N = 3, S = 0, W = 1, E = 0
Output: -1
Explanation: There are no red apples in the South, North and East. But in the West there are atleast 1 red apple and total tree is 1, So, total no. of guaranteed red apple is 1 * 1 = 1 which is less than M.
