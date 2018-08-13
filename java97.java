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
		        int num;
        Scanner s = new Scanner(System.in);
        num= s.nextInt();
        int sum=0;
	while(num>0){
		int r=num%10;
		sum=sum*10+r;
		num=num/10;
	}
           System.out.print(sum);

	}
}
