
public class ArrayScores 
{
	public static void main(String[] args)
	{
		int Sum=0;
		int Average =0;
		
		int[] array  = new int[] {34,56,76,45,27};
		
		//Code for Calculating the Average of Array
		for(int i=0;i<array.length;i++) 
		{
			Sum = Sum+array[i];
		}
		
		Average = Sum/5;
	
           System.out.println("Average Of Given Array is: "+Average);
           
           
           
           
	}

}
