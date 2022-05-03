package java_demo;

import java.util.Random;
import java.util.Scanner;

public class java_tas_kagit_makas {

	public static void main(String[] args) {
		
		// taþ kaðýt makas oyunu
		
		// bu oyun bilgisayar ile oynanýr 
		// bilgisayar 1 ile 3 arasýnda rastgele sayý tutar.
		
		
		
		// 1. taþ
		//2. kaðýt 
		//3. makas
		
		int user, comp;
		
		// bilgisayara 1 ile 3 aralýðýnda rastgele sayý tutturalým
		Random random = new Random();
		
		comp = random.nextInt(3)+1;
		System.out.println("1: Taþ");
		System.out.println("2: Kaðýt");
		System.out.println("3: Makas");
		System.out.println("Lütfen bir seçim yapýnýz: ");
		
		Scanner scan = new Scanner(System.in);
		user = scan.nextInt();
		
		// Kullanýcý tanýmsýz sayý girince program sonlansýn.
		
		if(user != 1 && user != 2 && user != 3) {
			System.out.println("Yanlýþ seçim yaptýnýz.");
		}
		else {
			
			
			// comp: 1 user: 1 -- berabere
			// comp: 1 user: 2 -- user kazandý
			// comp: 1 user: 3 -- bilgisayar kazandý
			
			
			// comp: 2 user: 1 -- bilgisayar kazandý
			// comp: 2 user: 2 -- berabere
			// comp: 2 user: 3 -- user kazandý
			
			// comp: 3 user: 1 -- user kazandý
			// comp: 3 user: 2 -- bilgisayar kazandý
			// comp: 3 user: 3 -- berabere
			
			
			if(comp == 1 && user == 1) {
				System.out.println("Berabere kaldýk.");
			}
			if(comp == 1 && user == 2) {
				System.out.println("Tebrikler siz kazandýnýz.");
			}
			if(comp == 1 && user == 3) {
				System.out.println("Ben kazandým.");
			}
			if(comp == 2 && user == 1) {
				System.out.println("Ben kazandým.");
			}
			if(comp == 2 && user == 2) {
				System.out.println("Berabere kaldýk.");
			}
			if(comp == 2 && user == 3) {
				System.out.println("Tebrikler siz kazandýnýz.");
			}
			if(comp == 3 && user == 1) {
				System.out.println("Tebrikler siz kazandýnýz.");
			}
			if(comp == 3 && user == 2) {
				System.out.println("Ben kazandým.");
			}
			if(comp == 3 && user == 3) {
				System.out.println("Berabere kaldýk.");
			}
			
			   // bilgisayarýn tuttuðu sayýyý en son konsola bastýrmak için:
			
			System.out.println("Benim tuttuðum sayý ise: "+comp);
		}

	}

}
