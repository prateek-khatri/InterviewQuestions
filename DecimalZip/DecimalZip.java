import java.io.*;
import java.util.*;


class DecimalZip
{
	public static void main(String[] args)
	{
		int A = 12345;
		int B = 678;
		
		System.out.println("The Decimal Zip is: "+solution(A,B));
	}
	
	public static int solution(int A,int B)
	{
		String aStr = Integer.toString(A);
		String bStr = Integer.toString(B);
		int aLen = aStr.length();
		int bLen = bStr.length();
		
		char[] arr;
		char[] arr2;
		
		arr = aStr.toCharArray();
		arr2 = bStr.toCharArray();
		
	
		StringBuilder sb = new StringBuilder();
		int i;
		for(i=0;i < (aLen<=bLen?aLen:bLen) ; i++)
		{
			sb.append(arr[i]);
			sb.append(arr2[i]);
		}
		
		if(aLen == bLen)
		{
			int result = Integer.parseInt(sb.toString());
			if(result > 100000000)
			{
				return -1;
			}
			else return result;
		}
		else if(aLen > bLen)
		{
			for(int j= aLen - (aLen - i);j< aLen;j++)
			{
				sb.append(arr[j]);
			}
		}
		else if(bLen > aLen)
		{
			for(int j=bLen - (bLen - i) ;j< bLen;j++)
			{
				sb.append(arr2[j]);
			}
		}
		
		int result = Integer.parseInt(sb.toString());
		//System.out.println(result);
		if(result > 100000000)
		{
			return -1;
		}
		else return result;
	}
}
		
		
		
