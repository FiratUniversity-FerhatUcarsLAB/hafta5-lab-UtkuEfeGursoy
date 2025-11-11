/*
 * Ad Soyad: Utku Efe Gürsoy
 * Ogrenci No: 250542005
 * Tarih: 11.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;
public class FizikFormul {

    //sabit ekleme
    static final double yerCekimi=9.8; //Yerçekimi ivmesi sabiti



    //FİZİK FORMÜLLERİ METOTLARI
    public static double hizHesaplama(double yol,double zaman){
        return yol/zaman;
    }//hız hesaplama metodu sonu

    public static double ivmeHesaplama(double hiz,double zaman){
        return hiz/zaman;
    }//ivme hesaplama metodu sonu

    public static double kuvvetHesaplama(double kutle,double ivme){
        return kutle*ivme;
    }//kuvvet hesaplama metodu sonu
    
    public static double isHesaplama(double kuvvet,double yol){
        return kuvvet*yol;
    }//is hesaplama metodu sonu

    public static double gucHesaplama(double is,double zaman){
        return is/zaman;
    }//güç hesaplama metodu sonu

    public static double kinetikEnerjiHesaplama(double kutle ,double hiz){
        return 0.5*kutle*Math.pow(hiz,2);
    }//kinetik enerji hesaplama metodu sonu

    public static double potansiyelEnerjiHesaplama(double kutle,double yukseklik){
        return kutle*yerCekimi*yukseklik;
    }//potansiyel enerji hesaplama metodu sonu

    public static double momentumHesaplama(double kutle,double hiz){
        return kutle*hiz;
    }//momentum hesaplama metodu sonu

   




    public static void main(String[] args){

    Scanner input = new Scanner(System.in); //Scanner sınıfı nesnesi oluşturma

    //Sabitleri Tanımlama
    

    //Fizik Ana Elemanları hız , yol vb değişkenleri oluşturma
    Double hiz,ivme,kuvvet,is,guc,kinetikEnerji,potansiyelEnerji,momentum;
    //temel fizik hesaplama değerlerini tanımlama
    Double yol,zaman,kutle,yukseklik,hizDegisimi;

    System.out.println("-----------FİZİK FORMÜL HESAPLAMA PROGRAMI-------------");
    System.out.println("TEMEL OLÇÜMLER:");

    //Kullanıcıdan temel fizik değişken değerlerini alma
    System.out.print("Lütfen yol değerini(metre cinsinden) giriniz: ");
    yol=input.nextDouble();
    System.out.print("\nLütfen zaman değerini(saniye cinsinden) giriniz: ");
    zaman=input.nextDouble();
    System.out.print("\n Lütfen kütle değerini(kilogram cinsinden) giriniz: ");
    kutle=input.nextDouble();
    System.out.print("\nLütfen yükseklik değerini(metre cinsinden) giriniz: ");
    yukseklik=input.nextDouble();
    System.out.print("\nLütfen hız değişimi değerini(metre/saniye cinsinden) giriniz: ");
    hizDegisimi=input.nextDouble();

    //Fizik Formüllerini çağırma ve hesaplama
    hiz=hizHesaplama(yol, zaman);
    ivme=ivmeHesaplama(hizDegisimi, zaman);
    kuvvet=kuvvetHesaplama(kutle, ivme);
    is=isHesaplama(kuvvet, yol);
    guc=gucHesaplama(is, zaman);
    kinetikEnerji=kinetikEnerjiHesaplama(kutle, hiz);
    potansiyelEnerji=potansiyelEnerjiHesaplama(kutle, yukseklik);
    momentum=momentumHesaplama(kutle, hiz);

    //Hesaplama Sonuçlarını Ekrana Yazdırma
    System.out.println("---------------------HESAPLAMA SONUÇLARI---------------------");
    System.out.printf("Hız: %.2f m/s\n", hiz);
    System.out.printf("İvme: %.2f m/s²\n", ivme);
    System.out.printf("Kuvvet: %.2f N\n", kuvvet);
    System.out.printf("İş: %.2f J\n", is);
    System.out.printf("Güç: %.2f W\n", guc);
    System.out.printf("Kinetik Enerji: %.2f J\n", kinetikEnerji);
    System.out.printf("Potansiyel Enerji: %.2f J\n", potansiyelEnerji);
    System.out.printf("Momentum: %.2f kg·m/s\n", momentum);
    input.close(); //Scanner kapatma
       
    


    }//main sonu
}
