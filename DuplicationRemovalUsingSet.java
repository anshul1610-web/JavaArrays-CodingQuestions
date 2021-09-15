import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicationRemovalUsingSet 
{

	public static void main(String[] args) 
	{
		int [] arr = new int []	{2,3,4,5,4,3,5,6,7,6,5,};
		Arrays.sort(arr);
		System.out.println("Array with duplicates");
		for(int array :arr)
		{
			System.out.print(" "+array);
		}
		
		System.out.println("*********************************************************************");
		System.out.println("After removing duplicate");
	
		Set<Integer> s = new HashSet<Integer>();
		
		for(int array1:arr)
		{
			s.add(array1);
		}
		System.out.println(s);
		
		System.out.println("*********************************************************************");
		System.out.println("aray formate");
		
		Object[] array2 = s.toArray();
		for(Object ar:array2) 
		{
			System.out.print(" "+ar);
		}
		
		
		
		
	} 
}
