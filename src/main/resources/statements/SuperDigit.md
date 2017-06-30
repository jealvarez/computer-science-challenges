# Super Digit

We define super digit of an integer _x_ using the following rules:

* If _x_ has only digit, then its super digit is _x_.
* Otherwise, the super digit of _x_ is equal to the super digit of the digit-sum of _x_. Here, digit-sum of a number is defined as the sum of its digits.

For example, super digit of _9875_ will be calculated as:

```
super_digit(9875) = super_digit(9+8+7+5) 
                  = super_digit(29) 
                  = super_digit(2+9)
                  = super_digit(11)
                  = super_digit(1+1)
                  = super_digit(2)
                  = 2.
```

You are given two numbers _n_ and _k_. You have to calculate the super digit of _P_.

_P_ is created when number _n_ is concatenated _k_ times. That is, if _n = 123_ and _k = 3_, then _P = 123123123_.

## Input Format

The first line contains two space separated integers, _n_ and _k_.

## Constraints

* 1 <= n <= 10^100000
* 1 <= k <= 10^5

## Output Format

Output the super digit of _P_, where _P_ is created as described above.

## Sample Input 0

```
148 3
```

## Sample Output 0

```
3
```

## Explanation 0

Here _n = 148_ and _k = 3_, so _P = 148148148_.

```
super_digit(P) = super_digit(148148148) 
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3.
```
