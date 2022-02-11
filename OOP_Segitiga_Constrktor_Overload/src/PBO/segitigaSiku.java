/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

/**
 *
 * @author TOSHIBA
 */
import Segitiga.Segitiga;
public class segitigaSiku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi objek dari sebuah class
        Segitiga segitigaSatu;
        
        
        System.out.println("=============================================");
        System.out.println("=Program Luas Segitiga Dan Keliling Segitiga=");
        System.out.println("=============================================");
        System.out.println("= Nama : Life For Coding                    =");
        System.out.println("= Build By  : Skuy Replay                   =");
        System.out.println("=                                           =");
        System.out.println("=============================================");
        
        
        //instance
        segitigaSatu = new Segitiga();
        
        //print atribut sebelum setter untuk segitiga satu
        System.out.println(segitigaSatu.getInfo());
        System.out.printf ("Keliling :%4.2f \n" , segitigaSatu.getKeliling());
        System.out.printf ("Luas     :%4.2f \n" , segitigaSatu.getLuas());
        System.out.println("=============================================");
        //merubah atribut dengan setter
        segitigaSatu.setNama("Segitiga Dua");
        segitigaSatu.setAlas(5);
        segitigaSatu.setTinggi(8);
        segitigaSatu.setWarna("Pink");

        //print atribut sesudah setter untuk segitiga dua
        System.out.println(segitigaSatu.getInfo());
        System.out.printf ("Keliling :%4.2f \n" , segitigaSatu.getKeliling());
        System.out.printf ("Luas     :%4.2f \n" , segitigaSatu.getLuas());
        
        System.out.println("=============================================");
        //deklarasi dan instansiasi melalu method yang sudah di buat
        //perubahan nama dan warna
        Segitiga segitigaTiga = new Segitiga("Segitiga Tiga","Ungu");
        System.out.println(segitigaTiga.getInfo());
        System.out.println("=============================================");
        //perubahan nilai alas
        Segitiga segitigaEmpat = new Segitiga(7);
        System.out.println(segitigaEmpat.getInfo());
        System.out.printf ("Keliling :%4.2f \n" , segitigaEmpat.getKeliling());
        System.out.printf ("Luas     :%4.2f \n" , segitigaEmpat.getLuas());
        System.out.println("=============================================");
        //perubahan nilai alas dan tinggi
        Segitiga segitigaLima = new Segitiga(6,10);
        System.out.println(segitigaLima.getInfo());
        System.out.printf ("Keliling :%4.2f \n" , segitigaLima.getKeliling());
        System.out.printf ("Luas     :%4.2f \n" , segitigaLima.getLuas());
        System.out.println("=============================================");
        //perubahan nilai alas dan tinggi ada validasi nilai positif
        Segitiga segitigaEnam = new Segitiga(-6,-10);
        System.out.println(segitigaEnam.getInfo());
        System.out.printf ("Keliling :%4.2f \n" , segitigaEnam.getKeliling());
        System.out.printf ("Luas     :%4.2f \n" , segitigaEnam.getLuas());
        System.out.println("=============================================");
        //perubahan nama warna nilai alas nilai tinggi
        Segitiga segitigaTujuh = new Segitiga("Segitiga Tujuh", "Coklat", 10,20);
        System.out.println(segitigaTujuh.getInfo());
        System.out.printf ("Keliling :%4.2f \n" , segitigaEnam.getKeliling());
        System.out.printf ("Luas     :%4.2f \n" , segitigaEnam.getLuas());
        System.out.println("=============================================");
        System.out.println("=========== Built By : Skuy replay===========");
        System.out.println("=============================================");
        
    }
    
}
