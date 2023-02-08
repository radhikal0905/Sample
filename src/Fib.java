import java.util.Scanner;

public class Fib {
	
	/*Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n= s.nextInt();
	int a=0, b=1 , c, sum=0;
	System.out.println("The fibnoaci numbers are ");
	for(int i=0;i<=n;i++){
		c=a+b;
		a=b;
		b=c;
		System.out.print(" " + c);
		if (c%2==0) {
			sum=sum + c;	
		}
		
	}
System.out.println("Sum of Even fibnoaci numbers are : " + sum);	*/
	
	
	// Computes value of first fibonacci numbers
	// and stores the even-indexed sum
	static int calculateEvenSum(int n)
	{
		int a=0, b=1 , c, sum=0;
		System.out.println("The fibnoaci numbers are ");
		for(int i=0;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(" " + c);
			if (c%2==0) {
				sum=sum + c;	
			}
			
		}
	//System.out.println("Sum of Even fibnoaci numbers are : " + sum);
		  System.out.println("");
	    // Return the alternating sum
	    return sum;
	}
	 
	// Driver program
	    public static void main (String[] args) {
	            // Get n
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("enter the number");
	    	int n= s.nextInt();
	 
	    // Find the even-indiced sum
	  
	    System.out.println("Sum of Even fibnoaci numbers are : "
	        + calculateEvenSum(n));
	 
	    }
	}
	
