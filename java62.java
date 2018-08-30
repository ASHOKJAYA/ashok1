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
		String str=s.next();
		int f1=0,f0=0,te=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='1')
			{
				f1=1;
			}
			else if(ch=='0')
			{
				f0=1;
			}
			else if(ch!='1' || ch!='0')
			{
				te=1;
			}
		}
		if(f1==1 && f0==1 && te==0)
		System.out.print("yes");
		else
		System.out.print("no");
		



	}
}
