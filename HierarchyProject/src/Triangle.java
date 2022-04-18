public class Triangle extends TwoDimensional {

	public Triangle(double length, double width)
	{
		   super(length,width);
		this.length=length;
		this.width=width;
	}
	
	 @Override
	   public String toString() {
	      return String.format("Triangle: %n Base: %s%n Height: %s%n Area: %s%n", 
	         getWidth(), getLength(), getArea());
	   }
	 public double getArea() {return Math.round(((getLength()*getWidth())/2)*100)/100;}
}
