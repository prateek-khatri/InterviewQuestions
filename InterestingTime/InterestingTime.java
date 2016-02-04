import java.io.*;
import java.util.*;

class InterstingTime
{
	
	public static void main(String[] args)
	{
		
		System.out.println("The Number of Interesting Times are: "+ timeCheck("15:45:58","16:00:12",0));
	}
	
	public static int timeCheck(String S, String T, int count)
	{
		
		if(S.equals(T))
		{
			if(checkInteresting(S))
			{
				count++;
				return count;
			}
			else
			{
				return count;
			}
		}
		
		if(checkInteresting(S))
		{
			count++;
		}
		
		
		return timeCheck(updateS(S), T, count);
		
	}
	public static String updateS(String S)
	{
		String[] seperate = S.split(":");
		int[] arr = new int[3];
		for(int i=0;i<3;i++)
		{
			arr[i] = Integer.parseInt(seperate[i]);
		}
		StringBuilder ss = new StringBuilder();
		//NEST THESE CONDITIONS CAUSE THE UPDATE NEEDS TO BE TOGETER!!!!!!!
		arr[2] +=1;
		if(arr[2] == 60)
		{
			arr[2] = 0;
			if(arr[2] == 0)
			{
			arr[1] +=1;
			}
		}
		if(arr[1] == 60)
		{
			arr[1] = 0;
			if(arr[1] == 0)
			{
			arr[0] +=1;
			}
		}
		
		if(arr[0] < 10)
		{
			ss.append("0");
		}
		ss.append(Integer.toString(arr[0]));
		ss.append(":");
		if(arr[1] < 10)
		{
			ss.append("0");
		}
		ss.append(Integer.toString(arr[1]));
		ss.append(":");
		if(arr[2] < 10)
		{
			ss.append("0");
		}
		ss.append(Integer.toString(arr[2]));
		System.out.println(ss);
		return ss.toString();
	}
	
	
	public static boolean checkInteresting(String S)
	{
		char[] arr = S.toCharArray();
		HashSet h = new HashSet();
		for(int i=0;i<S.length();i++)
		{
			if(arr[i] != ':')
			{
				h.add(arr[i]);
			}
		}
		
		if(h.size() <= 2)
		{
			return true;
		}
		
		return false;
		
	}
		
}
