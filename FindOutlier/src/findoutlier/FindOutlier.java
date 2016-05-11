package findoutlier;

public class FindOutlier{
	  static int find(int[] integers){
	      int count = 0;
	      int counter = 0;
	      int N = 0;
	      for(int i = 0; i < integers.length; i++){
	          if(integers[i]%2 == 0){
	              count++;
	          }
	          else{
	              counter++;
	          }
	      }
	      if(count == 1){
	          for(int i = 0; i < integers.length; i++){
	              if(integers[i]%2 == 0){
	                  N = integers[i];
	              }  
	          }
	      }
	      else if (counter == 1){
	            for(int i = 0; i < integers.length; i++){
	              if(integers[i]%2 == 1 || integers[i]%2 == -1){
	                  N = integers[i];
	              }  
	            }
	      }
	  return N;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] exampleTest1 = {2,6,8,-10,3}; 
	     int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
	     int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
	     System.out.println(find(exampleTest3));
	}

}
