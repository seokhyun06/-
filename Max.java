package sungil2023_03_08;

import java.util.Scanner;

class Max {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("한 개의 정수를 입력하시오: ");
		int a = stdIn.nextInt();
		System.out.println("다른 한 개의 정수를 입력하시오: ");
		int b = stdIn.nextInt();
		System.out.println("마지막 정수를 입력하시오: ");
		int c = stdIn.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("셋 중 최대값은: " + max + "입니다.");
		
		
	}
	
}
