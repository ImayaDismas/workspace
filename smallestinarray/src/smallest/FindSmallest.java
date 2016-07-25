package smallest;
//Java program to find smallest number in an array

public class FindSmallest {
  
 public static void main(String[] args) {
     int[] numbers = {88,33,55,23,64,123};
     int smallest = Integer.MAX_VALUE;
     for(int i =0;i<numbers.length;i++) {
         if(smallest > numbers[i]) {
             smallest = numbers[i];
         }
     }
	System.out.println("Smallest number in array is : " +smallest);
 }
}
