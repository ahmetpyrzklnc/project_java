package java_demo;

import java.util.Random;
import java.util.Scanner;

public class sayiTahmin_oyunu {

	public static void main(String[] args) {
		
		//say� tahmin oyunu
		
		System.out.println("Say� Tahmin Oyununa Ho� Geldiniz.");
		
		int user, comp, sayac;
		
		Random random = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen 1-100 aras� say� giriniz: ");
		
		user = scan.nextInt();
		
		comp = random.nextInt(100);
		
		sayac = 0;
		
		while(sayac != user) {
			
			if(sayac == 10) {
				System.out.println("Hakk�n�z bitmi�tir.");
				break;
			}
			
			if(comp > user) {
				System.out.println("Yukar�!");
				
				System.out.println("Say� giriniz: ");
				
				user = scan.nextInt();	
	
			}
			
			else {
				System.out.println("A�a��!");
				
				System.out.println("Say� giriniz: ");
				
				user = scan.nextInt();
			}
		}
		if(sayac < 10) {
			System.out.println("Tebrikler "+sayac+" denemede bildiniz!");
		}

	}

}
