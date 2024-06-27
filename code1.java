package githubcode;
import java.util.Scanner ;
    
public class code1 {
	
	   // sorting methods
	public static void sortfun( int [] number ) {
		
		
		// use to get length array
		int num = number.length;
		
		// bubble sort code  inner loop,outer loop   and  swapping 
		
		for(int i=0 ; i < num-1 ; i++ ) {
		   
		   for( int j=0; j < (num-1-i);j++) {
			   
			   
			    // using  if condition and  check  elements . 
			   
			   if(number[j] > number [j + 1]) 
			   {
				   
				   
				   
				     int swapnum = number [j];
				     
				     number [j] = number[j+1];
				     
				     number [j+1]= swapnum;
				     				   
			   }
			   
		
	     }
			   
	  }
		
		
		     //  after sorting and display  the array 
			
		   
			for(int k =0 ; k < number.length; k++) 
			  
			    {
					  
				    System.out.println  (number[k]);
		 
	           	}
	
			}	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner myObj = new Scanner(System.in);
		
	 
		int [] number = new int [5];
		
		
		// using for loop  and get user input   
		   
	       for(int i=0;i<number.length;i++)
	       {
	    	  
	    	   System.out.println("Enter your number :  " + (i+1));
	            number [i] =myObj .nextInt();
	    	  
	       }
	       
	      
	       // 
	       
	         int [] arr = new int [5];
	         
	         
	              arr = number;
	     
  	       
	      System.out.println ("  This is your Element adding  order   ");
	      
	      
	          for(int f=0 ; f < arr.length;f++) {
	        	  
	        	  System.out.println("Element : " + arr[f]);
	        	  
	        	  
	          }
	          
	          
	             
	          
	          
	      System.out.println("  This is  Element  value decending order   ");
	
	      sortfun( number );
	
	
	} 
	
	
	
	
	
	
	
	
	
	

}
