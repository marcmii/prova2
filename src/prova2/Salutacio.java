package prova2;

import java.util.Scanner;

public class Salutacio {

	public static void main(String[] args) {

		int i=5;
		int aleatori = (int) Math.random()+8;
		
		Scanner in = new Scanner(System.in);
		
		for (int j =1; j<4; j++) {
			System.out.println("Hola món");
		}
		System.out.println(i);
		System.out.println(aleatori);
		System.out.println(aleatori);
		
		in.close();
	}

}
