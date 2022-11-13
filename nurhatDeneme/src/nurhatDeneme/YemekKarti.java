package nurhatDeneme;

import java.util.Scanner;

public class YemekKarti {
String hesapAdi;
int hesapNo;
float miktar;
String cikisYap="Çikis Yapiliyor...";
String ustMenu="Bir ust menuye gidiliyor...";
int password;
void musteriEkle (int hesapNo, String hesapAdı, float miktar, String cikisYap, String ustMenu, int password) {
	this.hesapAdi=hesapAdı;
	this.hesapNo=hesapNo;
	this.miktar=miktar;
	this.cikisYap=cikisYap;
	this.ustMenu=ustMenu;
	this.password=password;
	
}
void ParaYatırma() {
	int neKadar;
	System.out.println("Ne kadar para yatirmak istediginizi giriniz. ");
	Scanner scanner = new Scanner(System.in);
	neKadar=scanner.nextInt();
	miktar+=neKadar;
	System.out.println("Paraniz Basariyla yatirildi hesap bakiyeniz: "+ miktar);
	anaSayfa();
}
void göstemek() {
	System.out.println("Hesap Adi: "+ hesapAdi+ "\n"+
						"Hesap Numarasi: "+hesapNo+ "\n"+
						"Bakiye: "+ miktar);
	
	anaSayfa();
}

void anaSayfa() {
	Scanner scanner = new Scanner(System.in);
	int secilen;
	System.out.println("Yapmak istediginiz islemi seciniz."+"\n"+
						"--------------------------------------"+"\n"+
						"Para Yatirmak icin 1'e basiniz."+"\n"+
						"Alisveris yapmak icin 2'ye Basiniz."+"\n"+
						"Hesap Bilgilerini gormek icin 3'e Basiniz.");
	secilen=scanner.nextInt();
	if(secilen==1) {
		ParaYatırma();
	}else if(secilen==2) {
		alısVeris();
	}
	else if(secilen == 3) {
		göstemek();
	}else{
		System.out.println("Yanlis Deger Girildi lutfen tekrar deneyiniz.");
		anaSayfa();
		
	}
	
}
void alısVeris() {
	Scanner scanner = new Scanner(System.in);
	int deger;
	System.out.println("istediginiz kategoriyi seciniz."+"\n"+
					   "-----------------------------------"+"\n"+
						"Icecekler icin 1'e basiniz.."+"\n"+
					    "Atistirmaliklar icin 2'ye basiniz."+ "\n"+
						"Bir ust menuye donmek icin 3'e Basiniz"+"\n"+
					    "Cikis yapmak icin 4'e basiniz...");
   deger=scanner.nextInt();
   
   if(deger==1) {
	   icecek();
	   
   }else if(deger==2) {
	   atıstırma();
   }else if(deger==3) {
	   System.out.println(ustMenu);
	   anaSayfa();
   }else if(deger==4) {
	   System.out.println(cikisYap);
   }
}
void icecek() {
	Scanner scanner = new Scanner(System.in);
	int icecekSec;
	int kolaAdetSec;
	int cayAdetSec;
	int suAdetSec;
	int sodaAdetSec;
	System.out.println("İstediginiz icecegi numarala olarak seciniz."+"\n"+
					   "-----------------------------------"+"\n"+
					   "1-)kola->20TL"+"\n"+
					   "2-)kaçak Çay->5TL"+"\n"+
					   "3-)Su->3TL"+"\n"+
					   "4-)Soda->5TL"+"\n"+
					   "5-)Bir üst menüye git"+"\n"+
					   "6-)Çıkış Yap.");
	icecekSec=scanner.nextInt();
	if(icecekSec==1) {
		System.out.println("Lutfen adedini giriniz: "+"\n"+
						   "------------------------------"+"\n"+
						   "1-)1 adet"+"\n"+
						   "2-)2 adet"+"\n"+
						   "3-)3 adet"+"\n"+
						   "4-)4 adet"+"\n"+
						   "5-)5 adet"+"\n"+
						   "6-) Bir üst menüye dön"+"\n"+
						   "7-)Çıkış Yap...");
		kolaAdetSec = scanner.nextInt();
		if(kolaAdetSec==1 && miktar>=20) {
			miktar=miktar-20;
			System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
		}else if(kolaAdetSec==2 && miktar >=40) {
			miktar=miktar-40;
			System.out.println("Satın Alınma Basarılı. Guncel Bakiyeniz: "+ miktar);
		}else if(kolaAdetSec==3 && miktar >= 60) {
			miktar=miktar-60;
			System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
		}else if(kolaAdetSec==4 && miktar >= 80) {
			miktar=miktar-80;
			System.out.println("Satin Alinma Basarili. Güncel Bakiyeniz: "+ miktar);
		}else if(kolaAdetSec==5 && miktar >= 100) {
			miktar=miktar-100;
			System.out.println("Satin Alinma Basarili. Güncel Bakiyeniz: "+ miktar);
		}else if(kolaAdetSec==6) {
			System.out.println(ustMenu);
			icecek();
		}else if(kolaAdetSec==7) {
			System.out.println(cikisYap);
			
		}else {
			System.out.println("yanlıs deger girildi yada paraniz yok");
		}
		
	}else if(icecekSec==2) {
		System.out.println("Lütfen adedini giriniz: "+"\n"+
				   "------------------------------"+"\n"+
				   "1-)1 adet"+"\n"+
				   "2-)2 adet"+"\n"+
				   "3-)3 adet"+"\n"+
				   "4-)4 adet"+"\n"+
				   "5-)5 adet"+"\n"+
				   "6-) Bir ust menüye dön"+"\n"+
				   "7-)Çıkış Yap...");
cayAdetSec = scanner.nextInt();
if(cayAdetSec==1 && miktar>=5) {
	miktar=miktar-5;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(cayAdetSec==2 && miktar >=10) {
	miktar=miktar-10;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(cayAdetSec==3 && miktar >= 15) {
	miktar=miktar-15;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(cayAdetSec==4 && miktar >= 20) {
	miktar=miktar-20;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(cayAdetSec==5 && miktar >= 25) {
	miktar=miktar-25;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(cayAdetSec==6) {
	System.out.println(ustMenu);
	icecek();
}else if(cayAdetSec==7) {
	System.out.println(cikisYap);
	
}else {
	System.out.println("yanlıs deger girildi yada paraniz yok");
}
	}else if(icecekSec==3) {
		System.out.println("Lütfen adedini giriniz: "+"\n"+
				   "------------------------------"+"\n"+
				   "1-)1 adet"+"\n"+
				   "2-)2 adet"+"\n"+
				   "3-)3 adet"+"\n"+
				   "4-)4 adet"+"\n"+
				   "5-)5 adet"+"\n"+
				   "6-) Bir üst menüye dön"+"\n"+
				   "7-)Çıkış Yap...");
suAdetSec = scanner.nextInt();
if(suAdetSec==1 && miktar>=3) {
	miktar=miktar-3;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(suAdetSec==2 && miktar >=6) {
	miktar=miktar-6;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(suAdetSec==3 && miktar >= 9) {
	miktar=miktar-9;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(suAdetSec==4 && miktar >= 12) {
	miktar=miktar-12;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(suAdetSec==5 && miktar >= 15) {
	miktar=miktar-15;
	System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(suAdetSec==6) {
	System.out.println(ustMenu);
	icecek();
}else if(suAdetSec==7) {
	System.out.println(cikisYap);
	
}
	}else if(icecekSec==4) {
		System.out.println("Lütfen adedini giriniz: "+"\n"+
				   "------------------------------"+"\n"+
				   "1-)1 adet"+"\n"+
				   "2-)2 adet"+"\n"+
				   "3-)3 adet"+"\n"+
				   "4-)4 adet"+"\n"+
				   "5-)5 adet"+"\n"+
				   "6-) Bir üst menüye dön"+"\n"+
				   "7-)Çıkış Yap...");
sodaAdetSec = scanner.nextInt();
if(sodaAdetSec==1 && miktar>=5) {
	miktar=miktar-5;
	System.out.println("Satın Alınma Başarılı. Güncel Bakiyeniz: "+ miktar);
}else if(sodaAdetSec==2 && miktar >=10) {
	miktar=miktar-10;
	System.out.println("Satın Alınma Başarılı. Güncel Bakiyeniz: "+ miktar);
}else if(sodaAdetSec==3 && miktar >= 15) {
	miktar=miktar-15;
	System.out.println("Satın Alınma Başarılı. Güncel Bakiyeniz: "+ miktar);
}else if(sodaAdetSec==4 && miktar >= 20) {
	miktar=miktar-20;
	System.out.println("Satın Alınma Başarılı. Güncel Bakiyeniz: "+ miktar);
}else if(sodaAdetSec==5 && miktar >= 25) {
	miktar=miktar-25;
	System.out.println("Satın Alınma Başarılı. Güncel Bakiyeniz: "+ miktar);
}else if(sodaAdetSec==6) {
	System.out.println(ustMenu);
	icecek();
}else if(sodaAdetSec==7) {
	System.out.println(cikisYap);
	
}else {
	System.out.println("yanlıs deger girildi yada paraniz yok");
}
		
	}else if(icecekSec==5){
		System.out.println(ustMenu);
		alısVeris();
	}else if(icecekSec==6) {
		System.out.println(cikisYap);
	}
}
void atıstırma() {
	int yemekSec;
	int pogacaAdetSec;
	int simitAdetSec;
	int tostAdetSec;
	Scanner scanner =new Scanner(System.in);
	System.out.println("Istedıgınız atıstırmalıgı numarala olarak secınız.".toUpperCase()+"\n"+
			   "-----------------------------------"+"\n"+
			   "1-)pogaca->10TL"+"\n"+
			   "2-)Simit->10TL"+"\n"+
			   "3-)Tost->20TL"+"\n"+
			   "4-)Bir ust menuye git"+"\n"+
			   "5-)cikis Yap.");
yemekSec=scanner.nextInt();

if(yemekSec==1) {
	System.out.println("Lutfen adedini giriniz: "+"\n"+
			   "------------------------------"+"\n"+
			   "1-)1 adet"+"\n"+
			   "2-)2 adet"+"\n"+
			   "3-)3 adet"+"\n"+
			   "4-)4 adet"+"\n"+
			   "5-)5 adet"+"\n"+
			   "6-) Bir ust menuye don"+"\n"+
			   "7-)cikis Yap...");
pogacaAdetSec = scanner.nextInt();
if(pogacaAdetSec==1 && miktar>=10) {
miktar=miktar-10;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(pogacaAdetSec==2 && miktar >=20) {
miktar=miktar-20;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(pogacaAdetSec==3 && miktar >= 30) {
miktar=miktar-30;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(pogacaAdetSec==4 && miktar >= 40) {
miktar=miktar-40;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(pogacaAdetSec==5 && miktar >= 50) {
miktar=miktar-50;
System.out.println("\"Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(pogacaAdetSec==6) {
	System.out.println(ustMenu);
atıstırma();
}else if(pogacaAdetSec==7) {
System.out.println(cikisYap);

}else {
	System.out.println("yanlıs deger girildi yada paraniz yok");
}
}

else if(yemekSec==2) {
	System.out.println("Lutfen adedini giriniz: "+"\n"+
			   "------------------------------"+"\n"+
			   "1-)1 adet"+"\n"+
			   "2-)2 adet"+"\n"+
			   "3-)3 adet"+"\n"+
			   "4-)4 adet"+"\n"+
			   "5-)5 adet"+"\n"+
			   "6-) Bir ust menuye don"+"\n"+
			   "7-)cikis Yap...");
simitAdetSec = scanner.nextInt();
if(simitAdetSec==1 && miktar>=10) {
miktar=miktar-10;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(simitAdetSec==2 && miktar >=20) {
miktar=miktar-20;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(simitAdetSec==3 && miktar >= 30) {
miktar=miktar-30;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(simitAdetSec==4 && miktar >= 40) {
miktar=miktar-40;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(simitAdetSec==5 && miktar >= 50) {
miktar=miktar-50;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(simitAdetSec==6) {
	System.out.println(ustMenu);
atıstırma();
}else if(simitAdetSec==7) {
System.out.println(cikisYap);
	
}else {
	System.out.println("yanlıs deger girildi yada paraniz yok");
}
}

else if(yemekSec==3) {
	System.out.println("Lütfen adedini giriniz: "+"\n"+
			   "------------------------------"+"\n"+
			   "1-)1 adet"+"\n"+
			   "2-)2 adet"+"\n"+
			   "3-)3 adet"+"\n"+
			   "4-)4 adet"+"\n"+
			   "5-)5 adet"+"\n"+
			   "6-) Bir üst menüye dön"+"\n"+
			   "7-)Çıkış Yap...");
tostAdetSec = scanner.nextInt();
if(tostAdetSec==1 && miktar>=20) {
miktar=miktar-20;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(tostAdetSec==2 && miktar >=40) {
miktar=miktar-40;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(tostAdetSec==3 && miktar >= 60) {
miktar=miktar-60;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(tostAdetSec==4 && miktar >= 80) {
miktar=miktar-80;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(tostAdetSec==5 && miktar >= 100) {
miktar=miktar-100;
System.out.println("Satin Alinma Basarili. Guncel Bakiyeniz: "+ miktar);
}else if(tostAdetSec==6) {
	System.out.println(ustMenu);
atıstırma();
}else if(tostAdetSec==7) {
System.out.println(cikisYap);
}else {
	System.out.println("yanlıs deger girildi yada paraniz yok");
}
	
}
else if(yemekSec==4) {
	System.out.println(ustMenu);
	alısVeris();
}
else if(yemekSec==5) {
	System.out.println(cikisYap);
}else {
	System.out.println("Yanlis deger girildi...");
	atıstırma();
}
}
void girisEkranı() {
	Scanner scanner = new Scanner(System.in);
	int girisDegeri;
	System.out.println("Midyat Myo Cafeye Hosgeldiniz..."+"\n"+
					   "Lutfen yapmak istediginiz islemi seciniz.");
	System.out.println("---------------------------------");
	System.out.println("uye olmak icin lutfen 1'e basiniz."+"\n"+
					   "Giris yapmak icin lutfen 2'ye basiniz.");
	girisDegeri=scanner.nextInt();
	if(girisDegeri==1) {
		uyeOl();
	}else if(girisDegeri==2) {
		girisYap();
	}else {
		System.out.println("Yanlis deger girildi...");
		girisEkranı();
	}
	
}
void uyeOl() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("uye ekranina hosgeldiniz."+"\n"+
					   "--------------------------------"+"\n"+
					   	"Hesap adi:");
						hesapAdi=scanner.nextLine();
	System.out.println("Kartinizin Son 4 hanesini giriniz: ");
	hesapNo=scanner.nextInt();
	System.out.println("sifreyi giriniz: ");
	password=scanner.nextInt();
	
	if(hesapAdi==null||hesapNo<=0||password<=0) {
		System.out.println("BASARISIZ GIRİŞ LUTFEN ALANLARI EKSIKSIZ DOLDURUNUZ.");
		uyeOl();
	}else {
		System.out.println("GIRIS BASARILI! GIRIŞ EKRANINA YONLENDIRILIYOR...");
		girisYap();
		
	}
}
void girisYap() {
	int girisHesap;
	int hesapSifre;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Giris Yap ekranina hosgeldiniz...");
	System.out.println("-----------------------------------");
	System.out.println("Hesap No: ");
	girisHesap=scanner.nextInt();
	
	System.out.println("sifrenizi giriniz: ");
	hesapSifre=scanner.nextInt();
	
	if(girisHesap==hesapNo&&hesapSifre==password) {
		anaSayfa();
	}else {
		System.out.println("Hesap ismi veya sifre yanlıs...");
		girisYap();
	}
}

public static void main(String[] args) {
	YemekKarti m1 = new YemekKarti();
	m1.girisEkranı();
	
}
}



