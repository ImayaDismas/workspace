package braceChecker;

public class BraceChecker {

	public static boolean isValid(String braces) {
	    // Add code here
	    int count = 0;
	    int counter = 0;
	    int c = 0;
	    int c1 = 0;
	    int count1 = 0;
	    int counter1 = 0;
	    char[] charArray = braces.toCharArray();
	    boolean result = false;
	    for(int i = 0; i < charArray.length; i++)
	    {
	    	if(charArray[0] == '[')
	    	{     
	    		  if(charArray[i] == '[')
			      {
			        count++;
			      }
			      if(charArray[i] == '(')
			      {
			        counter++;
			      }
			      if(charArray[i] == ']' && (i+1)%2 == 0)
			      {
			        count1++;
			      }
			      if(charArray[i] == ')')
			      {
			        counter1++;
			      }
			      if(charArray[i] == '{')
			      {
			        c++;
			      }
			      if(charArray[i] == '}')
			      {
			        c1++;
			      }
	    	}
	    	
	    	if(charArray[0] == '(')
	    	{     
	    		if(charArray[i] == '[')
			      {
			        count++;
			      }
			      if(charArray[i] == '(')
			      {
			        counter++;
			      }
			      if(charArray[i] == ']')
			      {
			        count1++;
			      }
			      if(charArray[i] == ')' && (i+1)%2 == 0)
			      {
			        counter1++;
			      }
			      if(charArray[i] == '{')
			      {
			        c++;
			      }
			      if(charArray[i] == '}')
			      {
			        c1++;
			      }
	    	}
	    	if(charArray[0] == '{')
	    	{     
	    		if(charArray[i] == '[')
			      {
			        count++;
			      }
			      if(charArray[i] == '(')
			      {
			        counter++;
			      }
			      if(charArray[i] == ']')
			      {
			        count1++;
			      }
			      if(charArray[i] == ')')
			      {
			        counter1++;
			      }
			      if(charArray[i] == '{')
			      {
			        c++;
			      }
			      if(charArray[i] == '}'  && (i+1)%2 == 0)
			      {
			        c1++;
			      }
	    	}
	    }
	    
	    if(count == count1 && counter == counter1 && c == c1)
	    {
	      result = true;
	    }
	    
	    return result;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BraceChecker.isValid("()"));
		System.out.println(BraceChecker.isValid("[(])"));
		System.out.println(BraceChecker.isValid("(){}[]"));
		System.out.println(BraceChecker.isValid("[({})](]"));
		System.out.println(BraceChecker.isValid("(}"));
		System.out.println(BraceChecker.isValid("([{}])"));
	}

}
