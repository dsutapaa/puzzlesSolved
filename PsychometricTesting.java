

import java.util.ArrayList;
import java.util.List;

public class PsychometricTesting {

	public static void main(String[] args) {
		int[] scores = {4,8,7}; 
		int[] lowerlimits= {2,4};
		int[] upperlimits= {8,4};
		int[] l =limit(scores,lowerlimits,upperlimits);
		for(int s=0;s<l.length; s++)
		{
			System.out.println(l[s]);
		}

	}
	
	public static int[] limit(int[] scores, int[] lowerlimits, int[] upperlimits)
	{
		int[] limits;
		int size=0;
		
		int limitsize= lowerlimits.length;
		List numbers1= new ArrayList();
		List numbers2= new ArrayList();
		int zerolowerlimit=lowerlimits[0];
		
		int zerouplimit=upperlimits[0];
		
		if(limitsize>1)
		{
			size=2;
			int highlimit=lowerlimits[limitsize-1];
			
			int highuplimit=upperlimits[limitsize-1];
			
			
		for(int count=0; count<scores.length; count++)
		{
			
			if(scores[count] >=zerolowerlimit && scores[count]<=zerouplimit)
			{
				numbers1.add(scores[count]);
				
				
			}
			
			if(scores[count] >=highlimit && scores[count]<=highuplimit)
			{
					numbers2.add(scores[count]);
					
					
			}
			
			
		}
		
		}else
		{
			size=1;
		
			for(int count=0; count<scores.length; count++)
			{
				if(scores[count] >=zerolowerlimit || scores[count]<=zerouplimit)
					numbers1.add(scores[count]);
			}
		}
		
		
		
		limits= new int[size];
		limits[0]=numbers1.size();
		if(size>1)
		{
			
			limits[1]=numbers2.size();
		}
			
		return limits;
	}

}
