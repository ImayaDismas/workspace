package difference;
//Write a function that accepts an array of random integers and an integer n. 
//Determine the number of times where two integers in the array have the difference of n.
//  
//  e.g: f(4, [1, 1, 5, 6, 9, 16, 27]) // 3 (Due to 2x [1, 5], and [5, 9])
//f(2, [1, 1, 3, 3]) // 4 (Due to 4x [1, 3])
import java.util.Scanner;   

public class Difference {

	/**
	 * @param args
	 */
	public int No_of_times(int num, int[] Arraynum)
	{
		int count=0;
		for(int i = Arraynum.length-1; i >= 0 ; i--)
		{
			for(int j = Arraynum.length-2; j >= 0 ; j--)
			{
				int res = (Arraynum[i] - Arraynum[j]);
				if( res == num)
				{
					count++;
				}
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ArrayA = {1, 1, 5, 6, 9, 16, 27};
		int[] ArrayB = {1, 1, 3, 3};
		int num = 0;
		int difference = 0;
		int[] UniversalArray = new int[100];
		Scanner input = new Scanner(System.in);
		Difference obj = new Difference();
		
		System.out.println("Number of times: " + obj.No_of_times(4,ArrayA));
		System.out.println("Number of times: " + obj.No_of_times(2,ArrayB));
		
		//Your Own Input
		System.out.print("Enter the size of the array: ");
		num = input.nextInt();
		System.out.println("Enter the items of the array");
		for(int i = 0; i < num; i++)
		{
			UniversalArray[i] = input.nextInt();
		}
		System.out.print("Enter the diffence n: ");
		difference = input.nextInt();
		System.out.println("Number of times: " + obj.No_of_times(difference,UniversalArray));
	}

}
