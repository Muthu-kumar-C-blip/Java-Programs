package process;
import java.util.Scanner;

class Calculations{
	
	public void CIOperation() {
		
		double principal;
		double rate;
		int timescompound;
		int years;
		double amount;
		
		Scanner scaobj = new Scanner(System.in);
		
		System.out.print("Enter the Principal Amount: ");
		principal = scaobj.nextDouble();
		
		System.out.print("Enter the Interest Rate (in%): ");
		rate = scaobj.nextDouble() / 100;
		
		System.out.print("Enter the Number of times Compounded Per Year: ");
		timescompound = scaobj.nextInt();
		
		System.out.print("Enter the Number of the Years: ");
		years = scaobj.nextInt();
		
		amount = principal * Math.pow(1 + rate/timescompound, timescompound*years);
		
		System.out.printf("The Amount after %d Years is ₹%,.2f", years,amount);
		scaobj.close();
	}
	
}


public class CompoundInterestCalculator {

	public static void main(String[] args) {
		
		Calculations Calobj = new Calculations();
		Calobj.CIOperation();
	}

}
