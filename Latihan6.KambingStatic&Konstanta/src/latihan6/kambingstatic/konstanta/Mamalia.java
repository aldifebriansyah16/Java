package latihan6.kambingstatic.konstanta;

/**
 *
 * @author Asus
 * Nama  : Aldi Febriansyah
 * Kelas : TI-B
 * NIM   : A2.1900015
 * Deskripsi Program : Project ini berisi tentang ... 
 */
public class Mamalia {
    // Variabel jumlahKambing dideklarasikan sebagai statik 
    public static int jumlahKambing;
    
 // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN" ;
    
    public static void main (String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki Kambing sebanyak " 
                + Mamalia.jumlahKambing);
    }
}
