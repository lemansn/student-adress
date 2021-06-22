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
public class Adres {

    private String sokak;       //sokak/cadde ismi icin string tipinde degisken
    private int binaNo;         //bina numarasi icin int tipinde degisken
    private int daireNo;        //daire numarasi icin int tipinde degisken
    private String sehir;       //sehir ismi icin string tipinde degisken
    
    //Parametresiz constructor metot

    public Adres() {
        
        this(null,0,0,null);

    }
    
    //Gerekli tüm verinin alınıp atanmasını sağlayacak parametreli constructor metot
    
    public Adres(String sokak, int binaNo, int daireNo, String sehir) {

        this.sokak = sokak;         
        this.binaNo = binaNo;
        this.daireNo = daireNo;
        this.sehir = sehir;

    }
    

    //degiskenler icin get ve set metotlari
    
    public String getSokak() {
        
        return sokak;
    }

    public void setSokak(String sokak) {
        
        this.sokak = sokak;
    }

    public int getBinaNo() {
        
        return binaNo;
    }

    public void setBinaNo(int binaNo) {
        
        this.binaNo = binaNo;
    }

    public int getDaireNo() {
        
        return daireNo;
    }

    public void setDaireNo(int daireNo) {
        
        this.daireNo = daireNo;
    }

    public String getSehir() {
        
        return sehir;
    }

    public void setSehir(String sehir) {
        
        this.sehir = sehir;
    }
    
    
    //equals metotu - adres ile verilen baska bir adresi kiyasliyor

    public boolean equals(Adres baskaAdres) {

        if (baskaAdres == null) {
            return false;
        } 
        
        else 
        {
            return (getSokak().equals(baskaAdres.getSokak())
                    && getBinaNo() == baskaAdres.getBinaNo()
                    && getDaireNo() == baskaAdres.getDaireNo()
                    && getSehir().equals(baskaAdres.getSokak()));
        }

    }
    
    //toString metotu

    public String toString() {
        
        return (getSokak() + " " + getBinaNo()+ " " + getDaireNo() + " " + getSehir());

    }
}
