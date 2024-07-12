package githubcode;
import java.util.Scanner ;

public class code3 {

	public static void bublesortoptimize (int [] inarray) {
	
		
         boolean swap ;
          
         // array length  assign  variable 
         int  len = inarray.length;
           
         for(int i =0; i< len-1 ; i++ ) {
        	 
        	 swap = false ;
        	 
        	 
        	 for(int j = 0; j < len -1 - i;j++  ) {
        		 
        		 if( inarray[j]  > inarray[j+1] ) {
        			  
        			   int temp = inarray [j];
        			 
        			   inarray[j] = inarray[j + 1];
        			   
        			   inarray[j + 1 ] = temp ;
        			     
        			   
        			   swap = true;
        		 }
        		 
        	 }
        	 
        	 if(!swap ) {
        		 
        		 break;        		 
        	 }
       		 
         }
         
         
          
          System.out.println("sorted array in above ");
          System.out.println();
         
         for ( int k = 0 ; k < len ; k++ ) {
        	 
        	     System.out.print("  " + inarray [k] + "  ");
        	     
        	 
         }
          
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Scanner input =  new Scanner(System.in);
		   
	      int [] inarray  =  new int  [10];
		 
		  
		  for(int i=0 ; i < 10 ; i ++ ) {
			  
			  System.out.println ("Enter your number " +( i+ 1) + ": " ) ;
			  inarray[i] = input.nextInt();
			 
		  }
		  
		  System.out.println ();
		  System.out.println ("Your inpur array is display  belove  ");
		   
		  for ( int out  = 0 ; out  < 10 ; out++) {
			  
			     System.out.print( "  " + inarray [out ] + "  ");
			     
		        }
		  
		   // calling function 
		  System.out.println();
		     bublesortoptimize(inarray);
		  
		  
	     }
		 
	}


