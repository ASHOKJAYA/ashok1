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
		
		 Scanner s = new Scanner(System.in);
		 int arr[]=new int[10];
		 for(int i=0;i<10;i++)
		 {
		 	arr[i]=s.nextInt();
		 }
		 int minValue = arr[0];
		for(int i=1;i<10;i++){
			if(arr[i] < minValue){
				minValue = arr[i];
			}
		}
		System.out.print(minValue);
		 


		
		

	}
}
