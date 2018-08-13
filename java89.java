/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();
         
        // sort tempArray
        Arrays.sort(tempArray);
         
        // return new sorted string
        return new String(tempArray);
    }
     
    // Driver method
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        String inputString =sc.nextLine();
        String outputString = sortString(inputString);
         
        System.out.println(outputString);

	}
}
