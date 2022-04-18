
public class Circle extends TwoDimensional{
	
	public Circle(double length, double width)
	{
		   super(length,width);
		this.length=length;
		this.width=width;
	}
	
	 @Override
	   public String toString() {
	      return String.format("Circle: %n Radius: %s%n Area: %s%n", 
	         getWidth()*.5, getArea());
	   }
	 public double getArea() {return Math.round(((0.5*getWidth()*(0.5*getWidth()))*3.14)*100.0)/100.0;}
	
}
