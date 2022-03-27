public class Laprak {
  package Tugas;
import java.util.Scanner;
public class Laprak {
    public static void pembukaan(){
        System.out.println("TUGAS MODUL 4 Kelompok 11");
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner dataIn = new Scanner(System.in);
        int jml_pesanan = 1;
        int harga = 0;
        String kamar = null;
        //function
        pembukaan();
        //pemanggil objek
        method object = new method();
        object.menu();
        //Perulangan While
        while (jml_pesanan < 3) { //awal perulangan while
        System.out.println("# pesanan ");
        //inputan
        System.out.println("Input Data Ke- " + jml_pesanan);
        jml_pesanan++;
        System.out.print("Nama      : ");
        String nama = dataIn.next();
        System.out.print("Alamat    : ");
        String alamat = dataIn.next();
        System.out.print("Lama Inap (hari): " );
        int lama = dataIn.nextInt();
        System.out.print("Tipe Room (KAPITAL) : ");
        String tipe = dataIn.next();

        switch (tipe) {
           case "S":
                harga = 50000;
                kamar = "Single Room";
                break;
           case "D":
                harga = 100000;
                kamar = "Double Room";
                break;
           case "T":
                harga = 200000;
                kamar = "Triple Room";
                break;
           case "DL":
                harga = 150000;
                kamar = "Deluxe Room";
                break;
           case "P":
                harga = 250000;
                kamar = "Presidential Room";
                break;
          }
          
          
      
}
