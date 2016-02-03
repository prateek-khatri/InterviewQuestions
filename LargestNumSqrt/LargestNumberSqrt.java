import java.io.*;
import java.util.*;
/*
Function F(K) is defined as:
1. F(K) = 0 when K = 0
2. F(K) = F(K-1) + K when K > 0

Write a function int solution(int N);

that, given a non-negative integer N, returns the lagest non-negative integer L such that F(L)<=N. The function should return -1
if no such integer L exists.

Example: N=17, the function should return 5. F(5) = 15 and F(K) > 17 for all integers K greater than 5.

Assume N is an integer in range [0....1,000,000]
Complexity:
Time: O(sqrt(N));
Space: O(1);
*/

class LargestNumberSqrt
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number:");
		Scanner s = new Scanner(System.in);
		String number = s.next();
		int num = Integer.parseInt(number);
		int original = num;
		num = num*2;
		num = (int)Math.sqrt(num);
		if((num*(num+1))/2 > original) num--;
		System.out.println("The Largest number L is: "+num);
	}
}
