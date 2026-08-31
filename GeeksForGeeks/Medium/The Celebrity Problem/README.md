# The Celebrity Problem

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/the-celebrity-problem/1)

## Solved On
31 Aug 2026 at 01:48 pm

<h2><a href="https://www.geeksforgeeks.org/problems/the-celebrity-problem/1">The Celebrity Problem</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">A celebrity is a person who is known to all but&nbsp;<strong>does not know</strong>&nbsp;anyone at a party. A party is being organized by some people. A square matrix&nbsp;<strong>mat[][]&nbsp;</strong>of size n*n is used to represent people at the party such that if an element of row<strong> i </strong>and column<strong> j </strong>is<strong> set to 1</strong> it means <strong>ith person knows jth person</strong>.&nbsp;You need to return the <strong>index </strong>of the<strong> celebrity</strong> in the party, if the celebrity does not exist, return&nbsp;<strong>-1</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong>&nbsp;Follow <strong>0-based </strong>indexing.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [[1, 1, 0],<br>                [0, 1, 0],<br>                [0, 1, 1]]
<strong>Output:</strong> 1
<strong>Explanation: </strong>0th and 2nd person both know 1st person and 1st person does not know anyone. Therefore, 1 is the celebrity person.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [[1, 1], <br>                [1, 1]]
<strong>Output:</strong> -1
<strong>Explanation: </strong>Since both the people at the party know each other. Hence none of them is a celebrity person.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [[1]]
<strong>Output:</strong> 0</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ mat.size() ≤ 1000<br>0 ≤ mat[i][j] ≤ 1<br>mat[i][i] = 1</span></p>