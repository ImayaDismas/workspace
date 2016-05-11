package circleSorted;
import java.util.Arrays;
public class CircleSorted {

	/**
	 * @param args
	 */
	 public boolean isCircleSorted(int[] a) {
	        //TODO
			int[] b = new int[a.length];
			b = a.clone();
			Arrays.sort(b);
			
			int last = a.length-1;
			int pos = 0;
	        for(int i =0; i < b.length; i++)
	        {
	        	
	        	if(a[last] == b[i])
	        	{
	        		if(a[last] == b[last]&& a[0] == b[0])
	        		{
	        			return true;
	        		}
	        		if(a[last] == b[last])
	        		{
	        			return false;
	        		}
	        		else
	        		{
	        			pos = i+1;
	        		}
	        		
	        	}
	        }
	        
	        if(a[0]== b[pos] )
	        {
	            	return true;
	        }

	        return false;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CircleSorted calc = new CircleSorted();
//		 int[] A={3,0,1,2};
//		 
//		 System.out.println(calc.isCircleSorted(A));
//		 int[] B={9,10,14,12};
//		 System.out.println(calc.isCircleSorted(B));
		 int[] C={7,6,5,4,3,2,1};
		 System.out.println(calc.isCircleSorted(C));
		 
	}

}
