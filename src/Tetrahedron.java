
public class Tetrahedron extends ThreeDimensional {
	public Tetrahedron(double length, double width, double height)
	{
		super(length,width,height);
		this.length=length;
		this.width=length;
		this.height=width;
	}
	@Override
	public String toString() {
	   return String.format("Tetrahedron: %n Edge: %s%n Area: %s%n Volume: %s%n", 
	      getWidth(), getArea(),getVolume());
	}
	public double getArea() {return Math.round(Math.sqrt(3)*(getLength()*getLength())*100.0)/100.0;}
	public double getVolume() {return  Math.round(( (getWidth()*getLength()*getHeight()) / (6*Math.sqrt(2)) )*100.0)/100.0;}

}

