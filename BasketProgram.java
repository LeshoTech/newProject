import javax.swing.JOptionPane;
import java.util.Scanner;

//Write a Java Program in which you are going to select the number of baskets, 
//how many eggs per basket 
//the total of eggs  
//use the pop up window JOptionPane



public class BasketProgram {

	public static void main(String[] args) 
	{
		String Name;
		Scanner Getname = new Scanner(System.in);
		
		//NumOfBaskets = Integer.parseInt(JOptionPane.showInputDialog("How many baskets do you have?"));
		
		//EggsPerBasket = Integer.parseInt(JOptionPane.showInputDialog("How many Eggs per baskets do you have?"));
		
		//JOptionPane.showMessageDialog(null,"Total Number of eggs is " + Sum );
		System.out.println("Enter your name please: ");
		Name = Getname.nextLine();
		
		if (Name.equals("Jeff"))
		{
			System.out.println("Your name is Jeff");
		}
		
	}
	
}
