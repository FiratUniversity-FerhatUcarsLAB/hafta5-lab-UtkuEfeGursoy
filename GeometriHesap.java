/*
 * Ad Soyad: Utku Efe Gürsoy
 * Ogrenci No: 250542005
 * Tarih: 09.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {
    
    
    //ALAN HESAPLAMA METOTLARI
    public static double KAlanHesaplama(double kenar){
        return kenar*kenar;
    }//Kare alan hesaplama metodu sonu

    public static double DkAlanHesaplama(double kisaKenar,double uzunKenar){
        return kisaKenar*uzunKenar;
    }//Dikdörtgen alan hesaplama metodu sonu

    public static double DaAlanHesaplama(double yaricap){
        return Math.PI*yaricap*yaricap;
    }//Daire alan hesaplama metodu sonu

    public static double UAlanHesaplama(double taban,double yukseklik){
        return (taban/yukseklik)/2;
    }//Üçgen alan hesaplama metodu sonu


    //ÇEVRE HESAPLAMA METOTLARI
    public static double KCevrHesaplama(double kenar){
        return 4*kenar;
    }//Kare çevre hesaplama metodu sonu

    public static double DkCevreHesaplama(double kisaKenar,double uzunKenar){
        return 2*(kisaKenar*uzunKenar);
    }//Dikdörtgen çevre hesaplama metodu sonu

    public static double DaCevreHesaplama(double yaricap){
        return 2*Math.PI*yaricap;
    }//Daire çevre hesaplama metodu sonu
    public static double UCevreHesaplama(double kenar1,double kenar2,double kenar3){
        return kenar1+kenar2+kenar3;
    }//Üçgen çevre hesaplama metodu sonu




    public static void main(String[] args){
       
        Scanner input=new Scanner(System.in);
       
        //Kenarları Kullanıcıdan Alma
        System.out.println("-----------GEOMETRİ HESAPLAMA PROGRAMI-------------");
       
       //Karenin Bir Kenarının Ölçüsünü Alan Kısım
        System.out.print("Karenin Bir Kenarını Giriniz:");
        double Karekenar=input.nextDouble();

        //Dikdörtgenin Kenarlarını Alan Kısım
        System.out.print("\nDikdörtgenin Kısa Kenarını Giriniz:");
        double DikdortgenKisaKenar=input.nextDouble();
        System.out.print("Dikdörtgenin Uzun Kenarını Giriniz:");
        double DikdortgenUzunKenar=input.nextDouble();

        //Dairenin Yarıçapını Alan Kısım
        System.out.print("\nDairenin Yarıçapını Giriniz:");
        double Daireyaricap=input.nextDouble();

        //Üçgenin Taban ve Yüksekliğini Alan Kısım
        System.out.print("\nÜçgenin Tabanını Giriniz:");
        double UcgenTaban=input.nextDouble();
        System.out.print("Üçgenin Yüksekliğini Giriniz:");
        double UcgenYukseklik=input.nextDouble();
        //Üçgenin Kenarlarını Alan Kısım
        System.out.print("Üçgenin 1. Kenarını Giriniz:");
        double UcgenKenar1=input.nextDouble();
        System.out.print("Üçgenin 2. Kenarını Giriniz:");
        double UcgenKenar2=input.nextDouble();
        System.out.print("Üçgenin 3. Kenarını Giriniz:");
        double UcgenKenar3=input.nextDouble();

        System.out.println("-----------HESAPLAMA SONUÇLARI-------------");
        //Kareyi yazdıran kısım
        System.out.println("---KARE---");
        System.out.printf("Karenin Alanı("+Karekenar+"):"+"%.2f\n",KAlanHesaplama(Karekenar));
        System.out.printf("Karenin Çevresi("+Karekenar+"):"+"%.2f\n",KCevrHesaplama(Karekenar));
        System.out.print("\n\n\n");
        //Dikdörtgeni yazdıran Kısım
        System.out.println("---DİKDÖRTGEN---");
        System.out.printf("Dikdörgenin Alanı("+DikdortgenKisaKenar+","+DikdortgenUzunKenar+"):"+"%.2f\n",DkAlanHesaplama(DikdortgenKisaKenar, DikdortgenUzunKenar));
        System.out.printf("Dikdörtgenin Çevresi("+DikdortgenKisaKenar+","+DikdortgenUzunKenar+"):"+"%.2f\n",DkCevreHesaplama(DikdortgenKisaKenar, DikdortgenUzunKenar));
        System.out.print("\n\n\n");
        //Daireyi Yazdıran Ksım
        System.out.println("---DAİRE---");
        System.out.printf("Dairenin Alanı("+Daireyaricap+"):"+"%.2f\n",DaAlanHesaplama(Daireyaricap));
        System.out.printf("Dairenin Çevresi("+Daireyaricap+"):"+"%.2f\n",DaCevreHesaplama(Daireyaricap));
        System.out.print("\n\n\n");
        //Üçgeni Yazdıran Kısım
        System.out.println("---ÜÇGEN---");
        System.out.printf("Üçgenin Alanı("+UcgenTaban+","+UcgenYukseklik+"):"+"%.2f\n",UAlanHesaplama(UcgenTaban, UcgenYukseklik));
        System.out.printf("Üçgenin Çevresi("+UcgenKenar1+","+UcgenKenar2+","+UcgenKenar3+"):"+"%.2f\n",UCevreHesaplama(UcgenKenar1, UcgenKenar2, UcgenKenar3));
        
        input.close();

    }//main
}

