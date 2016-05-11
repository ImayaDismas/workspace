//Using Java, declare an int named month whose value represents a month. 
//Your code should displays the name of the month, 
//based on the value of month, using the switch statement.
package toyproblems;
import java.util.Scanner;
public class switchmonth {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of the month: ");
		 int month;
		 while((month=input.nextInt()) !=-1){
			 switch(month)
			 {
			 	case 1:{
			 		System.out.println(" The month number 1 is January");
			 		System.out.println("");
			 		break;
			 	}
			 	case 2:{
			 		System.out.println(" The month number 2 is February");
			 		System.out.println("");
			 		break;
			 	}
			 	case 3:{
			 		System.out.println(" The month number 3 is March");
			 		System.out.println("");
			 		break;
			 	}
			 	case 4:{
			 		System.out.println(" The month number 4 is April");
			 		System.out.println("");
			 		break;
			 	}
			 	case 5:{
			 		System.out.println(" The month number 5 is May");
			 		System.out.println("");
			 		break;
			 	}
			 	case 6:{
			 		System.out.println(" The month number 6 is June");
			 		System.out.println("");
			 		break;
			 	}
			 	case 7:{
			 		System.out.println(" The month number 7 is July");
			 		System.out.println("");
			 		break;
			 	}
			 	case 8:{
			 		System.out.println(" The month number 8 is August");
			 		System.out.println("");
			 		break;
			 	}
			 	case 9:{
			 		System.out.println(" The month number 9 is September");
			 		System.out.println("");
			 		break;
			 	}
			 	case 10:{
			 		System.out.println(" The month number 10 is October");
			 		System.out.println("");
			 		break;
			 	}
			 	case 11:{
			 		System.out.println(" The month number 11 is November");
			 		System.out.println("");
			 		break;
			 	}
			 	case 12:{
			 		System.out.println(" The month number 12 is December");
			 		System.out.println("");
			 		break;
			 	}
			 	default:
			 		System.out.println("Invalid input !!!!");
			 		System.out.println("");
			 		break;
			 }
			System.out.println("Enter the number of the month: ");
		 }
	}

}
