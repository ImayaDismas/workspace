package smallest;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < args.length; i++) {
          if(smallest > args[i]) { 
            smallest = args[i];
          } 
        }
        return smallest;
    }
    public static void main(String[] args){
//        int expected = 11;
//        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
//    	int expected = -33;
//        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
    	int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);
    }
}