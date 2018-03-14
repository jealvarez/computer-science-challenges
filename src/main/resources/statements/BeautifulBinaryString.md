# Beautiful Binary String

Alice has a binary string, _B_, of length _n_. She thinks a binary string is beautiful if and only if it doesn't contain the substring "010".

In one step, Alice can change a 0 to a 1 (or vice-versa). Count and print the minimum number of steps needed to make Alice see the string as beautiful.

## Input Format

The first line contains an integer, _n_ (the length of binary string _B_).
The second line contains a single binary string, _B_, of length _n_.

## Constraints

* 1 <= n <= 100
* Each character in _B_ belongs {0,1}.

## Output Format

Print the minimum number of steps needed to make the string beautiful.

## Sample Input 0

```
7
0101010
```

## Sample Output 0

```
2
```

## Sample Input 1

```
5
01100
```

## Sample Output 1

```
0
```

## Sample Input 2

```
10
0100101010
```

## Sample Output 3

```
3
```

## Explanation

### Sample Case 0:

In this sample, _B_ = "0101010"

Below shows a way to get rid of each instance of "010":

| 0 | 1 | 0 | 1 | 0 | 1 | 0 | --> Input String (B)

| 0 | 1 | 1 | 1 | 0 | 1 | 0 | --> After changing index 2

| 0 | 1 | 1 | 1 | 0 | 0 | 0 | --> After changing index 5 


Because we were able to make the string beautiful by changing 2 characters (_B2_ and _B5_), we print 2.

### Sample Case 1:

In this sample _B_ = "01100"

The substring "010" does not occur in _B_, so the string is already beautiful and we print 0.
