
public class ThreeDimensional extends Shape{

	   protected double height = 0;
	
	   
	   public ThreeDimensional(double length, double width, double height)
	   {
		   super(length,width);
		   this.length=length;
		   this.width=width;
		   this.height=height;
	   }
	   
	
	   public double getWidth() {return width;}
	   public double getLength() {return length;}
	   public double getHeight() {return height;}
	   
}
