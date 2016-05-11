package combinearrays;
//Write a function that combines two lists by alternatingly taking elements. 
//For example: given the two lists [a, b, c] and [1, 2, 3], 
//the function should return [a, 1, b, 2, c, 3].

public class CombineArrayItems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ArrayChar = {'a', 'b', 'c'};
		int[] intArray = {1, 2, 3};
		
		System.out.print("[");

		for(int i = 0;i< intArray.length; i++)
		{
			System.out.print(ArrayChar[i]);
			System.out.print(","+intArray[i]);
			if(i == intArray.length-1)
			{
				System.out.print("]");
			}
			else
			{
				System.out.print(",");
			}
		}

	}

}
