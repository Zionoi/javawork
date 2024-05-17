package _06_ex;

import java.util.Scanner;

public class Math {
	Scanner sc = new Scanner(System.in);
	
	
	int max(int[] arrA) {
		int num1=arrA[0];
		for(int i=0; i<arrA.length; i++) {
			if(arrA[i]> num1) {
				num1 = arrA[i];
			}
		}
		return num1;
	}
	int min(int[] arrA) {
		int num1=arrA[0];
		for(int i=0; i<arrA.length; i++) {
			if(num1> arrA[i]) {
				num1 = arrA[i];
			}
		}
		return num1;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {8,0,8,9,55,33,7,6,-5,-80,-65,-10,0};
		Math m1 = new Math();
		
		System.out.println(m1.max(arr));
		System.out.println(m1.min(arr));
		Math m2 = new Math();
		
		int[] arr2 = {1,2,3,5};
		System.out.println(m2.max(arr2));
		
	}

}
