package Pachet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class exercitii_ArrayList {

	public static ArrayList<Integer> duplicateFreq(ArrayList<Integer> lista) {
		int finalMaxFreq = 0;
		ArrayList<Integer> rezultate = new ArrayList<Integer>();
		for (int i = 0; i < lista.size(); i++) {
			int maxFreq = 1;
			for (int j = i + 1; j < lista.size(); j++) {
				if (lista.get(i) == lista.get(j)) {
					maxFreq++;
				}
			}
			if (maxFreq > finalMaxFreq) {
				finalMaxFreq = maxFreq;
				rezultate.clear();
				rezultate.add(lista.get(i));
			}else if (maxFreq == finalMaxFreq) {
				rezultate.add(lista.get(i));
			}
		}
		return rezultate;
	}

	public static void main(String[] args) {

		ArrayList<Integer> intAL = new ArrayList<Integer>();
		intAL.add(0, 24);
		System.out.println(intAL.get(0));
		intAL.add(12);
		System.out.println(intAL.get(1));
		System.out.println(intAL.size());
		System.out.println(intAL.contains(15));
		System.out.println(intAL.indexOf(12));
		intAL.add(12);
		System.out.println(intAL.lastIndexOf(12));
		System.out.println(intAL.remove(0));
		System.out.println(intAL.get(0));
		intAL.clear();
		intAL.add(15);
		intAL.add(16);
		intAL.add(25);
		intAL.add(88);
		for (int i = 0; i < intAL.size(); i++) {
			System.out.print(intAL.get(i) + "; ");
		}
		System.out.println();
		System.out.println(intAL.get(0));

		ArrayList<Integer> valori = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15, 16));

		for (int j = 0; j < valori.size(); j++) {
			System.out.print(valori.get(j) + "; ");
		}

		System.out.println();
		valori.set(0, 25);
		for (int j = 0; j < valori.size(); j++) {
			System.out.print(valori.get(j) + "; ");
		}

		System.out.println();
		ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(39, 44, 15, 15, 42, 44, 15, 15, 18, 32, 44, 44, 44));

		System.out.println(duplicateFreq(lista));
	}
}
