


public class LargestSubsetSum {

 static int[] getMaximumSumWithLCM(int[]	numbers)
 {
     int[] ret = new int[numbers.length];
	 
     for(int ii=0;ii<numbers.length;ii++)
     {
    	 int number=numbers[ii];
	 int sum = 0;
     int sqrt = (int)Math.sqrt(number);


     for (int i = 1; i <= sqrt; i++) {

         if (number % i == 0) {
         
             if (i == (number / i))
                 sum += i;
             else
                 sum += (i + number / i);
         }
     }
     ret[ii] = sum;
     }

     return ret;
 }

 // 
 public static void main(String[] args)
 {
     int[] numbers = {1,15,18};
     
     int[] res = (getMaximumSumWithLCM(numbers));
     for (int i = 0; i < res.length; i++) {
    	 System.out.println(res[i]);
     }
 }
}
