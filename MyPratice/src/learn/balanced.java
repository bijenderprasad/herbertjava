package Patterns;

public class balanced {

	public static void main(String[] args) {
	String [] ch = {"(","[","{"} ;
	String eq = "{(a+b)+c}";
	char [] f =eq.toCharArray();
	int flag = 1;
	for (int i = 0 ; i < f.length; i++) {
		int open = 1; int close =1; 
		for (int j = i ; j < f.length; j++) {
			if (f[j]=='{') {
				
					open++;
					f[j]='0';
					if (f[j]=='}') {
						close ++;
						f[j]='0';
				}
			
				
			}
		
		}
		if (open==close) 
			System.out.println("Equation is balanced ");
		
		else 
			System.out.println("Equation is not balanced ");
	}
	
	}
	
}
