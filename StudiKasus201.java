import java.util.Scanner;

public class StudiKasus201 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan, pesanStatus;
        byte jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Masukkan jumlah dokumen yang diunggah: ");
            jumlahDokumen = sc.nextByte();

            System.out.print("Masukkan peringkat juara: ");
            peringkatJuara = sc.nextByte();
            
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    pesanStatus = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    pesanStatus = "Dokumen tidak lengkap (kurang "+ (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                pesanStatus = "Bukan juara 1/2/3. Dana penghargaan tidak diberikan.";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Masukkan jumlah dokumen yang diunggah: ");
            jumlahDokumen = sc.nextByte();

            System.out.print("Masukkan status pendanaan (1 = lolos, 0 = tidak lolos): ");
            statusPendanaan = sc.nextByte();

            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    pesanStatus = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    pesanStatus = "Dokumen tidak lengkap (kurang "+ (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                pesanStatus = "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }

        } else {
            pesanStatus = "Jenis kegiatan lain tidak memperoleh pendanaan.";
        }

        System.out.println("Status: " + pesanStatus);

    }
}