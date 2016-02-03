import java.io.*;
import java.util.*;

/* Problem Statement
 A zero-indexed array A consisting of N integers is Given. A pair of Integers (P,Q), such that 0<=P<=Q<N, is called a slice of array A.
 A slice is called bi-valued if it consists of at most two different numbers. Write a function: int solution(int A[], int N);
 
 that, given an array A consisting of N integers, returns the size of the largest bi-valued slice in A.
 
 For example, given array A such that: A[] = {5,4,4,5,0,12} 
 that function should return 4, because (0,3) is a slice containg only 4 and 5.
 
 There are also some other shorter bi-valued slices, such as: (1,3),(4,5) and (1,2) (a bi-valued slice can also contain just one value).
 Slice(3,5) is not bi-valued as it consists of three different numbers.
 Assume that:
     1. N is an integer within the range [0...100];
     2. each element of array A is an integer within the range [-2,147,483,648..2,147,483,647].
     
     In your solution focus on correctness. The performance of your solution will not be focus of the assessment.
 */

class Solution {
  public static void main(String[] args) {
    int[] A= {5,4,5,4,5,0};
    int n = A.length;
    int slice = slice_sol(A, n);
    
    System.out.println("The Slice of the Array is " + slice);
  }
  public static int slice_sol(int[] A, int n)
  {
    
    int val1,val2;
    int[] max = new int[n];
    int i,j,k;
    
    for(i = 0;i<n-1;i++)
    {
      val1 = A[i];

      for(j = i+1;j<n;j++)
      {
        if(A[j]==val1)
        {
          continue;
        }
        else break;
      }
      
      val2 = A[j];
      if(max[i] < (j-i+1))
      {
        max[i] = j-i+1;
      }
      
     for(k = j+1;k<n;k++)
     {
       if(A[k] == val1 || A[k] == val2)
       {
         max[i]++;
       }
       else
       {
         break;
       }
       
     }   
    }
    return findMax(max,max.length);
    }
    public static int findMax(int[] max,int n)
    {
        int num = -1;
        
        for(int i=0;i<n;i++)
        {
            if(num < max[i])
            {
                num = max[i];
            }
        }
        return num;
    }
  }
