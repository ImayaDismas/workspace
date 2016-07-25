package smallestIntegerfinder;

public class SmallestIntegerFinder {

	public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for(int i = 0; i < args.length; i++) {
        	if(smallest > args[i]) 
        	{ 
        		smallest = args[i];
        	} 
        }
        return smallest;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSmallestInt(new int[]{78,56,232,12,11,43}));
		System.out.println(findSmallestInt(new int[]{78,56,-2,12,8,-33}));
	}

}
