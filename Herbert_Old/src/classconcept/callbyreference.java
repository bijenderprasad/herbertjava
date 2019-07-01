package classconcept;

public class callbyreference {

	public static void main(String[] args) {
	
	//test obj = new test(15,20);
	//System.out.println("a and b before change " + obj.a + " " + obj.b);

	//obj.meth(obj);
	
	//System.out.println("a and b after change " + obj.a + " " + obj.b);
	
	
	//test ob = new test(5);
	//test ob2 = ob.incrByTen();
	//System.out.println(ob.a);
	//System.out.println(ob2.a);
	callbyreference rec = new callbyreference();
	System.out.println("recurcion of 5 is "+rec.fact(5));
			
	
	
	}


	 int fact (int n)
	 {
		 int result;
		 if (n==1)
		return 1;
	
		 result = fact (n-1) *n;
		 return result;
		 
		 
	 }
	
}
