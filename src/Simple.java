import java.util.Scanner;
public class Simple {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=s.next();
		s.close();
		System.out.println("Hai  " +name);
	}

}
