import java.util.Scanner;

public class ReverseOfNumber {
	private static Scanner input;

	public static int reverseOfNo (int number) {
		int newNo = 0;
		
		while(number > 0) {
			int rem = number % 10;
			number /= 10;
			
			newNo = newNo * 10 + rem;
		}
		
		return newNo;
	}
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter the no -> ");
		int no = input.nextInt();
		System.out.println(reverseOfNo(no));
	}

}
