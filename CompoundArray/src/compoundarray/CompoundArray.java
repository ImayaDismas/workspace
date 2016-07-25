package compoundarray;
import java.util.Arrays;
public class CompoundArray {
	public static int[] compoundArray(int[] a, int[] b){
	    //Who Dares wins!
	    int size = a.length + b.length;
	    int max=0;
	    if(a.length > b.length){
	    	max = a.length;
	    }
	    else{
	    	max = b.length;
	    }
	    char[] chars1 = Arrays.toString(a).toCharArray();
	    char[] chars2 = Arrays.toString(b).toCharArray();
	    String comb = " ";
	    for(int i = 0;i < max;i++)
	    {
	    	if(i==0 ||(i%2==0)){
	   			comb+=chars1[i];
	    	}
	    	else{
	    		comb+=chars2[i];
	    	}
	    }
	    String[] stringArray = comb.split(",");
	    int[] intArray = new int[stringArray.length];
	    for (int i = 0; i < stringArray.length; i++) {
	         String numberAsString = stringArray[i];
	         intArray[i] = Integer.parseInt(numberAsString);
	      }
	    return new int[] {}; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compoundArray(new int[] {1,2,3,4,5,6}, new int[] {9,8,7,6});
	}

}
