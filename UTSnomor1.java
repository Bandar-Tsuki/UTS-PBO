import java.util.Scanner;
public class UTSnomor1
{
    static double convertjam(int jam, int jamAwal) {return Math.abs(3600 * (jam-jamAwal)); }
    static int jamtotal(int jam, int jamAwal) {return Math.abs(jam-jamAwal); }
    static double convertmenit(int menit, int menitAwal) {return Math.abs(60 * (menit-menitAwal)); }
    static int menittotal(int menit, int menitAwal) {return Math.abs(menit-menitAwal); }

    static double convertdetik(int detik, int detikAwal) {return Math.abs(detik-detikAwal); }
    static int detiktotal(int detik, int detikAwal) {return Math.abs(detik-detikAwal); }
    static double biayapulsa(int biaya, int detik, int jam, int menit, int jamAwal, int menitAwal, int detikAwal) {
        return ((convertjam(jam,jamAwal) + convertmenit(menit,menitAwal) + convertdetik(detik,detikAwal))/5)*biaya ; }
    public static void main(String[] args) {
        Scanner altri = new Scanner(System.in);
        int biaya = 150;
        int jamAwal;
        System.out.print("Input Jam awal= ");
        jamAwal = altri.nextInt();
        int menitAwal;
        System.out.print("Input Menit awal= ");
        menitAwal = altri.nextInt();
        int detikAwal;
        System.out.print("Input Detik awal = ");
        detikAwal = altri.nextInt();
        System.out.print(jamAwal + " : " + menitAwal + " : " + detikAwal);
        System.out.println(" ");
        int jam;
        System.out.print("Input Jam akhir= ");
        jam = altri.nextInt();
        int menit;
        System.out.print("Input Menit akhir= ");
        menit = altri.nextInt();
        int detik;
        System.out.print("Input Detik akhir = ");
        detik = altri.nextInt();
        System.out.print(jam + " : " + menit + " : " + detik);
        System.out.println(" ");
        System.out.print("Waktu Total Menelpon = " + jamtotal(jam, jamAwal) + " : " + menittotal(menit, menitAwal) + " : " + detiktotal(detik, detikAwal));
        System.out.println(" ");
        System.out.printf("Biaya yang dikenakan sebanyak Rp " + biayapulsa(biaya, detik, jam, menit, jamAwal, menitAwal, detikAwal));
    }
}
