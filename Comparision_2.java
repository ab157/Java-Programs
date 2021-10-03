
public class Comparision_2 {
	
	
	public static String comparision2(String st) {
		String str = st.charAt(0) + "";
		int count = 1;
		
		for(int i=1 ; i<st.length() ; i++) {
			char c1 = st.charAt(i);
			char c2 = st.charAt(i-1);
			if(c1 == c2) {
				count++;
			}
			else {
				if(count>1) {
					str += count + " ";
					count = 1;
				}
				str += c1;
			}
		}
		if(count>1) {
			str += count;
			count = 1;
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "aaabbccddeeeffggghhiiiijj";
		System.out.println(comparision2(st));
	}

}
