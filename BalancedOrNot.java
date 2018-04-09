

import java.util.Stack;

public class BalancedOrNot {
	
	public static void main(String[] args) {
		String[] expressions = {"<>","<>><"}; 
		int[] maxReplacemants= {1,0};
		
		 int[] output=stringBalancedOrNot(expressions,maxReplacemants);
		for(int i=0;i<output.length;i++){
			System.out.println("print:"+output[i]);
		}
			

	}
	
	
	static int[] stringBalancedOrNot(String expressions[],int maxReplacemants[]){
		int ret[] = new int[maxReplacemants.length];
		int result[] =new int[maxReplacemants.length];
		boolean isBalanced=false;
		int count=0;
		int res=0;
		for(int i=0;i<expressions.length;i++){
			String exp=expressions[i];
			isBalanced=isBalancedExpression(exp);
			if(isBalanced==true)
				count=0;
			else{
				for(int j=0;j<exp.length();j++){
					if(exp.charAt(j)=='>' && exp.charAt(j-1)=='<'){
					     count=0;
					   
						}
						else if (exp.charAt(j)=='>') {
							count++;						
							
						}
				}
				
			}
			
			result[res]=count;
			res++;
		}
		
		for(int i=0;i<result.length;i++){
			if(result[i]>maxReplacemants[i])
				ret[i]=0;
			else
				ret[i]=1;
		}
		return ret;
	}
	
	static boolean isBalancedExpression(String number){
		
		Stack<Character> stack = new Stack<Character>();

        for(char exp : number.toCharArray())
        {
            switch(exp) {

               case '<':
                    stack.push(exp);
                    break;

                case '>':
                    if(stack.isEmpty() || stack.pop() != '<') 
                        return false;
                    break;
                
        }
        
    }
        return stack.isEmpty();
	}

}
