
package Tugas7;

import java.util.*;

public class randomQuickSort {
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
        randomquicksort(data, 0, data.size()- 1);
        // proses cetak
        for (i = 0; i <= size - 1; i++) {
            System.out.print(Double.toString(data.get(i)) + " ");
        }
    }
    
    public static void swap( ArrayList<Double> data, int i, int j){
        double temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
    public static int partisi( ArrayList<Double> data, int beg, int end) {
        int random = beg +((int)Math.random()*(data.size()))/(end-beg+1);
        int last=end;
        swap(data, random, end);
        end--;
        
        while(beg<=end){
            if(data.get(beg) < data.get(last)){
                beg++;
            }else{
                swap(data, beg, end);
                end--;
            }
        }
        swap(data, beg, last);
        return beg;
    }
    
    public static void randomquicksort(ArrayList<Double> data, int beg, int end) {
        if (beg >= end) return;
        if (beg < 0 ) return;
        if (end > data.size()-1) return;
        
        int pivot = partisi(data, beg, end);
        randomquicksort(data, beg, pivot-1);
        randomquicksort(data, pivot+1, end);  
    }
}
