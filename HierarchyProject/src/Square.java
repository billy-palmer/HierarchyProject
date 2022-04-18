
public class Square extends TwoDimensional {

	public Square(double length, double width)
	{
		   super(length,width);
		this.length=length;
		this.width=length;
	}
	
	 @Override
	   public String toString() {
	      return String.format("Square: %n Side: %s%n Area: %s%n", 
	          getLength(), getArea());
	   }
	 public double getArea() {return getWidth()*getLength();}
}
