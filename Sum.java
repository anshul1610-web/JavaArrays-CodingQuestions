import java.util.ArrayList;
import java.util.Collections;

public class Sum 
{

	public static void main(String[] args)
	{
		int count =0;
		
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	al.add(3);
	al.add(2);
	al.add(1);
	al.add(3);
		
	Collections.sort(al);
	
	int max = al.get(al.size()-1);
	
    for(int i=0;i<al.size();i++) 
  {
      if(al.get(i)==(max))
      {
          count++;
      }
  }

	
		System.out.println(count);		
	}

}
