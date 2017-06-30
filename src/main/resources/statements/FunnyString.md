# Funny String

Suppose you have a String, _S_, of length _N_ that is indexed from to 0 to N - 1. You also have some String, _R_, that is the reverse of String _S_. _S_ is funny if the condition `|S[i] - S[i - 1]| = |R[i] - R[i - 1]|` is true for every character from 1 to N - 1.

Note: For some String _S_, `S[i]` denotes the ASCII value of the ith 0-indexed character in _S_. The absolute value of an integer, _x_, is written as _|x|_.

## Input Format

The first line contains an integer, _T_ (the number of test cases).
Each line _i_ of the _T_ subsequent lines contain a string, _S_.

## Constraints

* 1 <= T <= 10
* 0 <= i <= T - 1
* 2 < length of S < 10000

## Output Format

For each String _Sj_ (where `0 <= j <= T -1`), print whether it is `Funny` or `Not Funny` on a new line.

## Sample Input

```
2
acxz
bcxz
```

## Sample Output

```
Funny
Not Funny
```

## Explanation

### Test Case 0: S = "acxz"

```
|c - a| = 2 = |x - z|
|x - c| = 21 = |c - x|
|z - x| = 2 = |a - c|
```

As each comparison is equal, we print `Funny`.

### Test Case 1: S = "bcxz"
```
|c - b| = 1, but |x - z| = 2
```

At this point, we stop evaluating _S_ (as `|c - b| != |x - z|`) and print `Not Funny`. 
