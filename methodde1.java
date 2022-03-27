import java.util.Scanner;

public class bookingHotel{
    public static void main(String[] args) {
        /*JUDUL TUGAS*/
        System.out.println("TUGAS MODUL 4 Kelompok 11");
        System.out.println("");

        /*Program*/
        System.out.println("SELAMAT DATANG DI BOOKING HOTEL KAMI");
        System.out.println("Disini Kami Menyediakan Berbagai Jenis Kamar");
        
        
        System.out.print("berapa malam?  = ");
        int malam = in.nextInt();
        System.out.print("tipe kamar berapa? = ");
        int tipe = in.nextInt();
        int harga = hitung(malam,tipe);
        System.out.println("harganyaa "+harga+" ribu");
        
    }
        public static int hitung(int malam, int tipe) {
        int total = malam*tipe;
        return total;
    }


    
}


