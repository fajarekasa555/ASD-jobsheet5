package BruteForceDivideConquer.src.minggu5;

public class KampusMain {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 80, 88, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        int maxUTS = Kampus.tertinggiUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS tertinggi: " + maxUTS);

        int minUTS = Kampus.terendahUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS terendah: " + minUTS);

        double avgUAS = Kampus.rerataUAS(nilaiUAS);
        System.out.println("Rata-rata nilai UAS: " + avgUAS);
    }
}
