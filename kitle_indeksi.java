package java_demo;

import java.util.Scanner;

public class kitle_indeksi {

	public static void main(String[] args) {
		
		// kullanýcýnýn boyunu metre cinsinden ve
		// aðýrlýðý kilogram cinsinden almamýz gerekir.
		
		
		double boy,kilo;
		Scanner scan = new Scanner(System.in);
		
		//boy alma
		
		System.out.println("Lütfen boyunuzu cm cinsinden giriniz: ");
		
		boy = scan.nextDouble();
		
		//aðýrlýk alma
		
		System.out.println("Lütfen aðýrlýðýnýzý kg cinsinden giriniz: ");
		
		kilo = scan.nextDouble();
		
		boy = boy/100;
		
		double indeks;
		
		indeks = kilo / (boy*boy);
		
		System.out.println("Vücut kitle endeksiniz: " + indeks);
		
		if(indeks<=18.5) {
			System.out.println("Zayýfsýnýz.");
		}
		else if(indeks>18.5 && indeks<=24.9) {
			System.out.println("Normal kilolusunuz.");
		}
		else if(indeks<=25 && indeks<=24.9) {
			System.out.println("Kilolusunuz");
		}
		else if(indeks<=30 && indeks<=34.9) {
			System.out.println("Obezsiniz.");
		}
		else if(indeks>35) {
			System.out.println("Mobrid Obezsiniz!");
		}
		
	
	
	}

}
