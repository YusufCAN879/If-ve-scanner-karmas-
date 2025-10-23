package can;
import java.util.Random;
public class TruthDare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random=new Random();
System.out.println("Do you thınk what comes coin get ya' ");
boolean Truth;
boolean Dare;

Truth=random.nextBoolean();
if(Truth) {
	System.out.println("TRUTH");
	
}
else  {
	System.out.println("DARE");
	
}

	
	}

}
