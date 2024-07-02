package githubcode;

import java.util.Scanner;

public class code2 {
	
	           // descending order  selection sort  
	
	   public static void SelectionSort ( int  [] numbers ) {
		  
		   
		           int num = numbers.length;
		    
		              for( int i=0 ; i < num-1 ; i++) 
		              {
		    	
		    	            int minnum = i;
		    	  
		    	          for( int j = i + 1; j < num ; j++ ) {
		    		
		    		        if (numbers [j] > numbers [minnum]) {
		    			
		    			            minnum = j ;
		    		        }
		    	        }
		            	
					   	 int temp = numbers[minnum];
			    		 numbers [minnum] = numbers[i];
			    		 numbers[i] =temp ;
    		 
	              }
		       
		          
		    
		    for(int k=0 ; k <numbers.length; k++ ) {
	    		
	    		 
	    		
		    	  System.out.print(numbers[k] + " , ");
		    }
		    
		   
	   }
		   
	   
    
	
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
     
		Scanner input = new Scanner (System.in);
		
	    int [] numbers =  new int  [10];
	    
	    
	    System.out.println("    User input section    ");
	    
	    
	    for( int i=0 ; i< numbers.length ; i++) {
	    	
	    	System.out.println("Enetr your number "+ (i+1) + " :");
	    	numbers [i] = input.nextInt();	
	    	
	    	
	    }
		
		// show user inputs given order 
	    
	    System.out.println();
	    System.out.println("    User input order       ");
	    
	    for ( int k =0; k < numbers.length ; k++ ) {
	    	
	    	System.out.print(numbers[k] + " , ");
	    	
	    }
	    
	    System.out.println();
	    System.out.println("decending order selection sort ");
	    
	    
	    SelectionSort ( numbers );
		
	}

}
