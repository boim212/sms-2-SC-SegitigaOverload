/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segitiga;

/**
 *
 * @author TOSHIBA
 */
public class Segitiga {
    /* deklarasi variabel */
    //atribut
    
    //menabahkan checking dalam data integrity
    double miring;
    private String nama   = "Segitiga Satu";
    private double alas   = 4.0;
    private double tinggi = 6.0;
    private String warna  = "Merah";
    
    //method
    
    //Construktor Default
    public Segitiga()
    {
        
    }
    
    //Construktor 2 sampai 3 parameter
    public Segitiga(String n, String w)//untuk nama dan warna
    {
        nama = n;
        warna = w;
    }
    
    public Segitiga(double a)
    {
        if(a < 0){
            System.out.println("Nilai Alas Tidak Dapat Berubah");
            System.out.println("Karena Nilai Yang Anda Masukkan Bernilai Negatif");
            System.out.println("");
        }
        else{
            alas = a;
        }
    }
    
    public Segitiga(double a,double t)
    {
        if(t < 0 || a < 0){
            if(a < 0){
                System.out.println("Nilai Alas Tidak Dapat Berubah");
                System.out.println("Karena Nilai Yang Anda Masukkan Bernilai Negatif");
                System.out.println("");
            }
            if(t < 0)
            {
                System.out.println("Nilai Tinggi Tidak Dapat Berubah");
                System.out.println("Karena Nilai Yang Anda Masukkan Bernilai Negatif");
                System.out.println("");
            }
            
        }
        else{
            alas = a;
            tinggi = t;
        }
    }
    
    public Segitiga(String n, String w, double a, double t)
    {
        nama = n;
        warna = w;
        if(a < 0 || t < 0){
            if(a < 0){
                System.out.println("Nilai Alas Tidak Dapat Berubah");
                System.out.println("Karena Nilai Yang Anda Masukkan Bernilai Negatif");
                System.out.println("");
            }
            if(t < 0)
            {
                System.out.println("Nilai Tinggi Tidak Dapat Berubah");
                System.out.println("Karena Nilai Yang Anda Masukkan Bernilai Negatif");
                System.out.println("");
            }
            
        }
        else{
            alas = a;
            tinggi = t;
        }
    }
    //getter
    public String getNama()
    {
        return nama;
    }
    
    public double getAlas()
    {
        return alas;
    }
    
    public double getTinggi()
    {
        return tinggi;
    }
    
    public String getWarna()
    {
        return warna;
    }
    
    public double getKeliling()
    {
        miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return (alas + tinggi + miring);
    }
    
    public double getLuas()
    {
        return ((alas * tinggi)/2);
    }
    
    public String getInfo()
    {
        return ("Nama   : " + nama  + "\n" +
                "Alas   : " + alas  + "\n" +
                "Tinggi : " + tinggi+ "\n" +
                "Warna  : " + warna);
    }
    //setter
    public void setNama(String n)
    {
        nama = n;
    }
    
    public void setWarna(String w)
    {
        warna = w;
    }
    
    public void setAlas(double a)
    {
        if(a < 0)
        {
            System.out.println("Alas Tidak Boleh Bernilai Negatif");
            System.out.println("Alas Tidak Berubah");
            System.out.println("");
        }
        else{
            alas = a;
        }
    }
    
    public void setTinggi(double t)
    {
        if(t < 0)
        {
            System.out.println("Tinggi Tidak Boleh Bernilai Negatif");
            System.out.println("Tinggi Tidak Berubah");
            System.out.println("");
        }
        else{
            tinggi = t;
        }
    }
}
