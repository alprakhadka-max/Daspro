import java.util.Scanner;
public class Latihan2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahBuku;
        String jenisBuku;
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        double diskon = 0;

        
        if (jenisBuku.equals("kamus") && jumlahBuku > 2) {
            diskon = 0.12;
        } else if (jenisBuku.equals("kamus") && jumlahBuku <= 2) {
            diskon = 0.10;
        } else if (jenisBuku.equals("novel") && jumlahBuku > 3) {
            diskon = 0.09;
        } else if (jenisBuku.equals("novel") && jumlahBuku <= 3) {
            diskon = 0.08;
        } else if (!jenisBuku.equals("kamus") && !jenisBuku.equals("novel") && jumlahBuku > 3) {
            diskon = 0.05;
        } else {
            diskon = 0.00;
        }

        int persentaseDiskon = (int) (diskon * 100);
        System.out.println("Jumlah diskon: " + persentaseDiskon + "%");

        sc.close();
    }
}