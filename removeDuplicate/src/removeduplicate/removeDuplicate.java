// Using Java, remove duplicate characters in a given string keeping only the first occurrences. 
// For example, if the input is ‘tree traversal’ the output will be "tre avsl". Enjoy:-)
package removeduplicate;

import java.util.Arrays;

public class removeDuplicate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tree traversal";
		char[] chars = str.toCharArray();
		char[] ch = str.toCharArray();
		int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(chars.length < 2){
            System.out.println(chars);
        }
        Arrays.sort(chars);
        while(i < chars.length){
            if(chars[i] == chars[j]){
                i++;
            }
            else{
                chars[++j] = chars[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int c=0; c < ch.length; c++){
            	if(ch[c] == chars[c])
	        	{
	        		System.out.print(ch[c]);
	        	}

	}

}
}