
public class Sphere extends ThreeDimensional  {
public Sphere(double length, double width, double height)
{
	super(length,width,height);
	this.length=length;
	this.width=width;
	this.height=height;
}
@Override
public String toString() {
   return String.format("Sphere: %n Radius: %s%n Area: %s%n Volume: %s%n", 
      getWidth()*.5, getArea() ,getVolume());
}
public double getArea() {return Math.round((4*((0.5*getWidth()*(0.5*getWidth()))*3.14))*100.0)/100.0;}
public double getVolume() {return Math.round((4/3*(0.5*getWidth()*0.5*getWidth()*(0.5*getWidth()) )*3.14)*100.0)/100.0;}
}
