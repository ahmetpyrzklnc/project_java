package java_demo;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
		
		// temel taksimetre uygulamasý
		
		// öncelikle bir açýlýþ ücretiyle baþlamamýz lazým
		
		// sonrasýnda ise her km baþýna belirli bir ücret
		// yaparak bunun sonucunu kullanýcýya bilgilendirmemiz gerekir
		
		
		
		int baslangic = 10; // açýlýþ ücreti
		
		int km; // gidilecek kilometre
		
		double toplamUcret; // en son hesap
		
		int kmbasiucret = 7; // kilometre baþýna ücret
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Gidilen toplam kilometreyi giriniz: ");
		
		
		
		km = scan.nextInt();
		
		toplamUcret = baslangic+(kmbasiucret*km);
		
		System.out.println("---------");
		
		System.out.println("Ödenecek toplam ücret: "+toplamUcret);
		
		

	}

}
