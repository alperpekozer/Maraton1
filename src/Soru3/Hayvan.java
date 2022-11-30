package Soru3;

public class Hayvan {

	String ad;
	int kilo;
	int uzunluk;
	boolean TehlikeliMi;
	
	public Hayvan(String ad,int kilo,int uzunluk,boolean TehlikeliMi)
	{
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
		this.TehlikeliMi = TehlikeliMi;
	}
	public void EkranaYaz()
	{
	System.out.println("Hayvanin adi :"+ad+"kilosu : "+kilo+"Uzunlugu :"+uzunluk+"Tehlikeli mi ?"+TehlikeliMi);	
	}
	
	
	
}
