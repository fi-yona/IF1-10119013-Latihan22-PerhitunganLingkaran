/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan22.perhitunganlingkaran;

/**
 *
 * @author Fiona Avila
 */



import java.util.Scanner;

import java.lang.Math;


public class PerhitunganLingkaran {
    
    double diameter;
    double phi = Math.PI;
    double jariJari;
    
    static Scanner scan = new Scanner(System.in);
    
    public void inputDiameter(){
        System.out.print("Masukkan nilai diameter lingkaran : ");
        tidakSesuai(scan.next());
    }
    
    public void tidakSesuai(String diameter){
        if(!diameter.matches("^[0-9]*$")){
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println();
            inputDiameter();       
       }else{
           this.diameter = Double.parseDouble(diameter);
       }             
    }
   
    public double hitungJariJariLingkaran(){
       double jariJari = diameter/2;
       return jariJari;
    }
    
    public double hitungLuasLingkaran(){
        double luas = phi * Math.pow(diameter, 2);
        return luas;
    }
    
    public double hitungKelilingLingkaran(){
        double keliling = phi * diameter;
        return keliling;
    }
    
    public static void main(String[] args) {
        PerhitunganLingkaran lingkaran = new PerhitunganLingkaran();
        
        System.out.println();
        System.out.println("=============Perhitungan Lingkaran=============");
        
        lingkaran.inputDiameter();
        
        System.out.println();
        System.out.println("==========Hasil Perhitungan Lingkaran==========");
        
        double jariJari = lingkaran.hitungJariJariLingkaran();
        double luas = lingkaran.hitungLuasLingkaran();
        double keliling = lingkaran.hitungKelilingLingkaran();
        
        System.out.println("Jari-jari\t: " + jariJari);
        System.out.printf("Luas\t\t: %.2f%n", luas);
        System.out.printf("Keliling\t: %.2f%n", keliling);
        System.out.println("===============================================");
    }
    
}
