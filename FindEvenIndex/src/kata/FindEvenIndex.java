package kata;

public class FindEvenIndex {

	public static int findEvenIndex(int[] arr) {
	    // your code
	    int left = 0;
	    int result = -1;
	    for(int i = 0; i < arr.length; i++)
	    {
	      left += arr[i];
	      int right = 0;
	      for(int j = i+2; j < arr.length; j++)
	      {
	        right += arr[j];
	      }
	      if(left == right)
	      {
	        result = i+1;
	      }
	    }
	    return result;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));
		System.out.println(findEvenIndex(new int[] {1,100,50,-51,1,1}));
		System.out.println(findEvenIndex(new int[] {1,2,3,4,5,6}));
		System.out.println(findEvenIndex(new int[] {20,10,30,10,10,15,35}));
		System.out.println(findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
		System.out.println(findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
		System.out.println(findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
	}

}
