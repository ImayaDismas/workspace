package charProblem;

public class CharProblem {

	/**
	 * @param args
	 */
	public static int howOld(final String herOld) {
	
		  char c = herOld.charAt(0);
		  String str = String.valueOf(c);
		  int age = Integer.parseInt(str);
		  return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CharProblem.howOld("5 years old"));

	}

}
