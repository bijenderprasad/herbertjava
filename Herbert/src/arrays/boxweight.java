package arrays;

public class boxweight extends box{

	double weight ;
	boxweight(double h, double l, double d, double w) {
		super(h, l, d);
		weight = w;
		
	}


	public boxweight() {
		super();
	}


	double volumewithwight(boxweight b, double w)
	{
		height = b.height;
		width = b.width;
		length = b.length;
		weight = w;
		return  weight*height*width*height;
	}

	public double density()
	{
	return weight*height*width*height; 
	
	}
}
