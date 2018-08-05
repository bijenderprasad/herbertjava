package classconcept;

public class box {

	double width,heigth, depth;
	int a,b;

	//constructor with 3 dimension
box(double w, double h, double d)
{
	width = w;
	heigth =h;
	depth=d;
}
	
//constructor with no argument
box()
{
	width = -1;
	heigth =-1;
	depth=-1;
}

box(double len)
{
	width=heigth= depth=len;
}


double volume()
{
	return width*heigth* depth;
}

box (int i, int j)
{
	a=i;
	b=j;
}

boolean equalTo (box o)
{
	if (o.a==a && o.b==b)
		return true;
	else
		return false;
}


}
