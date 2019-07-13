package Pachet;

public class Vehicle {
	private static final String producedBy = "Volga";
	private final int productionYear;
	private final String vin;
	private String plateNumber;
	private int kilometers;
	private int lastSoldYear;
	private double positionY;
	private double positionX;

	public Vehicle(int productionYear, String vin) {
		this.vin = vin;
		this.productionYear = productionYear;
	}

	public Vehicle(int productionYear, String vin, String plateNumber) {
		this(productionYear, vin);
		this.plateNumber = plateNumber;
	}

	public Vehicle(int productionYear, String vin, String plateNumber, int lastSoldYear) {
		this(productionYear, vin, plateNumber);
		this.lastSoldYear = lastSoldYear;
	}

	private String getPlateNumber() {
		return plateNumber;
	}

	private void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	private int getKilometers() {
		return kilometers;
	}

	// Metode
	public void sellVehicle(String plateNumber, int lastSoldOnYear) {
		this.plateNumber = plateNumber;
		this.lastSoldYear = lastSoldOnYear;
	}

	public double mutareMasina(double newPositionX, double newPositionY) {
		// this.positionX = positionX;
		// this.positionY = positionY;
		double ecuatie = ((newPositionX - positionX) * (newPositionX - positionX))
				+ ((newPositionY - positionY) * (newPositionY - positionY));
		double distanta = Math.sqrt(ecuatie);
		this.positionX = newPositionX;
		this.positionY = newPositionY;
		kilometers += distanta;
		return distanta;
	}

	public boolean isVehicleFromNothAmerica(String vin) {
		if (vin.length() != 17) {
			return false;
		}

		char[] charVin = vin.toCharArray();
		int[] weight = { 8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2, };
		int sum = 0;
		int num = 0;
		
			for (int i = 0; i < vin.length(); i++) {
				if (i == 8) {
					continue;
				}
				if (Character.isDigit(charVin[i])) {
					num = charVin[i] + '0';
					sum +=num*weight[i];
				} else {
					switch (charVin[i]) {
					case 'A':
					case 'J':
						sum += 1*weight[i];
						break;
					case 'B':
					case 'K':
					case 'S':
						sum += 2*weight[i];
						break;
					case 'C':
					case 'L':
					case 'T':
						sum += 3*weight[i];
						break;
					case 'D':
					case 'M':
					case 'U':
						sum += 4*weight[i];
						break;
					case 'E':
					case 'N':
					case 'V':
						sum += 5*weight[i];
						break;
					case 'F':
					case 'W':
						sum += 6*weight[i];
						break;
					case 'G':
					case 'P':
					case 'X':
						sum += 7*weight[i];
						break;
					case 'H':
					case 'Y':
						sum += 8*weight[i];
						break;
					case 'R':
					case 'Z':
						sum += 9*weight[i];
						break;
					}
				}
				char arr[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'X'};
				if (arr[sum%11] == charVin[8]) {
					return true;
				}
			}
		return false;
	}

	public boolean isVinValid(boolean isDrivingInNorthAmerica) {
		return false;
	}
}
