package Forme_Geometrice;

public class Shape {

	private String text;
	private String material;
	
	//Constructors
	public Shape() {
		super();
	}
	
	public Shape (String text, String material) {
		this ();
		this.text = text;
		this.material = material;
	}

	private String getText() {
		return text;
	}

	private void setText(String text) {
		this.text = text;
	}

	private String getMaterial() {
		return material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "made of " + this.material + " contains the text: " + this.text;
	}
	
	public double getSize() {
		return -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Shape))
			return false;
		Shape other = (Shape) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	
}
