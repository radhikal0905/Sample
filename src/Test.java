//Added multiple  praveen
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		/*Printing Reverse of a number
		 int num, rem, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        num = s.nextInt();
	        while(num>0)
	        {
	            rem = num % 10;
	            sum = sum * 10 + rem;
	            num = num / 10;
	        }
	        System.out.println("Reverse:"+sum);*/
		
		
		/*Printing duplicate values in the array
		
		 	int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the size of the array:");
	        n= s.nextInt();
	        int[] arr = new int[n];
	        System.out.print("Enter the elements %d in the array:"); 
	        for(int i=0; i<n;i++){
	        	arr[i]=s.nextInt();
	        }
	        
	        for (int i=0;i<arr.length;i++) {
	        	for(int j=i+1;j<arr.length;j++) {
	        		if(arr[i]==arr[j]) {
	        			System.out.println("The duplicate elements in the array are :" +arr[j]);
	        		}
	        	}
	        }*/
		
	  /*Sorting of an array        	
		int n,temp=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        n= s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter" + n + " elements in array"); 
        for(int i=0; i<n;i++){
        	arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]>arr[j]) {
        		temp = arr[i];
        		arr[i]= arr[j];
        		arr[j] = temp;
        		
        	}
        	
        }
     }
        System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        } */
	
	/*Finding greatest and Smallest number in an array
	int n, largest, smallest;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of Array"); 
	n = s.nextInt();
	System.out.println("Enter  " +  n + " elements in the Array"); 
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = s.nextInt();
	}
	largest = smallest = arr[0];
	for(int i=1;i<n;i++) {
		if(arr[i]>largest) 
			largest = arr[i];
			else if(arr[i]<smallest)
				smallest = arr[i];
			
	}
	System.out.println("Largest Number in array is: " +largest );
	System.out.println("Smallest Number in array is: " +smallest );*/
	
		/*/*Printing Occurance of each character
		
		Scanner s =new Scanner(System.in);
		System.out.println("enter the String");
		String str = s.next();//"google";
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> charCount = new HashMap<>();  
		for (int i = str.length() - 1; i >= 0; i--)   
		{  
		if(charCount.containsKey(str.charAt(i)))   
		{  
		int count = charCount.get(str.charAt(i));  
		charCount.put(str.charAt(i), ++count);  
		}   
		else   
		{  
		charCount.put(str.charAt(i),1);  
		}  
		}  
		System.out.println(charCount);*/
		
	/*Converting Date formating
		//string containing date in one format
	    String strDate = "12/12/07";
	    
	    try
	    {
	      //create SimpleDateFormat object with source string date format
	      SimpleDateFormat sdfSource = new SimpleDateFormat("dd/MM/yy");
	      
	      //parse the string into Date object
	      Date date = sdfSource.parse(strDate);
	      
	      //create SimpleDateFormat object with desired date format
	      SimpleDateFormat sdfDestination = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
	      
	      //parse the date into another format
	      strDate = sdfDestination.format(date);
	      
	      System.out.println("Date is converted from dd/MM/yy format to MM-dd-yyyy hh:mm:ss");
	      System.out.println("Converted date is : " + strDate);
	      
	    }
	    catch(ParseException pe)
	    { 
	      System.out.println("Parse Exception : " + pe);
	    }*/
	
	/*Printing Reverse of the String*/
		//Scanner s = new Scanner(System.in);
		//System.out.println("enter the String");
		//String input = s.next();//"
		//char[] str = n.toCharArray();

        //List<Character> revString = new ArrayList<>();

        //for (char c : str)

          //  revString.add(c);

        //Collections.reverse(revString);

        //ListIterator li = revString.listIterator();

        //while (li.hasNext())
          //  System.out.print(li.next());	
		/*int strLength = input.length();
	for(strLength=input.length();strLength>0;strLength--) {
		System.out.print(input.charAt(strLength -1)); 
	}*/
		String str1 = "Hello";
		  System.out.println("The given string is: " + str1);
		  for (int i = 0; i < str1.length(); i++) {
		   boolean unique = true;
		   for (int j = 0; j < str1.length(); j++) {
		    if (i != j && str1.charAt(i) == str1.charAt(j)) {
		     unique = false;
		     break;
		    }
		   }
		   if (unique) {
		    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
	
		  }
	}
}
