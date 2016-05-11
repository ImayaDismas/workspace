package threesort;
//THREESORT
//LANGUAGE: JAVA

//Create a ThreeSort class with a threeSort method and a main method.
//The threeSort method should contain the algorithm and the main method
//should be used for testing your algorithm. To make that easier, make the
//threeSort method static.

//Given three numbers as input, find the min, middle and max of the three.
//Return an array of the numbers in ascending order.
//Hint: to easily see your output, import java.util.Arrays
//and use the Arrays.toString(array) method to convert the Array to a string 
//and then log it using System.out.println();

//Example:
//ThreeSort.threeSort(9,4,6); // [4,6,9]
//ThreeSort.threeSort(3,2,1); // [1,2,3]
public class ThreeSort {
	
	public static void threeSort(int a, int b, int c){
		int[] Array = {a,b,c};
        for (int i = 0; i < Array.length; i++) 
        {
            for (int j = i + 1; j <  Array.length; j++) 
            {
                if (Array[i] > Array[j]) 
                {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.print("[");
		for(int i=0; i<Array.length;i++){
			System.out.print(" "+Array[i] +" ");
		}
        System.out.print("]");
	}
	public static void main(String[] args){
		ThreeSort.threeSort(9,4,6); // [4,6,9]
		System.out.println();
		ThreeSort.threeSort(3,2,1); // [1,2,3]
	}
	
}
