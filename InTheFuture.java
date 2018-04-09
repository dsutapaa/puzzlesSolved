

public class InTheFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minimum(6,9,10));
		//
	}
private static int minimum(int a, int b, int c)
{
	int days=0;
		if(b>a)
		{
		while((c+a) > b)
		{
			c= (c+a)-b;
			days++;
		}
		}
		else
			days=-1;
	
	return days;
}
}
