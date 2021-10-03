
public class Comparision_1 {
	
	private static String comparision1(String st) {
		// TODO Auto-generated method stub
		String str = st.charAt(0) + " ";
		
		for(int i=1 ; i<st.length() ; i++) {
			char c1 = st.charAt(i);
			char c2 = st.charAt(i-1);
			if(c1 != c2) {
				str += c1 + " ";
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String st = "aaabbccddeeeffggghhiiiijj";
		System.out.println(comparision1(st));
	}

}
