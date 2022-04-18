
public class Cube extends ThreeDimensional  {
	public Cube(double length, double width, double height)
	{
		super(length,width,height);
		this.length=length;
		this.width=length;
		this.height=width;
	}
	@Override
	public String toString() {
	   return String.format("Cube: %n Radius: %s%n Area: %s%n Volume: %s%n", 
	      getWidth(), getArea(),getVolume());
	}
	public double getArea() {return 6*(getLength()*getLength());}
	public double getVolume() {return getLength()*getWidth()*getHeight();}

}
