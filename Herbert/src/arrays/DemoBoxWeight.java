package arrays;

public class DemoBoxWeight {

	
public static void main (String args[]) {
box b1 = new box(2);
boxweight b2 = new boxweight();

double vol, wei;
vol=b1.volume();
System.out.println("Volume using box class is - " + vol );


//vol=b2.density();
wei=b2.volumewithwight(b2, 50);
System.out.println("Volume using box class is - " + vol );
System.out.println("volumn with weight - " + wei);
}
}