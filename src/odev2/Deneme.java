/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev2;
/**
 *
 * @author leman
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Deneme {

    public static void main(String[] args) {

        //Adres ve Student sinfinda nesneler olusturuluyor
        Adres adres;
        Student ogrenci;

        Scanner fileIn = null; // fileIn'i bos bir nesneye baslatir

        //dosya okuma zamani karsilasa bilecek hatalar icin try catch blogu kullaniyoruz
        try {

            fileIn = new Scanner(
                    new FileInputStream("girdiQuiz2.txt"));

        } catch (FileNotFoundException e) {

            System.out.println("Dosya bulunamadi.");
            System.exit(0);
        }

        //en yüksek not ortalamasına sahip olan öğrencinin bilgilerini elde icin degiskenler yarattim
        double maxNotOrtalama = 0;
        int maxOgrenciNo = 0;
        String maxIsim = null;
        Adres maxAdres = null;

        System.out.println("OGRENCI BILGILERI: " + "\n");

        //dosya sonu gelene kadar veriler okunuyor
        while (fileIn.hasNext()) {

            int ogrenciNo = fileIn.nextInt();
            String isim = fileIn.next() + " " + fileIn.next();
            double notOrtalama = fileIn.nextDouble();
            String sokak = fileIn.next() + " " + fileIn.next();
            int binaNo = fileIn.nextInt();
            int daireNo = fileIn.nextInt();
            String sehir = fileIn.nextLine();

            //dosyadan okunan veriler ile Adres ve Student nesneleri yaratiliyor
            adres = new Adres(sokak, binaNo, daireNo, sehir);
            ogrenci = new Student(ogrenciNo, isim, notOrtalama, adres);

            System.out.println(ogrenci);

            //en yuksen not ortalamasina sahib ogrenci bilgileri elde ediliyor
            if (notOrtalama > maxNotOrtalama) {

                maxNotOrtalama = notOrtalama;
                maxOgrenciNo = ogrenciNo;
                maxIsim = isim;
                maxAdres = adres;

            }
        }

        //dosya okunmasi bittikten sonra en yüksek not ortalamasına sahip
        // öğrenci nesnesi bilgileri ile oluşturulan toplam Student
        //nesnesi sayısı ekrana yazdiriliyor 
        
        System.out.println("\nEn yüksek not ortalamasına sahip öğrenci bilgileri: \n"
                + maxOgrenciNo + " " + maxIsim + " " + maxNotOrtalama + " " + maxAdres + "\n");

        System.out.println("Toplam olusturulan Student nesnesi: " + Student.nesne());

        fileIn.close();

    }

}
