package numberOfPaths;


public class NumberOfPaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print(String.valueOf(numberOfPaths(7)));

	}
	public static long  numberOfPaths(int n)
	{
		long result = 0;
		if(n < 1)
			{
			System.out.print("If there are no squares there can't be any routes"+", ");
				return 0;
			}
		else if (n==1)return 2;
//		if((recursion(n)*recursion(n)) > 0)
//		{
			result = recursion(2*n)/(recursion(n)*recursion(n));
//		}
		return result;
	}
	
	public static long  recursion(long x)
	{
		if(x == 1) return 1;
		return x * recursion(x-1);
	}

}
