package java_demo;

import java.util.Random;
import java.util.Scanner;

public class java_tas_kagit_makas {

	public static void main(String[] args) {
		
		// ta� ka��t makas oyunu
		
		// bu oyun bilgisayar ile oynan�r 
		// bilgisayar 1 ile 3 aras�nda rastgele say� tutar.
		
		
		
		// 1. ta�
		//2. ka��t 
		//3. makas
		
		int user, comp;
		
		// bilgisayara 1 ile 3 aral���nda rastgele say� tuttural�m
		Random random = new Random();
		
		comp = random.nextInt(3)+1;
		System.out.println("1: Ta�");
		System.out.println("2: Ka��t");
		System.out.println("3: Makas");
		System.out.println("L�tfen bir se�im yap�n�z: ");
		
		Scanner scan = new Scanner(System.in);
		user = scan.nextInt();
		
		// Kullan�c� tan�ms�z say� girince program sonlans�n.
		
		if(user != 1 && user != 2 && user != 3) {
			System.out.println("Yanl�� se�im yapt�n�z.");
		}
		else {
			
			
			// comp: 1 user: 1 -- berabere
			// comp: 1 user: 2 -- user kazand�
			// comp: 1 user: 3 -- bilgisayar kazand�
			
			
			// comp: 2 user: 1 -- bilgisayar kazand�
			// comp: 2 user: 2 -- berabere
			// comp: 2 user: 3 -- user kazand�
			
			// comp: 3 user: 1 -- user kazand�
			// comp: 3 user: 2 -- bilgisayar kazand�
			// comp: 3 user: 3 -- berabere
			
			
			if(comp == 1 && user == 1) {
				System.out.println("Berabere kald�k.");
			}
			if(comp == 1 && user == 2) {
				System.out.println("Tebrikler siz kazand�n�z.");
			}
			if(comp == 1 && user == 3) {
				System.out.println("Ben kazand�m.");
			}
			if(comp == 2 && user == 1) {
				System.out.println("Ben kazand�m.");
			}
			if(comp == 2 && user == 2) {
				System.out.println("Berabere kald�k.");
			}
			if(comp == 2 && user == 3) {
				System.out.println("Tebrikler siz kazand�n�z.");
			}
			if(comp == 3 && user == 1) {
				System.out.println("Tebrikler siz kazand�n�z.");
			}
			if(comp == 3 && user == 2) {
				System.out.println("Ben kazand�m.");
			}
			if(comp == 3 && user == 3) {
				System.out.println("Berabere kald�k.");
			}
			
			   // bilgisayar�n tuttu�u say�y� en son konsola bast�rmak i�in:
			
			System.out.println("Benim tuttu�um say� ise: "+comp);
		}

	}

}
