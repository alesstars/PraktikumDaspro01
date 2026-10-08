import java.util.Scanner;

public class StudiKasus101 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000, jumlahCup, uangBayar,
        totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan jumlah bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        }
        
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Jumlah diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup! Kurang: " + kurang);
        }


    }
}