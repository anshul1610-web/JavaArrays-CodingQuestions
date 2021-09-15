
public class SecondLargestinArray 
{

	public static void main(String[] args) 
	{
		int temp=0;
		int [] arr = new int[] {4,6,3,1,2,8,7};
		
		/*for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
		for(int array:arr)
		{
			System.out.print(array+" ");
		}*/
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i] > largest1)
				{
					largest2 = largest1;
					largest1 = arr[i];
				}
			else if(arr[i]>largest2 && arr[i]!= largest1) 
			{
				largest2 =arr[i];
			}			
		}
		System.out.println(largest2);
		
	}

}
