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
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if ( x > y && x > z )
			 System.out.println(x);
		 else if ( y > x && y > z )
			  System.out.println(y);
		 else 
			System.out.println(z);
      
	
	}
}
