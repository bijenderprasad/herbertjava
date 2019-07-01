package Patterns;

public class stringmaxmindiff {

	public static void main(String[] args) {
	
	String s1 = "?abac";
	String s2 = "aba?w";
	
	int max = 0,min=0;
	
	for (int i=0;i<s1.length();i++) {
		if (s1.charAt(i)==s2.charAt(i)) {
			if (s1.charAt(i)=='?') {
				max++;
				}
		}
		
		if (s1.charAt(i)!=s2.charAt(i)) {
			if (s1.charAt(i)!='?' && s2.charAt(i)!='?' ) {
				min++;
			}
		}
		
		if (s1.charAt(i)!=s2.charAt(i)) {
			if (s1.charAt(i)!='?' || s2.charAt(i)!='?' ) {
				max++;
			}
		}
	}
	
	
	System.out.println("min = " + min);
	System.out.println("max = " + max);

	}

}
