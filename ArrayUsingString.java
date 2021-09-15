import java.util.Arrays;

public class ArrayUsingString {
	
	public static void main(String[] args) {
		
		int[] array = new int[]{53,28,31,95,55};
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("Array element before sort");
		for( int i : array)
		{
		
			System.out.println(i);
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		System.out.println("Array element After sort");
		for( int i : array)
		{
		
			System.out.println(i);
		}
		
	}
	
}