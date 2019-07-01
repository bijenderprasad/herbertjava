package Patterns;

public class cupcake {

	public static void main(String[] args) {
	int [] price =  new int[12];
	for (int i = 0 ; i < price.length ; i++) {
		price[i]= (int) Math.pow(2, i);
	}
		// displayArray(price);
		int money = 1100;
		while (money > 0) {
			for (int i = 0; i < price.length; i++) {
				if(money<price[i]) {
					System.out.println(price[i-1]);
					money = money-price[i-1];
					break;
					
				}
				
			}
		}


	
	}
	public static void displayArray(int a[]) {
		for (int o : a) {
			System.out.println(o);
		}
	}

}
