/******************************************************************************
Print the times table for a given number. For example if given 8, 
the program should print the 8 times table.
*******************************************************************************/
import java.util.*;
import java.io.*;

public class Multiple
{
    public static void Multiple(int number)
    {
        for(int i = 1; i <= 12 ; i++)
        {
            System.out.println( number + " * " + i + " = " +number*i);
        }
    }
    
	public static void main(String[] args) {
	    System.out.println("Enter the time: ");
	    Scanner scan = new Scanner(System.in);
	    
		Multiple(scan.nextInt());
		
	}
}
