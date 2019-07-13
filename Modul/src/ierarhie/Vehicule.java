package ierarhie;

public class Vehicule {
	private final String serialNumber;
	private int noPersons;
	private String name;

	// Constructors

	public Vehicule(String serialNumber, int noPersons) {
		super();
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}

	public Vehicule(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons);
		this.name = name;
	}

	// Getters & Setters
	private String getSerialNumber() {
		return serialNumber;
	}

	// Methods
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move… ");
		return false;
	}

	public boolean addFuel(double amount) {
		System.out.println("Error: unknown type of vehicle… ");
		return false;
	}

	public void printInfo() {
		System.out.println("Vehicle properties: " + 
				"\n\t: serial number: " + serialNumber + 
				"\n\t: capacity: "+ noPersons + " persons" +
				"\n\t; name: " + name);
	}
	
	
	
}
