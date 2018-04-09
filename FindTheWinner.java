

public class FindTheWinner {

	public static void main(String[] args) {
		int[] andrea= {2,3,4,6,9,7};
		int[] maria= {5,9,7,1,1,2};
		String s="Odd";
		String result=winner(andrea,maria,s);
		System.out.println(result);  

	}
	
	static String winner(int []andera,int []maria,String s){
		int sum1=0;
		int sum2=0;
		String result="";
		if(s.equalsIgnoreCase("Even")){
			for(int i=0;i<andera.length;i+=2){
				sum1=sum1+(andera[i]-maria[i]);
				sum2=sum2+(maria[i]-andera[i]);
			}
			if(sum1>sum2)
				result= "Andrea";
			else if(sum1==sum2)
				result= "Tie";
			else
				result= "Maria";
		}
		else if(s.equalsIgnoreCase("Odd")){
			for(int i=1;i<andera.length;i+=2){
				sum1=sum1+(andera[i]-maria[i]);
				sum2=sum2+(maria[i]-andera[i]);
			}
			if(sum1>sum2)
				result= "Andrea";
			else if(sum1==sum2)
				result= "Tie";
			else
				result= "Maria";
		}
		return result;
	}

}
