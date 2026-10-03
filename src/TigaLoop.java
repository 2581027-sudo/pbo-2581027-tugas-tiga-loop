import java.util.Scanner;

/*
 * Tugas  : Tiga Loop, Satu Deret
 * Nama   : Friendly Harold Panjaitan
 * NIM    : 2581027
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

        input.close();
    }
}