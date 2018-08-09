/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		        Scanner in = new Scanner(System.in);

		int seconds = in.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print(  p3 + " " + p1);
		System.out.print("\n");

	}
}
