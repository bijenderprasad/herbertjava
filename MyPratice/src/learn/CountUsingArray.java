package Patterns;

public class CountUsingArray {

	public static void main(String[] args) {
		String str = "This This This done this is is by Saket Saket Saket";
		String [] strArr = str.split("\\s+");
		int [] repeat = new int [strArr.length];
		//displayArray(repeat);
		for (int i = 0 ; i < strArr.length;i++) {
			int count = 1;
			for (int j = i+1;j<strArr.length;j++) {
				if (strArr[i].equals(strArr[j])) {
					count++;
					repeat[j]=1;
					
				}
			}
			if(repeat[i]==0) {
			System.out.println(strArr[i]+" occured " + count + " times");
			}
		}
		

	}
	public static void displayArray(int a[]) {
		for (int o : a) {
			System.out.println(o);
		}
	}
}
