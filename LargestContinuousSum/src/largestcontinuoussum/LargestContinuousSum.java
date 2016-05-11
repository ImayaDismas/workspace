package largestcontinuoussum;
//Given an array of integers (positive and negative) find the largest continuous sum.
public class LargestContinuousSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10, 8, 10, 9, -4, -5, -9, 20, 41, 80, -45, -72,};
		int sum = 0;
		int count = 0;
		for(int i = 0; i < num.length; i++)
		{
			if(num[i]>0)
			{
				sum = sum + num[i];
				count++;
			}
			else
			{
				break;
			}
			
		}
		int c =0;
		int sumNegative = 0;
		for(int i = count; i < num.length; i++)
		{
			if(num[i]<0)
			{
				sumNegative = sumNegative + num[i];
				c++;
			}
			else
			{
				break;
			}
		}
		int sumP = 0;
		for(int i = count + c ; i < num.length; i++)
		{
			if(num[i]>0)
			{
				sumP = sumP + num[i];
				count++;
			}
			else
			{
				break;
			}
			
		}
		if(sum > sumP)
		{
			System.out.println("This is the largest continuous " +sum);
		}
		else
		{
			System.out.println("This is the largest continuous " +sumP);
		}
	}

}
