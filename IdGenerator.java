import java.util.Scanner;

public class IdGenerator {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.print("Enter 1st Name : ");
		String firstName = input.nextLine();
		System.out.print("Enter 2nd Name : ");
		String lastName = input.nextLine();
		System.out.print("Enter the PIN : ");
		int pin = input.nextInt();
		System.out.print("Enter Index Number : ");
		int number = input.nextInt();
		
		System.out.println("System Generated Id -> " + idGenatorAlgorithm(firstName, lastName, pin, number));
	}


	private static String idGenatorAlgorithm(String firstName, String lastName, int pin, int number) {
		String shortName = "";
		String longName = "";
		String pinNo = pin + "";
		char rl;
		char lr;
		String result;
		
		if(firstName.length() < lastName.length()) {
			shortName = toggleCaseCharacters(firstName);
			longName = toggleCaseCharacters(lastName);
		}
		else if (firstName.length() > lastName.length()) {
			shortName = toggleCaseCharacters(lastName);
			longName = toggleCaseCharacters(firstName);
		}
		else if (firstName.length() == lastName.length()) {
			shortName = toggleCaseCharacters(firstName);
			longName = toggleCaseCharacters(lastName);
		}
		
		rl = pinNo.charAt(number-1);
		lr = pinNo.charAt(pinNo.length() - number);
		
		result = longName.charAt(0) + shortName + rl + lr;
		
		return result;
	}

	private static String toggleCaseCharacters(String name) {
		String newName = "";
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(ch>= 65 && ch<= 90) {
				ch += 32;
				newName += ch;
			}
			else if (ch>= 97 && ch<= 122) {
				ch -= 32;
				newName += ch;
			}
		}
		return newName;
	}


}
