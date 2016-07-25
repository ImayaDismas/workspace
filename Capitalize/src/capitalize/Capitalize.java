/*  Write your program/code/algorithm here.
 *  If you're really stuck as to what exactly to define, go to the
 *  "Description" and click on the pseudo-link to reveal the answer
 */
package capitalize;

public class Capitalize {

	/**
	 * @param args
	 */
	public static String capitalize(String str) {
		// TODO Auto-generated method stub
		char[] chars = str.toCharArray();
		String strs = "";
		if(chars[0] == 'a')
		{
			chars[0] = 'A';
		}
		else if(chars[0] == 'b')
		{
			chars[0] = 'B';
		}
		else if(chars[0] == 'c')
		{
			chars[0] = 'C';
		}
		else if(chars[0] == 'd')
		{
			chars[0] = 'D';
		}
		else if(chars[0] == 'E')
		{
			chars[0] = 'e';
		}
		else if(chars[0] == 'f')
		{
			chars[0] = 'F';
		}
		else if(chars[0] == 'g')
		{
			chars[0] = 'G';
		}
		else if(chars[0] == 'h')
		{
			chars[0] = 'H';
		}
		else if(chars[0] == 'i')
		{
			chars[0] = 'I';
		}
		else if(chars[0] == 'j')
		{
			chars[0] = 'J';
		}
		else if(chars[0] == 'k')
		{
			chars[0] = 'K';
		}
		else if(chars[0] == 'l')
		{
			chars[0] = 'L';
		}
		else if(chars[0] == 'm')
		{
			chars[0] = 'M';
		}
		else if(chars[0] == 'n')
		{
			chars[0] = 'N';
		}
		else if(chars[0] == 'o')
		{
			chars[0] = 'O';
		}
		else if(chars[0] == 'p')
		{
			chars[0] = 'P';
		}
		else if(chars[0] == 'q')
		{
			chars[0] = 'Q';
		}
		else if(chars[0] == 'r')
		{
			chars[0] = 'R';
		}
		else if(chars[0] == 's')
		{
			chars[0] = 'S';
		}
		else if(chars[0] == 't')
		{
			chars[0] = 'T';
		}
		else if(chars[0] == 'u')
		{
			chars[0] = 'U';
		}
		else if(chars[0] == 'v')
		{
			chars[0] = 'V';
		}
		else if(chars[0] == 'w')
		{
			chars[0] = 'W';
		}
		else if(chars[0] == 'x')
		{
			chars[0] = 'X';
		}
		else if(chars[0] == 'y')
		{
			chars[0] = 'Y';
		}
		else if(chars[0] == 'z')
		{
			chars[0] = 'Z';
		}
		else {
			strs = str;
		}
		strs = String.valueOf(chars);
		
		return strs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
				System.out.println(capitalize(str));
	}

	

}
