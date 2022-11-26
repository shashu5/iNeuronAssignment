
public class LowertoUpper {
	public static void main(String[] args) {
		String s1="akshay";
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			int a=s1.codePointAt(i)-32;
			s2=s2+(char)a;
		}
		System.out.println(s2);
	}
}
