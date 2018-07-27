package classconcept;

public class test {

	
/**
 * This method used to explain call by reference	
 */
	int a,b;
	
	test (int i, int j)
	{
		a=i;
		b=j;
		
	}

	void meth (test o)
	{
		o.a = o.a*2;
		o.b = o.b/2;
	}


/**
 * This used to explain returning object	
 */
	
	
	
	test (int i)
	{
		a=i;
	}
	
	test incrByTen()
	{
		test temp = new test (a+10);
		return temp;
		
	}
	
	
}


