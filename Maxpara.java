package sungil2023_03_08;

public class Maxpara {

	static int Maxpara(int a, int b, int c) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
			
			return max;
	}
	public static void main(String[] args) {
		
		System.out.println("Maxpara(15,24,19) : " + Maxpara(15,24,19));
		System.out.println("Maxpara(5,26,9) : " + Maxpara(5,26,9));
	}

}
