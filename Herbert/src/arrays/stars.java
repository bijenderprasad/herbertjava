package arrays;

public class stars {

	public static void main(String[] args) {
	
	//pStar();
	//nStar();
	//numStar();
	samenumberladder();
	System.out.println("Testing done");	
		
	}

	
	public static void pStar()
	{
		int i,j;
		for(i=1;i<8;i++)
		{
			for (j=1;j<i+1;j++)
			{
				System.out.print("1");
			}
			System.out.println();
		}
	}
	
	public static void nStar()
	{
		int i,j;
		for(i=8;i>0;i--)
		{
			for (j=1;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void numStar()
	{
		int i,j; int k=1;
		for(i=1;i<5;i++)
		{
			for (j=1;j<i+1;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
	public static void samenumberladder()
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for (j=1;j<=i+1;j++)
			{
				System.out.print("1");
			}
			System.out.println();
		}

	}

}


