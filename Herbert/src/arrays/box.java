package arrays;


public class box {

double height;
double length;
double width;

box()
{

}

box(double h, double l, double d)
{
	height = h;
	length = l;
	width = d;
}
	

box(double len)
{
	height=length= width=len;
}

double volume() {
	return height*length*width;
	
}
	

	

}