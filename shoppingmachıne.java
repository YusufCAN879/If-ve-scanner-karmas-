
package deneme1;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		//basıc shopping program
Scanner scanner=new Scanner(System.in);




String item;
double price;
int quantity;
char currency='$';
double total;
 
System.out.print("what ıtem would you like to buy:");
item=scanner.nextLine();
System.out.print("what is the prıce for each");
price=scanner.nextDouble();
System.out.print("how many would you want");
quantity=scanner.nextInt();
total=quantity*price;
System.out.print("Your need to pay"+total+currency);
scanner.close();






	}

}
