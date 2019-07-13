package Pachet;

public class buble_sort {

	public static void bubbleSort(double[] values) {
		int counter = values.length -1;
		double aux;
		for (int j = 0; j < values.length-1 ; j++) {
			for (int i = 0; i < values.length-1-j; i++) {
				if (values[i] > values[i + 1]) {
					aux = values[i];
					values[i] = values[i + 1];
					values[i + 1] = aux;
				}
			}
		}
	}
	
	public static void iBubbleSort(double[] values) {
		double aux;
		for (int j = 0; j < values.length -1; j++) {
			for (int i = 0; i < values.length-1; i++) {
				if (values[i] < values[i + 1 ]) {
					aux = values[i];
					values[i] = values[i + 1];
					values[i+1] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		double[] values = { 5.6, 2.8, 65.4, 12.2, 4.6, 7.2, 2.3 };
		bubbleSort(values);
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + ", ");
		}
		System.out.println();
		
		iBubbleSort(values);
		for(int i = 0; i < values.length; i++) {
			System.out.print(values[i] + ", ");
		}
	}

}
