package Pachet;

import java.util.Scanner;

public class leetcode {
	public static String countAndSay(int n) {
		String x = "1 ";
		char[] xArray = x.toCharArray();
		//int count = 1;
		for (int i = 0; i< x.length()+2; i++) {
			if((xArray[i] == xArray[i+1]) && (xArray[i] == xArray[i+2])) {
				xArray[i] = '3';
				xArray[i+2] ='0';
			}else if(xArray[i] == xArray[i+1]){
				xArray[i] = '2';
			}else {
				xArray[i] = '1';
				xArray[i+2] = xArray[i+1];
			}
		}
		x = xArray.toString();
		return x;
	}	
	public static void main(String[] args) {
		System.out.println("introdu numarul de siruri");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i <= n; i++) {
			System.out.println(countAndSay(i));
		}
		
	}

}
