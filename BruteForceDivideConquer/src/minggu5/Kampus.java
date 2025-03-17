package BruteForceDivideConquer.src.minggu5;

public class Kampus {
    static int tertinggiUTS(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMax = tertinggiUTS(arr, l, mid);
        int rightMax = tertinggiUTS(arr, mid + 1, r);
        return (leftMax > rightMax) ? leftMax : rightMax;
    }

    static int terendahUTS(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMin = terendahUTS(arr, l, mid);
        int rightMin = terendahUTS(arr, mid + 1, r);
        return (leftMin < rightMin) ? leftMin : rightMin;
    }

    static double rerataUAS(int[] arr){
        int total = 0;
        for( int nilai : arr){
            total += nilai;
        }
        return (double) total / arr.length;
    }
}
