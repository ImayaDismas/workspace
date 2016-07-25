package scramblies;

import java.util.Arrays;

public class Scramblies {
	public static boolean scramble(String str1, String str2) {
	    
        // your code
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean result = false;
        for(int i=0; i < charArray2.length;i++)
        {
          for(int j=i+1; j < charArray1.length; j++)
          {
            if(charArray2[i] == charArray1[j])
            {
            	result = true;
            }
            
          }
        }
        
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Scramblies.scramble("rkqodlw","world"));
		System.out.println(Scramblies.scramble("cedewaraaossoqqyt","codewars"));
		System.out.println(Scramblies.scramble("katas","steak"));
		//System.out.println(Scramblies.scramble("scriptjavx","javascript"));

	}

}
