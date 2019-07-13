package ierarhie;

public class Test {

	public static void main(String[] args) {
	Vehicule vehicul1 = new Vehicule("ASDD4578",4, "Dacia");
	vehicul1.addFuel(55);
	vehicul1.goTo(45, 21);
	vehicul1.printInfo();
	
	Vehicule vehicul2 = new OnRoad("DAS", 5, "BMW");
	vehicul2.addFuel(32);
	vehicul2.goTo(456, 123);
	vehicul2.printInfo();
	
	OnRoad onRoad1 = new OnRoad("DAS", 5, "BMW", 4, 2);
	onRoad1.addFuel(52);
	onRoad1.goTo(128, 781);
	onRoad1.printInfo();
	
	Vehicule vehicul3 = new OnWater("GFD", 5, "NAVA", 2, 200);
	vehicul3.addFuel(895);
	vehicul3.goTo(854, 123);
	vehicul3.printInfo();
	
	OnWater onWater1 = new OnWater("HBJK", 185, "Nava1", 5, 852);
	onWater1.addFuel(8945);
	onWater1.goTo(456, 82);
	onWater1.printInfo();
	
	Vehicule vehicul4 = new OnAir("VBNM", 555, "AIRBUS", 4, true);
	vehicul4.addFuel(888);
	vehicul4.goTo(985, 1235);
	vehicul4.printInfo();
	
	Vehicule onAir1 = new OnAir("UUBKL", 888, "Airbus2");
	onAir1.addFuel(999);
	onAir1.goTo(1234, 4321);
	onAir1.printInfo();
	}
}
