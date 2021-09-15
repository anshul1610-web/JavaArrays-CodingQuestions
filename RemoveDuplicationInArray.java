
public class RemoveDuplicationInArray 
{

	public static void main(String[] args) 
	{
		int [] array = {1,1,2,2,3,3,4,4,5,5,6,7,8,};
		int [] temp = new int[array.length];
		
		int j=0;
		for(int i=0;i<array.length-1;i++) 
		{	
				if(array[i]!=array[i+1])
				{
					temp[j] = array[i];
					j++;
				}
		}
		   temp[j] = array[array.length-1];
          
		for(int g=0;g<temp.length;g++) 
		{
		System.out.print(temp[g]+" ");
			
		}
	}

}
