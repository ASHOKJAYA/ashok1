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
		Scanner sc=new Scanner (System.in);
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		int[] arr=new int[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<m;i++)
		{
			if(n==arr[i])
			{
				count++;
			}
		}
		System.out.print(count);
	}
}
