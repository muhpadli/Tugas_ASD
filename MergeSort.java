package Tugas7;
import java.util.*;
public class MergeSort {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int size, i, j, k;
        System.out.print("Masukkan panjang data : ");
        size = input.nextInt();
        int[] data = new int[size];
        
        for (i = 0; i <= size - 1; i++) {
            data[i] = input.nextInt();
        }
        
        // proses sorting
        merge(data, size);
        
        // mencetak hasil sorting
        for (i = 0; i <= size - 1; i++) {
            System.out.print(Integer.toString(data[i]) + " ");
        }
    }
    
    public static void merge(int[] data, int size) {
        if (size >= 2) {
            int tengah;
            
            tengah = (int) ((double) size / 2);
            int nkiri, nkanan;
            
            nkiri = tengah;
            nkanan = size - tengah;
            int[] datakiri = new int[nkiri];
            int[] datakanan = new int[nkanan];
            int i;
            
            for (i = 0; i <= nkiri - 1; i++) {
                datakiri[i] = data[i];
            }
            for (i = 0; i <= nkanan - 1; i++) {
                datakanan[i] = data[tengah + i];
            }
            merge(datakiri, nkiri);
            merge(datakanan, nkanan);
            mergesort(data, datakiri, datakanan, size, nkiri, nkanan);
        }
    }
    
    public static void mergesort(int[] data, int[] datakiri, int[] datakanan, int ndata, int nkiri, int nkanan) {
        int size, i, j, k;
        
        size = ndata;
        i = 0;
        j = 0;
        k = 0;
        while (i < nkiri && j < nkanan) {
            if (datakiri[i] < datakanan[j]) {
                data[k] = datakiri[i];
                i = i + 1;
                k = k + 1;
            } else {
                data[k] = datakanan[j];
                j = j + 1;
                k = k + 1;
            }
        }
        while (i < nkiri) {
            data[k] = datakiri[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < nkanan) {
            data[k] = datakanan[j];
            j = j + 1;
            k = k + 1;
        }
    }
}
