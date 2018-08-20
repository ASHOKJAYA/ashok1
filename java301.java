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
		Scanner s=new Scanner(System.in);
				int h1=s.nextInt();
		int m1=s.nextInt();
		int h2=s.nextInt();
		int m2=s.nextInt();
		int d1=h1-h2;
		int d2=m2-m1;
		if(d1<0 && d2<0) //(d1>0 && d2<0) || (d1<0 && d2>0) )
		System.out.println(-d1+" "+-d2);
		else if(d1<0 && d2>0)
		System.out.println(-d1+" "+d2);
		else if(d1>0 && d2<0)
		System.out.println(d1+" "+-d2);
		else
		System.out.println(d1+" "+d2);
	}
}
