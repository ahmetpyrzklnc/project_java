package java_demo;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
		
		// temel taksimetre uygulamas�
		
		// �ncelikle bir a��l�� �cretiyle ba�lamam�z laz�m
		
		// sonras�nda ise her km ba��na belirli bir �cret
		// yaparak bunun sonucunu kullan�c�ya bilgilendirmemiz gerekir
		
		
		
		int baslangic = 10; // a��l�� �creti
		
		int km; // gidilecek kilometre
		
		double toplamUcret; // en son hesap
		
		int kmbasiucret = 7; // kilometre ba��na �cret
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Gidilen toplam kilometreyi giriniz: ");
		
		
		
		km = scan.nextInt();
		
		toplamUcret = baslangic+(kmbasiucret*km);
		
		System.out.println("---------");
		
		System.out.println("�denecek toplam �cret: "+toplamUcret);
		
		

	}

}
