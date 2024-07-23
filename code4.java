package githubcode;


import java.util.Iterator;
import java.util.LinkedList;

public class code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		LinkedList<String> CarName =  new LinkedList <String> ();
		
		
		
		 CarName.add("Toyota ");
		 CarName.add("Nissan");
		 CarName.add("BMW"); 
		 
		 
		 System.out.println("show link list element : ");
		 
		 System.out.println(CarName);
		 System.out.println();
		 
		 
		 
		 
		 
		 System.out.println ("add link  linkedlist  element specific possion ");
		
		  // add element  specific position CarName 
		 
		 CarName.add(2,"MAZDA");
		 
		 
		 
		 
		 System.out.println(CarName);
		 
		 Iterator <String> itr = CarName.iterator();
		 
		 //  iterate the linkedList element 
		 
		 System.out.println(" ");
		 
		 while (itr.hasNext()) {
	            String element =itr.next();
	            System.out.println(element);
	            
	           
	        }
	 // add element LinkedList first position 	 
		 System.out.println(); 
	   CarName.addFirst("LandRover");
	   System.out.print("linked list addFirst output : ");
	   System.out.println(CarName);
	   
	// add element linkedList last position 
	   System.out.println();
	   CarName.addLast("Volovo");
	   System.out.print("linked list addlast  output : ");
	   System.out.println(CarName);
	   
	 // get first element in linkedList 
	   
 	     System.out.println(); 
 	     
 	     String Carfirst  = CarName.getFirst();
 	     System.out.print("LinkedList  get First element : " );
 	     System.out.println(Carfirst);
 	 // get last element in  LinkedList  
 	     
 	     String Carlast = CarName.getLast();
 
	     System.out.print("LinkedList  get Last element : " );
	     System.out.println(Carlast);
 	      System.out.println(); 
 	   
 	      
 	  //  add all function linkedList   
 	      
 	       CarName.addAll(CarName);
 	       System.out.println(CarName);
 	       
 	     
 	       
 	    // remove function    
 	       // use this output  [LandRover, Toyota , Nissan, MAZDA, BMW, Volovo, LandRover, Toyota , Nissan, MAZDA, BMW, Volovo]
 	         //  we use LinkedList "CarName"
 	      
 	    // we check linkedList is it empty 
 	      System.out.println(); 
 	 	   
 	      boolean car= CarName.isEmpty(); 
 	      
 	      //  size of linked list 
	      int num = CarName.size();
	      
 	       
 	         System.out.println("is linkedList is empty : "+car);
 	         System.out.println("Size of LinkedList  : " + num);
 	        
          //  remove element 
 	         
 	     
 	         
 	        String peek1  =CarName.peek();
 	        System.out.println( "Remove before pop result :"+peek1);
 	        // remove 0 index element 
            CarName.remove(0);
      
             
            String peek2  =CarName.peek();
            System.out.println("Remove  after pop result "+peek2); 
 	       
            System.out.println(); 
          // remove element using element value  
            System.out.println("before remove 'MAZDA' linkedList elements   ");
            System.out.println(CarName);
            System.out.println(); 
            CarName.remove("MAZDA");
          
            System.out.println("after remove 'MAZDA' linkedList elements   ");  


	          
            
            System.out.println ("  Check Removefirst and Removlast  ");
        
            
            
            System.out.println(); 
            // remove first element 
            String removebefore= CarName.peek();
            System.out.println("Remove before peek element:  "+ removebefore);
            
            CarName.removeFirst();
            String removeafter = CarName.peek();
            System.out.println("Remove after  peek element:  "+ removeafter);
            
	       // remove last element 
            System.out.println(); 
            String removebefore1= CarName.getLast();
            System.out.println("Remove before last element :  "+ removebefore1);
            
            CarName.removeLast();
            String removebefore2= CarName.getLast();
            System.out.println("Remove after  last  element:  "+ removebefore2);
            
            
            System.out.println();
             // removeLastOccurrence and removeFirstOccurrence : 
              // output 
            
            System.out.println( "original linkedlist              :"+CarName);
            
            System.out.println();
           
            CarName.removeLastOccurrence("BMW");
            // output 
            System.out.println( "After using removeLastOccurrence :"+CarName);
            
            CarName.removeFirstOccurrence("BMW");
            
            
            // output 
            System.out.println( "After using  removeFirstOccurrence:"+CarName);
            
            
            // and removeAll
            System.out.println();
     
            System.out.println(CarName);
            CarName.removeAll(CarName);
            System.out.print("Remove all : ");
            System.out.println(CarName);
            
            
            }      
	
	
	        // Remove CarName LinkedList 
	
	      
	}
