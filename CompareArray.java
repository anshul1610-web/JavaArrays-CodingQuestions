import java.util.Scanner;

class CompareArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[] {-4, 3, -9, 0, 4, 1}; 
		
		int zero =0;
		int positive =0;
		int negative =0;
		
		for(int i=0;i<ar.length;i++)
		{
		   if (ar[i]==0) 
		   {
			  zero++; 
		   }
		   else if(ar[i]>0) 
		   {
			   positive++;
		   }
		   else if(ar[i]<0)
		   {
			   negative++;
		   }
		}
		System.out.println(zero);
	}
}