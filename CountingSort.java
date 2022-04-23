package Tugas7;
import java.util.*;
import java.lang.Math;
public class CountingSort {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size, i, j;
        System.out.print("Masukkan panjang data : ");
        size = input.nextInt();
        int[] data = new int[size];
        
        for (i = 0; i <= size - 1; i++) {
            data[i] = input.nextInt();
        }
        
        // proses sorting
        int mIN, mAX;
        
        mIN = 99999;
        mAX = (int) (-99999);
        for (i = 0; i <= size - 1; i++) {
            if (data[i] > mAX) {
                mAX = data[i];
            }
            if (data[i] < mIN) {
                mIN = data[i];
            }
        }
        int zCount;
        
        zCount = mAX - mIN + 1;
        int[] dataCount = new int[zCount];
        
        // inisialisasi array dataCount
        for (i = 0; i <= zCount - 1; i++) {
            dataCount[i] = 0;
        }
        for (i = 0; i <= size - 1; i++) {
            int value;
            
            value = data[i];
            j = value - mIN;
            dataCount[j] = dataCount[j] + 1;
        }
        
        // meletakkan hasil sorting ke array hasil sorting
        int k;
        
        k = 0;
        for (i = 0; i <= zCount - 1; i++) {
            if (dataCount[i] > 0) {
                int zk;
                
                zk = dataCount[i];
                int value;
                
                value = mIN + i;
                for (j = 1; j <= zk; j++) {
                    data[k] = value;
                    k = k + 1;
                }
            }
        }
        
        // cetak data
        for (i = 0; i <= size - 1; i++) {
            System.out.print(Integer.toString(data[i]) + " ");
        }
    }
}

