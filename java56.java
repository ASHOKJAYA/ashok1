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
		String s  =  sc.nextLine();

String numRegex   = ".*[0-9].*";
String alphaRegex = ".*[a-z].*";

if (s.matches(numRegex) && s.matches(alphaRegex)) {
    System.out.println("Yes");
}else{
	System.out.print("No");
}

	}
}
