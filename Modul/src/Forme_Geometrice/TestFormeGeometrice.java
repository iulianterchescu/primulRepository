package Forme_Geometrice;

public class TestFormeGeometrice {

	public static void main(String[] args) {
		Shape shape1 = new Shape("text shape1", "plastic");
		System.out.println(shape1.getSize());
		System.out.println(shape1);
		
		Shape shape2 = new Shape("text shape1", "metal");
		System.out.println(shape2.getSize());
		System.out.println(shape2);
		
		Shape shape3 = new Shape("text shape1", "plastic");
		System.out.println(shape3.getSize());
		shape3.toString();
		System.out.println(shape3);
		
		
		System.out.println("shape1.equals(shape2) => " + shape1.equals(shape2));
		System.out.println("shape1.equals(shape3) => " + shape3.equals(shape1));
		
		
		Triangle triangle1 = new Triangle(10, 15);
		System.out.println(triangle1.getSize());
		System.out.println(triangle1);
		triangle1.displayTriangleHeight();
		
		Triangle triangle2 = new Triangle(20, 25, "triangle2 text", "lemn");
		System.out.println(triangle2.getSize());
		System.out.println(triangle2);
		triangle2.displayTriangleHeight();
		
		Triangle triangle3 = new Triangle(10, 15);
		System.out.println(triangle3.getSize());
		System.out.println(triangle3);
		triangle3.displayTriangleHeight();
		
		System.out.println("triangle1.equals(triangle2) => " + triangle1.equals(triangle2));
		System.out.println("triangle1.equals(triangle3) => " + triangle1.equals(triangle3));
		
		Rectangle rectangle1 = new Rectangle(10, 15);
		System.out.println(rectangle1.getSize());
		System.out.println(rectangle1);
		rectangle1.displayRectangleHeight();
		
		Rectangle rectangle2 = new Rectangle(20, 25, "rectangle2 text", "fibra de sticla");
		System.out.println(rectangle2.getSize());
		System.out.println(rectangle2);
		rectangle2.displayRectangleHeight();
		
		Rectangle rectangle3 = new Rectangle(10, 15);
		System.out.println(rectangle3.getSize());
		System.out.println(rectangle3);
		rectangle3.displayRectangleHeight();
		
		System.out.println("rectangle1.equals(rectangle2) => " + rectangle1.equals(rectangle2));
		System.out.println("rectangle2.equals(rectangle3) => " + rectangle1.equals(rectangle3));
	}

}
