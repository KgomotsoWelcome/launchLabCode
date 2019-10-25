/******************************************************************************
Reverse a string. You can not use the python string slicing method which is
string = string[::-1]
*******************************************************************************/
import java.util.*;
import java.io.*;

public class Reversed
{
    public static String Reverse(String string)
    {
        String reversed = "";
        for(int i = string.length()-1; i >=0 ; i--)
        {
            reversed = reversed + string.charAt(i);
        }
        return reversed;
    }
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
		System.out.println(Reverse(scan.nextLine()));
		
	}
}
