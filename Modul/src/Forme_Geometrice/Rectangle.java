package Forme_Geometrice;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	//Constructors
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height, String text, String material) {
		super(text, material);
		this.height = height;
		this.width = width;
	}
	
	public void displayRectangleHeight() {
		System.out.println("Rectangle height is : " + this.height);
	}
	@Override
	public double getSize() {
		return this.width * this.width;
	}
	@Override
	public String toString() {
		return "Rectangle: height is " + this.height + ", widths is: " + this.width + ", " + super.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	
	
	
}
