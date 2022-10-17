import java.util.Scanner;

public class UTSnomor2
{
    static double tinggiMeter(double tinggi) {return Math.abs(tinggi/100);}
    static double hitungBMI(double berat, double tinggi) {return Math.abs(berat / (tinggiMeter(tinggi)  * tinggiMeter(tinggi))); }
    private String bmi;
    public UTSnomor2(double hitungBMI){
        if ( hitungBMI >= 18.5 && hitungBMI <= 22.9 )
        {this.bmi = "Underweight";}
        else if ( hitungBMI >= 22.9 ) {
            this.bmi = "Overweight";}
        else if ( hitungBMI <= 18.5 )
        {this.bmi = "Overweight";
        }
    }
    public String BMITotal(){
        return this.bmi;
    }
    public static void main(String[] args) {
        Scanner clara = new Scanner(System.in);
        System.out.print("Input Berat Badan Anda (KG) = ");
        double berat = clara.nextInt();
        System.out.print("Input Tinggi Badan Anda (CM) = ");
        double tinggi = clara.nextInt();
        System.out.print("Tinggi Anda Dalam Meter = " + tinggiMeter(tinggi));
        System.out.println(" ");
        System.out.println("Hasil : ");
        UTSnomor2 G = new UTSnomor2(hitungBMI(berat, tinggi));
        System.out.println("Point BMI Anda: " + hitungBMI(berat, tinggi));
        System.out.println("Nilai Huruf kamu: " + G.BMITotal());
    }
}
