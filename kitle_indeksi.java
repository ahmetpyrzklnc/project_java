package java_demo;

import java.util.Scanner;

public class kitle_indeksi {

	public static void main(String[] args) {
		
		// kullanıcının boyunu metre cinsinden ve
		// agırlıgını kilogram cinsinden almamız gerekir.
		
		
		double boy,kilo;
		Scanner scan = new Scanner(System.in);
		
		//boy alma
		
		System.out.println("Lütfen boyunuzu cm cinsinden giriniz: ");
		
		boy = scan.nextDouble();
		
		//ağırlık alma
		
		System.out.println("Lütfen ağırlığınızı kg cinsinden giriniz: ");
		
		kilo = scan.nextDouble();
		
		boy = boy/100;
		
		double indeks;
		
		indeks = kilo / (boy*boy);
		
		System.out.println("Vücut kitle endeksiniz: " + indeks);
		
		if(indeks<=18.5) {
			System.out.println("Zayıfsınız.");
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
