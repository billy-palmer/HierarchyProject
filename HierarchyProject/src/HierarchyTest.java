
public class HierarchyTest {
	public static void main(String[] args) {
		Shape[] shapeObjects = new Shape[] { // this program lets you see the area and/or volume of a shape by entering
												// its data by using hierarchy
				new Circle(4, 4), new Square(6, 6), new Triangle(30, 3), new Sphere(2, 2, 2), new Cube(5, 5, 5),
				new Tetrahedron(2, 2, 2) };

		for (Shape shape : shapeObjects) {

			System.out.printf("%s%n", shape.toString());

		}
	}
}
