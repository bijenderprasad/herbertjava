package Patterns;

public class pattern1 {

	public static void main(String[] args) {
		pattern_main();
		pattern_water();
		pattern_mirror();

	}

	public static void pattern_main() {
		for (int i = 1; i<=5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void pattern_water() {
		System.out.println("---------------------------------------------------------");
		for (int i=1;i<6;i++) {
			for (int j=6;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	public static void pattern_mirror() {
		System.out.println("---------------------------------------------------------");
		for (int i=1;i<6;i++) {
			for (int j=6;j>i;j--) {
			
					System.out.print(" ");
				}
			
			for (int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
	}
	
	
}
