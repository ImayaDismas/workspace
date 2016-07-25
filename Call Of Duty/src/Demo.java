import java.util.*;
public class Demo {
	public static void main(String[] args){
		int damage;
		  @SuppressWarnings("resource")
		  Scanner dmg = new Scanner(System.in);
	      Soldiers ghost = new Soldiers(4,400);
	      System.out.println("Your points are : "  +ghost.gethitpoints());
	      System.out.println("Your Current lives are: "  +ghost.getlives());
	      System.out.println("Enter The Damage: ");
	      damage = dmg.nextInt();
	      ghost.setdamage(damage);
	      if(ghost.gethitpoints()>1000){
	    	  System.out.println("Your Damage is: "  +ghost.getdamage());
		      System.out.println("Your Remaining hitpoints is: "  +ghost.takeDamage());
		      //Object is an instance of a class
		      SuperSoldier obj = new SuperSoldier();
		      int num = obj.takeDamage(ghost.getdamage());
		      System.out.println("The soldier receives a damage of: " + num);
	      }
	      else{
	    	  System.out.println("You have less hit points to play the game!!");
	      }
	      }

}
