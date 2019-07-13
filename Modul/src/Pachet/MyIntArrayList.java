package Pachet;

import java.util.Arrays;

public class MyIntArrayList {
	private int[] elements;
	private int size;

	// GETTERS & SETTERS!!
	private void setElements(int[] elements) {
		this.elements = elements;
	}

	private int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}

	public MyIntArrayList() {
		this(10);
	}

	public MyIntArrayList(int initialCapacity) {
		this.elements = new int[initialCapacity];
	}

	// De CONTINUAT!!!
	public MyIntArrayList(MyIntArrayList c) {
		this.elements = Arrays.copyOf(c.elements, c.size);

	}

	// METODE!!
	public boolean add(int e) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}

		this.elements[size] = e;
		this.size++;

		return true;
	}

	public void add(int index, int e) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}
		for (int i = elements.length - 2; i >= index; i--) {
			elements[i + 1] = elements[i];
		}
		this.elements[index] = e;
	}

	public int size() {
		return this.size;
	}

	public boolean contains(int e) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == e) {
				return true;
			}

		}
		return false;
	}

	public int get(int e) {
		for (int i = 0; i < elements.length; i++) {
			if (i == e) {
				return elements[i];
			}
		}
		return -1;
	}

	public int indexOf(int e) {
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}

	public int removeElementAtIndex(int index) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println(
					"Throwing IndexOutOfBoundsException when trying to" + " remove element at position " + index);
			return -1;
		}

		int removedElement = this.elements[index];
		for (int i = index; i < this.size; i++) {
			this.elements[i] = this.elements[i + 1];
		}
		this.size--;

		return removedElement;
	}

	public void clear() {
		this.size = 0;
	}

	public int set(int index, int e) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to set" + " the element " + e
					+ " at position " + index);
			return -1;
		}

		int replacedElement = this.elements[index];
		this.elements[index] = e;
		return replacedElement;
	}

	public int getElements(int[] elements, int index) {
		for (int i = 0; i < elements.length; i++) {
			if (i == index) {
				return elements[i];
			}
		}
		return -1;
	}

	public int indexOf(int[] elements, int numar) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == numar) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(int[] elements, int numar) {
		for (int i = elements.length - 1; i >= 0; i--) {
			if (elements[i] == numar) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean remove(int[] elements, int index) {
		for (int i = index; i < elements.length; i++) {
			elements[i] = elements[i + 1];
		}
		return true;
	}
	
	public boolean addAll(int[] elementeAdaugate) {
		int iterator = 0;
		for (int i = elements.length; i < elements.length + elementeAdaugate.length; i++) {
			this.elements = Arrays.copyOf(this.elements, this.size + 1);
				elements[i] = elementeAdaugate[iterator];
				iterator++;
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		int[] numere = { 4, 2, 5, 6, 7, 8, 33 };
		MyIntArrayList MyAl = new MyIntArrayList(10);
		MyAl.setElements(numere);
		MyAl.setSize(numere.length);

		// testare metode

		MyAl.add(81);
		for (int i = 0; i < MyAl.elements.length - (MyAl.elements.length - numere.length-1); i++) {
			System.out.print(MyAl.elements[i] + ", ");
		}

		System.out.println();
		MyAl.add(0, 18);
		for (int i = 0; i < MyAl.elements.length; i++) {
			System.out.print(MyAl.elements[i] + ", ");
		}
		
		System.out.println();
		System.out.println(MyAl.contains(24));
		System.out.println(MyAl.contains(4));
		
		System.out.println();
		System.out.println(MyAl.get(5));
		System.out.println(MyAl.get(18));
		
		System.out.println();
		System.out.println(MyAl.indexOf(18));
		System.out.println(MyAl.indexOf(55));
		
		System.out.println();
		System.out.println(MyAl.removeElementAtIndex(0));
		MyAl.removeElementAtIndex(17);
		for (int i = 0; i < MyAl.elements.length; i++) {
			System.out.print(MyAl.elements[i] + ", ");
		}
		
		System.out.println();
		int[] elementeAdaugate = {4, 6, 3, 554, 66};
		//System.out.println(MyAl.addAll(elementeAdaugate));
		
		
	}

}