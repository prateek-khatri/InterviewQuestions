import java.io.*;
import java.util.*;

class LocalExtrema
{
	public static void main(String[] args)
	{
		int[] A = {2,2,3,4,3,3,2,2,1,1,2,5};
		
		System.out.println("The Number of Local Extrema are: "+findExtrema(A));
	}
	
	public static int findExtrema(int[] A)
	{
		int i=0; //current pointer
		int j=0; //lookahead pointer
		int count = 0;
		boolean increasing = false;
		boolean decreasing  = false;
		
		while(A[i] == A[j] && j < A.length)
		{
			j++;
		}
		if(j>= A.length) return count+1;
		
		while(i<A.length)
		{
			if(A[i] < A[j])
			{
				if(i==0) 
				{
					count++;
				}
				increasing = true;
				decreasing = false;
			}
			else if(A[i] > A[j])
			{
				if(i==0) 
				{
					count++;
				}
				decreasing = true;
				increasing = false;
			}
			
			i=j;
			
			while(j < A.length && A[i] == A[j] )
			{
				j++;
			}
			if(j>=A.length) return count+1;
			
			
			
			if(A[i] > A[j] && increasing == true)
			{
				count++;
			}
			else if(A[i] < A[j] && decreasing == true)
			{
				count++;
			}
			
		}
		return count;
			
			
		
	}
}
