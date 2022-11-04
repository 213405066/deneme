package örenekler;
import java.util.Scanner;
public class örnek1 {

	public static void main(String[] args) {
		Scanner girdi=new Scanner (System.in);
		System.out.println("Sınav sanuçlarını giriniz,girilen sonuçların ortalamasının hesaplanabilmesi için negatif bir sayı giriniz");
		int sayi=girdi.nextInt();
		int toplam=0;
		int adet=0;
		
		
		while(sayi>=0)
		{
			toplam+=sayi;
			adet++;
			
			System.out.println("Sınav sanuçlarını giriniz,girilen sonuçların ortalamasının hesaplanabilmesi için negatif bir sayı giriniz");
			sayi=girdi.nextInt();
		}
		
		double ortalama=(double)toplam/adet;
		System.out.println("girdiginiz"+adet+"sayının ortalması ="+ortalama);
		
		
		}
		

	}


