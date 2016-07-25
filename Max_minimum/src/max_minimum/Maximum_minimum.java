// Using java solve the problem below:
// Given an array of integers, find the maximum and minimum of this array.
// create a variable to hold the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest
package max_minimum;
import java.util.Scanner;
public class Maximum_minimum {

	
	@SuppressWarnings({ "resource"})
	public static void main(String[] args) {
		int[] Array = new int[10];
		int min;
		int max;
		int num;
		Scanner input = new Scanner(System.in);
		Scanner numb = new Scanner(System.in);
		System.out.print("Enter the number of digits in the array: ");
		num = numb.nextInt();
		System.out.println("Enter the number: ");
		for(int i=0; i<num; i++){
			
			Array[i] = input.nextInt();
		}
		min = Array[0];
		max = Array[num -1];
		
		for(int i = 0; i < num; i++){
			if(min > Array[i]){
				min = Array[i];
			}
		}
		for(int j=0; j<=num; j++){
			if(max < Array[j]){
				max = Array[j];
			}
		}
		System.out.println("The lowest: " + min);
		System.out.println("The highest: " + max);
	}

}
