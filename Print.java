package process;
import java.util.Scanner;

class Coffeshoppingcart {

	public void operation() {
	Scanner ic =new Scanner(System.in);
	
	String item;
	double price;
	int quantity;
	double total;
	char currency= '₹';
	
	System.out.print("What item Would you like to buy: ");
	item = ic.nextLine();

	System.out.print("What is the Price of each?: ");
	price = ic.nextDouble();
	
	System.out.print("How many Would you Like: ");
	quantity = ic.nextInt();
	
	total = price*quantity;
	
	System.out.println("You have Bought "+ quantity + " "+ item);
	System.out.println("The Total Amount is " +currency+ total);
	
	
	ic.close();	
	
}

}
public class Print{
	public static void main(String [] args) {
		
		Coffeshoppingcart  cafeobj = new  Coffeshoppingcart();
		cafeobj.operation();
		
	}
}