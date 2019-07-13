package Pachet;

import java.util.Scanner;

public class Exercitii_curs_1 {
	public double parseDouble(String s){
		double res = 0;
		char[] array = s.toCharArray();
		int count = 1;
		int l = s.length();
		boolean beforePoint = true;
		for(int i = l-1; i >= 0; i--) {
			if(array[i] == '.') {
				beforePoint = false;
				continue;
			}
			if (beforePoint) {
				res+=array[i] - '0';
				res = res/10;
			}else {
				res+=(array[i]-'0') *count;
				count = count*10;
			}
		} return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introdu un sir de numere");
		String numere = sc.nextLine(); 
		//int parseInt(String)
		//double parseDouble(String);
		//boolean parseBoolean(String);
	}

}
