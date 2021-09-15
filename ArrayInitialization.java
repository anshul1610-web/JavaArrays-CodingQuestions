import java.util.Scanner;

public class ArrayInitialization
{

	public static void main(String[] args)
	{
	    
        int [][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        
       for(int row=0; row<3; row++) 
        {
        
        	 for(int col=0; col<4; col++) 
             {
             
             	arr [row][col]  = sc.nextInt();           	
             	
             }
        	
         }
        
       System.out.println("You Entered");
        
      for(int i=0; i<2; i++) 
      {
    	  for(int j=0; j<2; j++) 
          {
        	  
    		  System.out.print(arr [i][j]+ " ");
        	  
          }
    	  System.out.println();
    	  
      }
            
      
  	}

}
