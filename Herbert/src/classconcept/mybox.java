package classconcept;

public class mybox {

	public static void main(String[] args) {
	
	box b1 = new box(11,11,11);
	box b2 = new box();
	box b3 = new box(5);
	
	double vol;
	vol = b1.volume();
	System.out.println(vol);
	
	vol = b2.volume();
	System.out.println(vol);
	
	vol = b3.volume();
	System.out.println(vol);
	
	
	box ob1 = new box(100,200);
	box ob2 = new box(100,200);
	box ob3 = new box(101,200);
	
	System.out.println("ob1==ob2 : " + ob1.equalTo(ob2));
	System.out.println("ob2==ob3 : " + ob2.equalTo(ob3));	
	
	
	}

}
