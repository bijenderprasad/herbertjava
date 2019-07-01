package classconcept;

public class ObjectUniqueData {

	int num=100;
	
	public static void main(String[] args) {
		ObjectUniqueData oud = new ObjectUniqueData();
		
		System.out.println(oud.num);
		oud.change(50);
		System.out.println(oud.num);
	
		ObjectUniqueData oud1 = oud;
		System.out.println(oud1.num);
	}
	
		public void change(int num)
		{
			this.num = this.num + num;
			
			System.out.println(this.num);
			
		}

	}


