package persistence;

public class Persist {
	
	//static int count;
	public static int persistence(long n) {
		// your code
		long num = n;
		int count = 1;
		long result = 1;
		String str = String.valueOf(n);
		int length = str.length();
		int[] number = new int[length];
		for(int i = 0; i < length; i++)
		{
			number[i] = (int) (num%10);
			num = num/10;
		}
		for(int j = 0; j < number.length; j++)
		{
			if(number.length>1)
			{
				result *=number[j];
				if(result >= 10)
				{
					count++;
				}
				else
				{
					
				}
			}
			else 
			{
				count *=0;
			}
			
		}
		if(result < 9)
		{
			return count;
		}
		else
		{
			persistence(result);
		}
    return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(persistence(39));
		System.out.println(persistence(4));
		System.out.println(persistence(25));
		System.out.println(persistence(999));
	}

}
