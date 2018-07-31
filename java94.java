/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num, r;
		 Scanner sc = new Scanner(System.in);		
		num = sc.nextInt();
		r=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();	
		}
		for(int i=1;i<=num;i++)
		{
			if(i==r)
			{
				System.out.print(arr[i-1]);
			}
		}
	}
}
