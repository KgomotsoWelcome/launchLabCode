/******************************************************************************
Write a program that prints the numbers from 1 to 100. But for multiples of
three print 'Fizz' instead of the number and for the multiples of five 
print 'Buzz'. For numbers which are multiples of both three and five print
'FizzBuzz'. Start your timer before you attempt this challenge
*******************************************************************************/

public class Main
{
    public static boolean Mutliple(int value, int multiple)
    {
        boolean condition = false;
        if(value%multiple == 0)
        {
            condition = true;
        }
        else
        {
            condition = false;
        }
        
        return condition;
    }
    
	public static void main(String[] args) {
		for(int i=1; i<=100;i++)
		{
		    if ((Mutliple(i,3) == true) && (Mutliple(i,5) == true))
		    {
		        System.out.println("FizzBuzz");
		    }
		    else if (Mutliple(i,3) == true)
		    {
		        System.out.println("Fizz");
		    }
		    else if (Mutliple(i,5) == true)
		    {
		        System.out.println("Buzz");
		    }
		    else
		    {
		        System.out.println(i);
		    }
		}
		
	}
}
