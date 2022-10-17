package UTSnomor4;
import java.util.Scanner;
class kelilinglingkaran {
    Scanner bandah = new Scanner(System.in);
    public void operasi(){
        System.out.print("\n Input Jari-Jari: ");
        double jarijari = bandah.nextDouble();
        double phi = 3.14;
        double kelLingk = 2 * phi * jarijari;
        System.out.println("Keliling Lingkaran = "+ kelLingk);
    }
}
class luaslingkaran{
    Scanner bandah = new Scanner(System.in);
    public void operasi(){
        System.out.print("\nInput Jari-Jari: ");
        double jarijari = bandah.nextDouble();
        double phi = 3.14;
        double luaslingk = phi * jarijari * jarijari;
        System.out.println("Luas Lingkaran = "+ luaslingk);
    }
}
class jore {
    Scanner bandah = new Scanner(System.in);
    kelilinglingkaran kel = new kelilinglingkaran();
    luaslingkaran l = new luaslingkaran();
    public void altridiana(){
        System.out.println("\nPilihan Menu :\n");
        System.out.println("A. Keliling\n");
        System.out.println("B. Luas\n");
        System.out.println("Pilihan Anda (A/B) : ");
        String altridiana = bandah.nextLine().toUpperCase();
        if ( altridiana.equals("A")){
            kel.operasi();
            menuUlang();
        }
        else if ( altridiana.equals("B")){
            l.operasi();
            menuUlang();
        }
        else {
            System.out.println("Input Salah");
            altridiana();
        }
    }
    public void menuUlang(){
        System.out.println("mau lagi apa nggak(Y/N): ");
        String menuUlang = bandah.nextLine().toUpperCase();
        if ( menuUlang.equals("Y")){
            altridiana();
        }
        else if ( menuUlang.equals("N")) {
            System.out.println("\nTerima kasih! Have a Good Day");
        }
        else {
            System.out.println("\nMohon Input Ulang!");
        }
    }
}
public class UTSnomor4 {
    public static void main(String[] args) {
        jore f = new jore();
        f.altridiana();
    }
}