import java.util.Scanner;

public class MainKRS {

    public static void menu() {

        System.out.println("\n=== MENU ANTRIAN KRS ===");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Proses KRS");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Tampilkan 2 Antrian Terdepan");
        System.out.println("5. Tampilkan Antrian Paling Belakang");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Jumlah Sudah Dilayani");
        System.out.println("8. Jumlah Belum Dilayani");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar");

        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AntrianKRS antrian =
                new AntrianKRS(10);

        int pilih;

        do {

            menu();

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa11 mhs =
                            new Mahasiswa11(
                                    nim,
                                    nama,
                                    prodi,
                                    kelas);

                    antrian.enqueue(mhs);

                    break;

                case 2:

                    antrian.dequeue2();

                    break;

                case 3:

                    antrian.tampilSemua();

                    break;

                case 4:

                    antrian.tampil2Terdepan();

                    break;

                case 5:

                    antrian.tampilAkhir();

                    break;

                case 6:

                    System.out.println(
                            "Jumlah Antrian : "
                            + antrian.getJumlahAntrian());

                    break;

                case 7:

                    System.out.println(
                            "Sudah Dilayani : "
                            + antrian.getSudahDilayani());

                    break;

                case 8:

                    System.out.println(
                            "Belum Dilayani : "
                            + antrian.getBelumDilayani());

                    break;

                case 9:

                    antrian.clear();

                    break;
            }

        } while (pilih != 0);
    }
}    

