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
		int n=sc.nextInt();
		int temp,r,sum=0;
		temp=n;    
		 while(n>0)
		 {    
			 r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		 if(temp==sum)    
			 System.out.println("Yes ");    
		else    
			 System.out.println("No");
	}
}
