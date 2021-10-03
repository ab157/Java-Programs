
public class Toggle_Case_Characters {
	
	private static String Toggle_Case(String name) {
		String st = "";
		for(int i=0 ; i<name.length() ; i++) {
			char ch = name.charAt(i);
			if(ch>=65 && ch<=90) {
				ch += 32;
				st += ch;
			}
			else if(ch>=97 && ch<=122) {
				ch -=32;
				st += ch;
			}
		}
		return st;
	}

	public static void main(String[] args) {
		String name = "DeBRaj";
		System.out.println(Toggle_Case(name));
	}



}
