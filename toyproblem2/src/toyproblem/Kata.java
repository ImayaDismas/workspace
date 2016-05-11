package toyproblem;

import java.util.Scanner;
import java.util.Arrays;

public class Kata {
	static Scanner sc = new Scanner(System.in);

	  public static void main(String[] args) {
	    System.out.print("Enter a string: ");
	    String s = sc.nextLine();
	    String originalString = s;
	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);
	      if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i') || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) {
	    	String front = s.substring(0, i);
	        String back = s.substring(i+1);
	        s = front + "*"+ back;
	      }
	    }
	    int[] size =new int[s.length()+1];
	    for(int i=1; i <= s.length(); i++){
			size[i] = i;
		}
	    if(s.length()<11)
	    {
	    for (int i = 0; i < s.length(); i++) {
		      char c = s.charAt(i);
		      if (c == '*'){
		    	String front = s.substring(0, i);
		        String back = s.substring(i+1);
		        s = front + size[i+1]+ back;
		      }
		    }
	    }
	    else if(s.length()>=11){
	    	for (int i = 0; i < s.length(); i++) {
			      char c = s.charAt(i);
			      if (c == '*'){
			    	String front = s.substring(0, i);
			        String back = s.substring(i+1);
			        s = front + size[i-1]+ back;
			      }
			    }
	    }
	    System.out.println(originalString);
	    System.out.println(s);
	  }
	}