package duplicateelements;

public class NthSeries {
	
	public static String seriesSum(int n) {
		// Happy Coding ^_^		
    int num = n;
		double result = 0.00;
    int i = 1;
		while(num > 0){
			result = result + (double) 1 /i;
			i+=3;
			num--;
		}
   
    return  Double.toString(result);
	}
	public static void main(String[] args){
		System.out.println(seriesSum(5));
	}
}