import java.util.Scanner;

public class Tugas2_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kode 1");
        System.out.println("Kode 2");
        System.out.println("Kode 3");
        System.out.println("Kode 4");

        System.out.print("Masukkan Kode anda: ");
        int antrian = sc.nextInt();

        switch (antrian) {
            case 1:
                System.out.println("Legalisir Ijazah");
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Surat Keternga Lulus");
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("pembayaran UKT");
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("pengajuan Cuti Akademik");
                System.out.println("Loket D");
                break;
        
            default:
                System.out.println("OJO GOLEK SENG GAK ENEK!!!");
                break;
        }

    }
    
}
