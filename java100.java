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
		        int a,sum=1;
        Scanner s = new Scanner(System.in);
        a= s.nextInt();
        while(a != 0)
    {
        /* Get the last digit from n and multiplies to product */
        sum= sum * (a % 10);

        /* Remove the last digit from n */
        a = a / 10;
    }
    System.out.print(sum);

	}
}
