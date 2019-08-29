package Patterns;

public class longestFreqByMe {

	public static void main(String[] args) {
		String str = "aavaauooooipoooo";
		int l = str.length();
		int c = 0;
		String op = "x";
		int max = 0;
		int length = 0;

		int size = (l * (l + 1) / 2);
		String[] st = new String[size];

		/*
		 * st[0]= str.substring(0, 1); st[1]= str.substring(0, 2); st[2]=
		 * str.substring(0, 3); st[3]= str.substring(0, 4); st[4]= str.substring(0, 5);
		 * st[5]= str.substring(1, 2);
		 */

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j <= l; j++) {
				st[c] = str.substring(i, j);
				c++;
			}
		}

		for (int i = str.length(); i > 0; i--) {
			for (int j = 0; j < size; j++) {
				 int count = 0;
				if (st[j].length() == i) {
					//System.out.print(st[j] + " ");
					for (int k = 0; k < size; k++) {
						if (st[j].equals(st[k])) 
							//System.out.println(st[j] +"=="+ st[k]);
							count++;
						
						}
//							System.out.println(st[j] + " " +count);
							if (st[j].length()>length) {
							if (count > 1) {
								if (count > max) {
									max = count;
									op = st[j];
									length= st[j].length();
									//System.out.println("debugging"+op);
								}
							}
				}
						}
					}

				}

			


			System.out.println("Longest repetatitive substring  is "+op);

		
//		for (String s : st) { System.out.print(s + " "); }
		 
		 

	}

}