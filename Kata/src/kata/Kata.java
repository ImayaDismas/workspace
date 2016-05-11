package kata;
public class Kata {
  public static void mostFrequentItemCount(int[] collection) {
    // Do your magic :)
    int length = collection.length;
    int count = 0;
    int[] occurrence = new int[length];
    for(int i = 0; i < length; i++){
          if(collection[i] == collection[i+1]){
             count++;
        }
        occurrence[i] = count;
        System.out.println("Frequency: " + count);
    }
//    int max = occurrence[length - 1];
//    for(int c = 0; c < length; c++){
//        if(max < occurrence[c]){
//          max = occurrence[c];
//        }
//    }
//    return max;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostFrequentItemCount(new int[] {3, -1, -1});
	}
}
