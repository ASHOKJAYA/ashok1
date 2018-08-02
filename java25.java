/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	    public static int findMedian(int a[], int n)
    {
        Arrays.sort(a);
 
        if (n % 2 != 0)
        return a[n / 2];
     
        return (a[(n - 1) / 2] + a[n / 2]) / 2;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		        System.out.println(findMedian(a, n)); 

		// your code goes here
	}
}
