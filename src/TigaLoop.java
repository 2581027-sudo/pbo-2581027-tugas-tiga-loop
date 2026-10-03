import java.util.Scanner;

/*
 * Tugas  : Tiga Loop, Satu Deret
 * Nama   : Friendly Harold Panjaitan
 * NIM    : 2581027
 *
 * ============================================================
 * HASIL RUN PERTAMA (n = 5)
 * ============================================================
 * Batas deret (n) : 5
 *
 * ===== SATU DERET, TIGA LOOP =====
 * for      : 1 2 3 4 5
 * while    : 1 2 3 4 5
 * do-while : 1 2 3 4 5
 *
 * i <  n berputar : 4 kali
 * i <= n berputar : 5 kali
 *
 * ============================================================
 * HASIL RUN KEDUA (n = 0)
 * ============================================================
 * Batas deret (n) : 0
 *
 * ===== SATU DERET, TIGA LOOP =====
 * for      :
 * while    :
 * do-while : 1
 *
 * i <  n berputar : 0 kali
 * i <= n berputar : 0 kali
 *
 * ============================================================
 * KESIMPULAN
 * ============================================================
 * Dua baris pertama (for dan while) kosong karena keduanya mengecek
 * kondisi SEBELUM badan loop dijalankan: dengan n = 0, kondisi 1 <= 0
 * sudah salah sejak awal sehingga badannya tidak pernah jalan, sedangkan
 * baris ketiga (do-while) tetap tercetak "1" karena do-while menjalankan
 * badan loop dulu baru mengecek kondisi di akhir.
 *
 * Kesimpulan satu kalimat: do-while mengecek kondisinya SESUDAH badan
 * loop dijalankan, jadi badannya pasti jalan minimal sekali.
 */
public class TigaLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // ---------- 1) Versi for (pencacah sendiri: i) ----------
        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        // ---------- 2) Versi while (pencacah sendiri: j) ----------
        System.out.print("while    :");
        int j = 1;
        while (j <= n) {
            System.out.print(" " + j);
            j++; // jangan lupa dinaikkan, kalau tidak program menggantung
        }
        System.out.println();

        // ---------- 3) Versi do-while (pencacah sendiri: k) ----------
        // Badan loop jalan dulu, baru kondisi dicek -> minimal sekali jalan
        System.out.print("do-while :");
        int k = 1;
        do {
            System.out.print(" " + k);
            k++;
        } while (k <= n);
        System.out.println();

        System.out.println();

        // ---------- Bukti meleset satu (off-by-one) ----------
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        input.close();
    }
}