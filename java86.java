/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();int f=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(ch==str.charAt(j))
				{
					f=1;break;
				}
			}
		}
		if(f==1)
		System.out.println("No");
		else
		System.out.println("Yes");
	
	}
}
