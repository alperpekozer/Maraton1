package Soru2;

import java.util.Scanner;

public class TekrarSayi {

	public static void main(String[] args) {

		System.out.println("Kac adet sayi gireceksiniz :");
		Scanner scan = new Scanner (System.in);
		int Length = scan.nextInt();
		int Dizi [] = new int [Length];
		System.out.println("Sayilari Giriniz : ");
		 for (int a = 0; a < Length; a++) {
			 Dizi[a] = scan.nextInt();
			
		 }
	
			int  i = 1;
			 int   sayac = 1;
			   
 int tekrarlanan_sayi = 0;
 int tekrar_sayisi = 0;
			    
 while (i < Length)
			    {
			        if(Dizi[i] == Dizi[i - 1])
			        {
			             sayac++;
			             if(sayac > tekrar_sayisi)
			             {
			                   tekrar_sayisi = sayac;
			                   tekrarlanan_sayi = Dizi[i];
			             }  
			        }
			        else{
			            sayac = 1;
			           
			        }
			        i++;
			    }
if (sayac>1) {
	System.out.println(tekrarlanan_sayi+" sayisi "+tekrar_sayisi+" kez tekrar ediyor");
}

		 if (sayac ==1) {
			 System.out.println("Tekrar eden sayi bulunamamistir");
		 }
			
			}
			}
	
		
		
	
		 
		
		
		
	



