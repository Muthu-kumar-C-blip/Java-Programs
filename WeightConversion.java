package process;
import java.util.Scanner;

class Conversion{
	
	public void Calculation() {
		
		double weight;
		double New_weight;
		int choice;
		
		Scanner scaobj =new Scanner(System.in);
		
		System.out.println("Welcome to Weight Conversion Program");
		System.out.println("1: Convert lbs to kgs");
		System.out.println("2: Convert kgs to lbs");
		System.out.print("Enter Your Choice: ");
		
		choice = scaobj.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter Your Weight in lbs: ");
			weight = scaobj.nextDouble();
			New_weight = weight * 0.453592;
			System.out.printf("Your Weight in Kilograms is %.2f", New_weight);
		}
		else if(choice == 2) {
			System.out.print("Enter Your Weight in Kg: ");
			weight = scaobj.nextDouble();
			New_weight = weight * 2.20462;
			System.out.printf("Your Weight in lbs is %.2f", New_weight);
		}
		else {
			System.out.println("Please Enter the Valid Choice");
		}
		scaobj.close();
	}
}

public class WeightConversion {

	public static void main(String[] args) {
		
		Conversion conobj = new Conversion();
		conobj.Calculation();
	}

}
