

public class ConsecutiveSum {
	   
	   
	   
	    static int sumConsecutive(int number)
	    {
	      
	        int total = 0;
	        for (int ways = 1; ways * (ways + 1) < 2 * number; ways++)
	        {
	            float num = (float) ((1.0 * number-(ways * (ways + 1)) / 2) / (ways + 1));
	            if (num-(int)num == 0.0) 
	            	total++;        
	        }
	        return total;
	    }
	     
	    // Driver code to test above function
	    public static void main(String[] args) {
	        int number = 15;
	        System.out.println(sumConsecutive(number));
	        number = 10;
	        System.out.println(sumConsecutive(2));
	    }


}
