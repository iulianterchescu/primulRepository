package Forme_Geometrice;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}


	public Triangle() {
		super();
	}


	public Triangle(int base, int height, String text, String material) {
		super(text, material);
		this.base = base;
		this.height = height;
	}


	private int getBase() {
		return base;
	}


	private void setBase(int base) {
		this.base = base;
	}


	private int getHeight() {
		return height;
	}


	private void setHeight(int height) {
		this.height = height;
	}
	
	public void displayTriangleHeight() {
		System.out.println("Triangle height is: " + this.height);
	}


	@Override
	public double getSize() {
		return (this.base * this.height)/2;
	}


	@Override
	public String toString() {
		return "Triangle: height is " + this.height + ", base is " + this.base + ", " + super.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + base;
		result = prime * result + height;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Triangle))
			return false;
		Triangle other = (Triangle) obj;
		if (base != other.base)
			return false;
		if (height != other.height)
			return false;
		return true;
	}
	
	
	
}
