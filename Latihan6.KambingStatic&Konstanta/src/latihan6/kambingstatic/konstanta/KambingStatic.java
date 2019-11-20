package latihan6.kambingstatic.konstanta;

/**
 *
 * @author Asus
 * Nama : Aldi Febriansyah
 * Kelas : TI-B
 * NIM : A2.19000215
 * Deskripsi Program : Project ini berisi tentang Kambing Static.
 */
public class KambingStatic {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN" ;
    
    public static void main (String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                + Mamalia.jumlahKambing);
    }
    
}
