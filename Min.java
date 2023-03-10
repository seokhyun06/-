package sungil2023_03_08;

import java.util.Scanner;

class Min {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 개의 정수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("다른 한 개의 정수를 입력하시오: ");
		int b = sc.nextInt();
		System.out.print("마지막 정수를 입력하시오: ");
		int c = sc.nextInt();
		
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		System.out.println("셋 중 최소값은: " + min + "입니다.");
		
	}
}
