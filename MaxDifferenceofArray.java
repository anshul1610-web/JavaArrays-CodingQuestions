
public class MaxDifferenceofArray 
{

	public static void main(String[] args)
	{
		int max =0;
		int arr[] = {10,11,7,12,14};
		for(int i=0;i<arr.length-1;i++)
		{
			if(max<arr[i]-arr[i+1]) 
			{
				max = arr[i]-arr[i+1];
			}
		}
		System.out.println(max);
	}

}
