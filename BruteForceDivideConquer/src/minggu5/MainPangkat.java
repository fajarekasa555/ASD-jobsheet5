package BruteForceDivideConquer.src.minggu5;

import java.util.Scanner;
    public class MainPangkat {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah element : ");
        int element = input.nextInt();

        Pangkat[] png = new Pangkat[element];
        for(int i = 0; i < element; i++){
            System.out.print("Masukan nilai basis elemen ke-"+(i+1)+": ");
            int basis = input.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();

            png[i] = new Pangkat(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE:" );
        for (Pangkat p : png) {
            System. out.println(p.nilai + "^" +p.pangkat+ ": "+p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat p : png) {
            System. out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
