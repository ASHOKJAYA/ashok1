/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	 {
	 	Scanner sc=new Scanner(System.in);
		String test =sc.nextLine();
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		
		int num = 0;
		
		for(int i = 0; i < x.length(); i++)
		{
			 if(Character.isDigit(ch[i]))
			 {
				num ++ ;
		 	}
			}
			System.out.println(num);
	}

}
