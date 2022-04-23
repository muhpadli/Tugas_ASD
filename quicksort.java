
package Tugas7;

import java.util.*;
import java.lang.Math;
public class quicksort {
    

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size, i, j;
        System.out.print("Masukkan panjang data : ");
        size = input.nextInt();
        ArrayList<Double> data= new ArrayList<>();
        for (i = 0; i < size ; i++) {
            double data_angka = input.nextDouble();
            data.add(data_angka);
        }
        // proses sorting
        quicksort(data, 0, size - 1);
        // proses cetak
        for (i = 0; i <= size - 1; i++) {
            System.out.print(Double.toString(data.get(i)) + " ");
        }
    }
    
    public static int partisi( ArrayList<Double> data, int low, int high) {
        int indexPartisi, i, j;
        double pivot, temp;
        double A = data.get(high);
        pivot = A;
        i = low - 1;
        for (j = low; j <= high - 1; j++) {
            if (data.get(j) < pivot) {
                i = i + 1;
                // menukar data
                temp = data.get(i);
                data.set(i, data.get(j));
                data.set(j, temp);
            }
        }
        temp = data.get(i+1);
        data.set(i+1, data.get(high));
        data.set(high, temp);
        indexPartisi = 1 + i;
        
        return indexPartisi;
    }
    
    public static void quicksort(ArrayList<Double> data, int low, int high) {
        if (low < high) {
            int indexPartisi;
            indexPartisi = partisi(data, low, high);
            quicksort(data, low, indexPartisi - 1);
            quicksort(data, indexPartisi + 1, high);
        }
    }
}

