import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter your String : ");
			String name  = input.nextLine();
			for(int i=0;i<name.length();i++) {
				for(int j=i+1;j<=name.length();j++) {
					System.out.println(name.substring(i,j));
				}
			}
		}
	}
	
}
