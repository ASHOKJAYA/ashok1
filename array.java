/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\	
		int sum=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{//for reading array
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<k;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
