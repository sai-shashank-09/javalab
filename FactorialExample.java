import java.util.Scanner;
class FactorialExample
{  
	public static void main(String args[])
	{  
  		System.out.println("Enter the number :");
		Scanner reader=new Scanner(System.in);
		int i,fact=1;
		int number=reader.nextInt();
  		for(i=1;i<=number;i++)
		{    
      			fact=fact*i;    
  		}    
  		System.out.println("Factorial of "+number+" is: "+fact);    
 	}  
}