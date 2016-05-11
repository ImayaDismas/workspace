import java.util.Arrays;


public class threeSort {
	public static int[] sortNum(int a, int b, int c){
		int maximum = Math.max(a, b);
		int finalMax =Math.max(maximum, c);
		int minimum = Math.min(a, b);
		int finalMin = Math.min(minimum, c);
		int mid = (a+b+c) - (finalMax+finalMin);
		int[] array = {finalMin, mid, finalMin};
		
		return array;
	}
	public static void main(String[] args){
		int result[] = sortNum(15,14,13);
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(sortNum(15,14,13)));
	}
}
