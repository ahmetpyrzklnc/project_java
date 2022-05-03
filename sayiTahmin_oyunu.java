package java_demo;

import java.util.Random;
import java.util.Scanner;

public class sayiTahmin_oyunu {

	public static void main(String[] args) {
		
		//sayý tahmin oyunu
		
		System.out.println("Sayý Tahmin Oyununa Hoþ Geldiniz.");
		
		int user, comp, sayac;
		
		Random random = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 1-100 arasý sayý giriniz: ");
		
		user = scan.nextInt();
		
		comp = random.nextInt(100);
		
		sayac = 0;
		
		while(sayac != user) {
			
			if(sayac == 10) {
				System.out.println("Hakkýnýz bitmiþtir.");
				break;
			}
			
			if(comp > user) {
				System.out.println("Yukarý!");
				
				System.out.println("Sayý giriniz: ");
				
				user = scan.nextInt();	
	
			}
			
			else {
				System.out.println("Aþaðý!");
				
				System.out.println("Sayý giriniz: ");
				
				user = scan.nextInt();
			}
		}
		if(sayac < 10) {
			System.out.println("Tebrikler "+sayac+" denemede bildiniz!");
		}

	}

}
