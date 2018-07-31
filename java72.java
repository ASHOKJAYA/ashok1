/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner s = new Scanner(System.in);
		String str1= s.nextLine();
		int count=0;
		String str=str1.toLowerCase();
		for(int i=0;i<str.length() ;i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				count++;
			}
		}
		if(count>=1)
		{
			System.out.print("yes");
		}else
		{
			System.out.print("no");
		}
        
	// your code goes here
	}
}
