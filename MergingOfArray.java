import java.util.Arrays;

public class MergingOfArray {
 static  int array;
	public static void main(String[] args) 
	{
		int[] a = new int[] {1,2,3,4,};
		int[] b = new int[] {10,20,30,40,};
		
		int c = a.length;
		int d = b.length;
		int e = a.length+b.length;
		
		int[] f = new int[e];
		
		for(int i=0;i<a.length;i++)
		{
			f[i] =a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			f[a.length+i] =b[i];
		}
		
		for(int i=0;i<f.length;i++)
		{
			System.out.print(f[i]+" ");
		
		}
		
	}

}
