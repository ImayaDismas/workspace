package digital_root;

public class digital_root {

	/**
	 * @param args
	 * 
	 */
	public static int digital_root1(int n) {
	    // ...
	    int num = n;
	    int sum = 0;
	    if(num/10 < 1)
	    {
	      sum += num;
	    }
	    else{
	      sum = digital_root1(((num/10) + num%10));
	    }
	    return sum;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digital_root.digital_root1(16));
		System.out.println(digital_root.digital_root1(942));
		System.out.println(digital_root.digital_root1(132189));
		System.out.println(digital_root.digital_root1(493193));
	}

}
