package doublechar;

public class DoubleChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "Dismas";
		String result = "";
		String a_letter = "";
		for (int i=0; i < one.length(); i++)
		{
			//System.out.print(one.charAt(i) + "" + one.charAt(i));
			//System.out.print(one.charAt(i));
			//result += one.charAt(i) + "" + one.charAt(i);
			a_letter += Character.toString(one.charAt(i)) + "" + Character.toString(one.charAt(i));
		}
		System.out.print(result);
		System.out.print(a_letter);
	}

}
