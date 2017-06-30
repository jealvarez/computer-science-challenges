# Sparse Arrays

There is a collection of _N_ strings ( There can be multiple occurences of a particular string ). Each string's length is no more than 20 characters. There are also queries. For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of _N_ strings.

## Input Format

The first line contains _N_, the number of strings.
The next _N_ lines each contain a string.
The _N_ + 2nd line contains _Q_, the number of queries.
The following _Q_ lines each contain a query string.

## Constraints

* 1 <= N <= 1000
* 1 <= Q <= 1000
* 1 <= length of any string <= 20 

## Sample Input

```
4
aba
baba
aba
xzxb
3
aba
xzxb
ab
```

## Sample Output

```
2
1
0
```

## Explanation

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.
