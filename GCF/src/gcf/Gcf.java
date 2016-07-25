package gcf;

public class Gcf {

	public int divide(int num1, int num2)
	{
//		int res = 0;
//		while(num2 != 0)
//        {
//            res = num1 % num2;
//            num1 = num2;
//            num2 = res;
//        }
//		return num1;
		if (num2==0) return num1;
		   return divide(num2,num1%num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gcf obj = new Gcf();
		System.out.println(obj.divide(6,9));
		
	}

}
