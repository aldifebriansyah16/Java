package latihan3.memasukan.nilai.dari.keyboard;
import java.util.Scanner;

/**
 *
 * @author Asus
 * Nama  : Aldi Febriansyah
 * Kelas : Ti-B
 * NIM   : A2.1900015
 * Deskripsi Project : Project ini membahas tentang Memasukan Nilai Dari 
 * Keyboard.
 */
public class Latihan3MemasukanNilaiDariKeyboard {
    public static void main(String[] args) {
        System.out.println("Memasukan nama anda: ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
