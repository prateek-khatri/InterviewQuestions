import java.io.*;
import java.util.*;

class SwapSort
{
	public static void main(String[] args)
	{
		int[] A = {1,2,3,4,5,6};
		
		if(checkSwap(A))
		{
			System.out.println("It is Possible!!!");
		}
		else
		{
			System.out.println("It is not Possible!!!");
		}
	}
	
	public static boolean checkSwap(int[] A)
	{
		if(checkSort(A)) return true;
		
		
		int anomaly = -1;
		int i;
		for(i=1;i < A.length; i++)
		{
			if(A[i-1] > A[i])
			{
				anomaly = i-1;
				break;
			}
		}
		if(anomaly == -1) return checkSort(A);
		//FIX THIS VARIABLE ANOMALY
		for(; i< A.length;i++)
		{
			
			if(A[i] > A[anomaly])
			{
				int temp = A[anomaly];
				A[anomaly] = A[i-1];
				A[i-1] = temp;
				return checkSort(A);
			}
		}
		
		if(anomaly == 0 || i==A.length)
		{
				int temp = A[anomaly];
				A[anomaly] = A[i-1];
				A[i-1] = temp;
				return checkSort(A);
		}
		
		return false;
		
	}
	
	public static boolean checkSort(int[] A)
	{
			int i=0;
			for(i=1; i<A.length;i++)
			{
				if(A[i-1] > A[i])
				{
					return false;
				}
			}
			return true;
	}
	
}
