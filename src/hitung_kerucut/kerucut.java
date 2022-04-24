package hitung_kerucut;
import java.util.Scanner;

public class kerucut {
	
	public static void main (String[] args){
		Scanner userInput = new Scanner(System.in);
        float phi = 3.14f;
        float r, tinggi, s; // s = Panjang Garis Pelukis
        float luasP, volume;
 
        System.out.println("\t Luas Permukaan Selimut & Volume Kerucut \n\n");
        System.out.print(" Masukkan Jari-jari  : ");
        r = userInput.nextFloat();
 
        System.out.print(" Masukkan Tinggi       : ");
        tinggi = userInput.nextFloat();
 
        System.out.print(" Masukkan S            : ");
        s = userInput.nextFloat();
 
        luasP = luasPermukaan(r, s);
        System.out.print("\n Luas Selimut : " + luasP);
 
        volume = volumeKerucut(r, tinggi);
        System.out.print("\n Volume Kerucut : " + volume);
    }
 
    public static float luasPermukaan(float r, float s) {
        float phi = 3.14f;
        float hasil = phi * r * s ;
        return hasil;
    }
 
    public static float volumeKerucut(float r, float t) {
        float phi = 3.14f;
        float hasil = 1 / (float) 3 * phi * r * r * t;
        return hasil;
    }
}
