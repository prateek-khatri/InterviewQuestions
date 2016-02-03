import java.io.*;
import java.util.*;

/*
A zero-indexed array A consisting of N different integers is given. The array contains all integers in the range [0..N-1].
Set S[K] for 0<=K<N are defined as follows:

    S[K] = { A[K],A[A[K]],A[A[A[K]]],...}
Sets S[K] are finite for each K.

Write a function:
    int solution(int A[], int N);
that, given an array A consisting of N integers, returns the size of the largest set S[K] for this array. The function should
return 0 if the array is empty.

For example A = {5,4,0,3,1,6,2}

The function should return 4, because set S[2] equals {0,5,6,2} and has four elements. No other set S[K] has more than four elements.

Assume:
i. N is an integer within the range [0...1,000,000]
ii. the leemnts of A are all distinct.
iii. each element of array A is an integer within range [0..N-1]

Complexity:
i. Worst Case Time Complexity O(N)
ii. Worst Case Space Complexity O(N), beyond input storage.

Elements of input arrays can be modified.
 */

class Solution {
    public static void main(String[] args) 
    {
      
        int[] A = {5,4,0,3,1,6,2};
        int size = A.length;
        int largestSet = solutionSet(A,size);
        System.out.println("The Largest Set: "+largestSet);
    
    }
    public static int solutionSet(int[] A,int n)
    {
        int max = -1;
        boolean[] checked = new boolean[n];
        for(int i=0;i<n;i++)
        {
            int index = i;
            int counter = 0;
            if(checked[i]==true)
            {
                continue;
            }
            while(checked[index]!= true)
            {
                checked[index] = true;
                index = A[index];
                counter++;
            }
            if(max<counter)
            {
                max = counter;
            }
        }
        return max;
    }
    
}
