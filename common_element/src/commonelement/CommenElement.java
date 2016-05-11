// Using Java, come up with an algorithm to identify common elements or 
// numbers between two given arrays. Do NOT use any inbuilt methods.
package commonelement;

public class CommenElement {
	public static void main(String[] args){
		int[] arrayA = {1, 2, 3, 4, 8, 10, 17, 7, 0};
		int[] arrayB = {9, 8, 7, 15, 10, 12};
		System.out.println("Common element are:");
		System.out.print("[");
		for(int i = 0; i < arrayA.length; i++){
			for(int j = 0; j < arrayB.length; j++){
				if(arrayA[i] == arrayB[j]){
					System.out.print(" "+ arrayA[i] + " ");
				}
			}
		}
		System.out.println("]");
	}

}
