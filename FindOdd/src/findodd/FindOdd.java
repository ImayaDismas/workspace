package findodd;
import java.util.Arrays;
public class FindOdd {
	public static int findIt(int[] A) {
    Arrays.sort(A);
    int count = 0;
    int odd = 0;
    
      for(int i=0;i<A.length;i++)
      {
         for(int j=1;j<A.length;j++)
         {
              if(A[i] == A[j]){
                  count++;
              }
          }
          if((count%2 == 1) || (count==0)){
             odd = A[i];
          }
          count = 0;
          
      }
  	return odd;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findIt(new int[]{10}));
	}

}
