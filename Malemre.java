package enayiemrahan;
import java.util.Scanner;
public class Malemre {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("bugün kendinizi nasıl hissediyorsunuz?");
	String durum=scanner.nextLine();
	System.out.println( durum+" şimdilik iyi gözüküyor");
	
	/*
	 * ilk olarak mainin önüne import java.util.Scanner;
	 * ekrana yansıtmak için kullanılacak komut=Scanner
	 * string için scanner.nextline();
	 * int için nextInt()
	 
	 * 
	 */
	System.out.println("10 üzerinden bir puanlama alalım");
	double puanlama=scanner.nextInt();
	if (puanlama<4) {
	System.out.println("Senin adına üzgünüm");
	}
	else {
		System.out.println("iyi olduğuna sevindim");
	}
	}
}
	
		

	


