import java.util.Scanner;

public class UTSnomor3
{
    static int angka, sum;
    static {sum = 0;}
    static Scanner jeki = new Scanner(System.in);
    static void angka()
    {   angka = jeki.nextInt();
        sum += angka;
    }
    public static void main(String[] args) {
        System.out.println("Input 10 Bilangan");
        for (int i=1;i<=10;i++){
            System.out.print("angka ke " + i +" = ");angka();}
        System.out.println("Hasil dari penjumlahan 10 angka diatas : " + sum);
    }
}
