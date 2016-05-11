package largestofthree;

public class largestnumber {
	public void largestNumOfThree(double num1, int num2, int num3){
		if(num1>num2 && num1>num3){
			int num = (int) num1;
			System.out.println(num);
		}
		else if(num2>num3){
			int num = (int)num2;
			System.out.println(num);
		}
		else{
			System.out.println(num3);
		}
	}

}
