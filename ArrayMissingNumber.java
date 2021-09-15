
public class ArrayMissingNumber
{

	public static void main(String[] args) 
	{
		int[] arr = new int [] {1,2,4,5,6};
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0;i<arr.length;i++) 
		
		{
			sum1 = sum1 + arr[i];
		}
		
		for(int j=1;j<=6;j++) 
			
		{
			sum2= sum2 + j;
		}
		
		System.out.println("The Missing number in array is::");
		System.out.println(sum2-sum1);
		
		
	}
	

}
