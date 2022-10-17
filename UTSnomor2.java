import java.util.Scanner;

public class UTSnomor2
{
    static double tinggi_badanMeter(double tinggi_badan) {return Math.abs(tinggi_badan/100);}
    static double hitungBMI(double berat_badan, double tinggi_badan) {return Math.abs(berat_badan / (tinggi_badanMeter(tinggi_badan)  * tinggi_badanMeter(tinggi_badan))); }
    private String bmi;
    public UTSnomor2(double hitungBMI){
        if ( hitungBMI >= 18.5 && hitungBMI <= 22.9 )
        {this.bmi = "Ideal";}
        else if ( hitungBMI >= 22.9 ) {
            this.bmi = "Overweight";}
        else if ( hitungBMI <= 18.5 )
        {this.bmi = "Underweight";
        }
    }
    public String BMITotal(){
        return this.bmi;
    }
    public static void main(String[] args) {
        Scanner clara = new Scanner(System.in);
        System.out.print("Input Berat Badan Anda (KG) = ");
        double berat_badan = clara.nextInt();
        System.out.print("Input Tinggi Badan Anda (CM) = ");
        double tinggi_badan = clara.nextInt();
        System.out.print("Tinggi Anda Dalam Meter = " + tinggi_badanMeter(tinggi_badan));
        System.out.println(" ");
        System.out.println("Hasil : ");
        UTSnomor2 G = new UTSnomor2(hitungBMI(berat_badan, tinggi_badan));
        System.out.println("Point BMI Anda: " + hitungBMI(berat_badan, tinggi_badan));
        System.out.println("Pernyataan Berat Badan Anda: " + G.BMITotal());
    }
}
