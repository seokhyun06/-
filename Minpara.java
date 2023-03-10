package sungil2023_03_08;

public class Minpara {
	
	static int Minpara(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		return min;
	}
	public static void main(String[] args) {

		System.out.println("Minpara(12,5,17) : " + Minpara(12,5,17));
		System.out.println("Minpara(18,34,26) : " + Minpara(18,34,26));
		
	}

}
