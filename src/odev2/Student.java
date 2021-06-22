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
public class Student {
    
    private int ogrenciNo;          //ogrenci numarisi icin int tipinde degisken
    private String isim;            // ogrenci ismi icin string tipinde degisken
    private double notOrt;          //ogrencinin not ortalamasi icin double tipinde degisken
    private Adres ogrAdres;         //ogrencinin adresi icin Adres tipinde degisken

    private static int nesne = 0;   //oluşturulan nesne sayısını tutmak için int tipinde degisken   
    
    
    //Parametresiz constructor metot
    
    public Student(){
        
        this(0,null,0,null);
    }
    
    //Gerekli tüm verinin alınıp atanmasını sağlayacak parametreli constructor metot

    public Student(int ogrenciNo, String isim, double notOrt, Adres ogrAdres){
        
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.notOrt = notOrt;
        this.ogrAdres = ogrAdres;
        
        nesne++;    //olusturulmus Student nesnesinin sayini buluyor
    }
    
    
    //degiskenler icin get ve set metotlari
    
    public int getOgrenciNo() {
        return ogrenciNo;
    }

    
    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    
    public String getIsim() {
        return isim;
    }

    
    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    public double getNotOrt() {
        return notOrt;
    }

    
    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    
    
    public Adres getOgrAdres() {
        return ogrAdres;
    }

    public void setOgrAdres(Adres ogrAdres) {
        this.ogrAdres = ogrAdres;
    }
    
    //toString metotu
    
    public String toString(){
        
        return (getOgrenciNo() +  " " + getIsim() +" " + getNotOrt() +" " + getOgrAdres());

    }
    
    //equal metotu - iki ogrencinin bilgilerini kiyasliyor 
    
    public boolean equals(Student baskaOgrenci){
       
        if (baskaOgrenci == null) 
            return false;
        else
            return (ogrenciNo == baskaOgrenci.ogrenciNo
                    && isim.equals(baskaOgrenci.isim)
                    && notOrt == baskaOgrenci.notOrt 
                    && ogrAdres.equals(baskaOgrenci.ogrAdres));
    
    }
    
    //static nesne degiskenini dondurmek icin metot
    
    public static int nesne(){
        return nesne;
    }
    
}
