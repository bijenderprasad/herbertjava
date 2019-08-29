package Patterns;

interface test{
	void run();
}
public class AnymousClass {

	public static void main(String[] args) {
		test t=new test() {

			@Override
			public void run() {
			System.out.println("this is pradeep method");
				
			}
			
		};
		
		t.run();

	}
	

}
