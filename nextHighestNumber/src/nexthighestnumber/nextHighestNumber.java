package nexthighestnumber;

import java.util.Arrays;

//Given a number, find the next higher number using only the digits 
//in the given number. For example if the given number is 1508, 
//the next higher number with same digits is 1805.
public class nextHighestNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1508;
		char [] chars = String.valueOf(number).toCharArray();
		Arrays.sort(chars);
		System.out.println("The highest number is: ");
		//as a character
		String result = "";
		for(int i = chars.length-1; i >= 0  ; i--)
		{
			System.out.print(chars[i]);
			result+=chars[i];
		}
		System.out.println("\n");
		System.out.println("This is the highest number as integer: "+ Integer.parseInt(result));

	}

}
