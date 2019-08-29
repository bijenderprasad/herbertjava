package Patterns;

import java.net.InetAddress;
import java.util.Scanner;

//interface arrayop {void disp(int [] a);}
public class ipaddress {

	public static void main(String[] args) {
	int num; int index = 0;int flag =0;
	System.out.print("Enter the array size = ");
	Scanner sc = new Scanner (System.in);
	num = sc.nextInt();
	int [] arr = new int[num];
	for (int i=0;i<num;i++) {
		System.out.print("Enter " +(i+1) +" element = ");
		arr[i] = sc.nextInt();
		System.out.println();
	}
	
	for (int i=0;i<num;i++) {
		System.out.println(arr[i]);
	}

	System.out.print("Enter the element needs to be found = ");
	
	int search = sc.nextInt();

		for (int y : arr) {
			if (y == search) {
				System.out.println(search + " is present at index "  + (index + 1));
				flag=1;
			}

			
			index++;

		}
		if(flag==0) {	
			System.out.println("Element not found");
			}

}
}


/*arrayop display=(a)->{
for(int b:a) {System.out.println(b);}
};

arrayop displaytow=(a)->{System.out.println("implementation got changed");};
display.disp(arr);
displaytow.disp(arr);
*/