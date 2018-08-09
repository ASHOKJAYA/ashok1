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
		Scanner sc=new Scanner(System.in);
		int result=1;
		int n=sc.nextInt();
		int p=sc.nextInt();
		if(n>=0&&p==0)
    	 {
        		result=1;
    	}
    	else if(n==0&&p>=1)
    	{ 
    	  result=0;
    	 }
    	else
    	{
        	for(int i=1;i<=p;i++)
			{
        		 result=result*n;
 			 }	    
     }
    	System.out.println(result);
	
	}
}
