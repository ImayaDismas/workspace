package line;

public class Line {
	  public static String Tickets(int[] peopleInLine)
	  {
	        //Your code is here...
	        String answer="";
	        for(int i=0; i < peopleInLine.length; i++)
	        {
		            if(peopleInLine[i] == peopleInLine[i+1] || peopleInLine[i+1] == 0.5*peopleInLine[i])
		            {
			              answer = "YES";
			        }
		            else if (peopleInLine[i] < peopleInLine[i+1])
		            {
		              answer = "NO";
		            }
	        }
	        return answer;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Tickets(new int[] {25, 25, 50}));
		System.out.println(Tickets(new int []{25, 100}));
	}

}
