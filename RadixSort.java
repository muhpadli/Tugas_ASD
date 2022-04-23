package Tugas7;
import java.util.*;
public class RadixSort {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size, i, j, k, m;
        System.out.print("Masukkan panjang data : ");
        size = input.nextInt();
        int[] data = new int[size];
        
        for (i = 0; i <= size - 1; i++) {
            data[i] = input.nextInt();
        }
        
        // proses sorting
        int mAX;
        
        mAX = (int) (-99999);
        for (i = 0; i <= size - 1; i++) {
            if (data[i] > mAX) {
                mAX = data[i];
            }
        }
        int mAXLEVEL, pEMBAGI, hASILBAGI;
        
        mAXLEVEL = 1;
        pEMBAGI = 1;
        hASILBAGI = (int) ((double) mAX / pEMBAGI);
        while (hASILBAGI >= 10) {
            mAXLEVEL = mAXLEVEL + 1;
            pEMBAGI = pEMBAGI * 10;
            hASILBAGI = (int) ((double) mAX / pEMBAGI);
        }
        pEMBAGI = 1;
        int pEMBAGISISA;
        
        pEMBAGISISA = 1;
        for (m = 1; m <= mAXLEVEL; m++) {
            pEMBAGI = pEMBAGI * 10;
            
            // mendeklarasikan array bucket dan index array bucket
            int[] bucket0 = new int[size], bucket1 = new int[size], bucket2 = new int[size], bucket3 = new int[size], bucket4 = new int[size], bucket5 = new int[size], bucket6 = new int[size], bucket7 = new int[size], bucket8 = new int[size], bucket9 = new int[size];
            int index0, index1, index2, index3, index4, index5, index6, index7, index8, index9;
            
            index0 = 0;
            index1 = 0;
            index2 = 0;
            index3 = 0;
            index4 = 0;
            index5 = 0;
            index6 = 0;
            index7 = 0;
            index8 = 0;
            index9 = 0;
            for (i = 0; i <= size - 1; i++) {
                int value;
                
                value = data[i];
                int sisa;
                
                sisa = value % pEMBAGI;
                int posisi;
                
                posisi = (int) ((double) sisa / pEMBAGISISA);
                if (posisi == 0) {
                    bucket0[index0] = value;
                    index0 = index0 + 1;
                } else {
                    if (posisi == 1) {
                        bucket1[index1] = value;
                        index1 = index1 + 1;
                    } else {
                        if (posisi == 2) {
                            bucket2[index2] = value;
                            index2 = index2 + 1;
                        } else {
                            if (posisi == 3) {
                                bucket3[index3] = value;
                                index3 = index3 + 1;
                            } else {
                                if (posisi == 4) {
                                    bucket4[index4] = value;
                                    index4 = index4 + 1;
                                } else {
                                    if (posisi == 5) {
                                        bucket5[index5] = value;
                                        index5 = index5 + 1;
                                    } else {
                                        if (posisi == 6) {
                                            bucket6[index6] = value;
                                            index6 = index6 + 1;
                                        } else {
                                            if (posisi == 7) {
                                                bucket7[index7] = value;
                                                index7 = index7 + 1;
                                            } else {
                                                if (posisi == 8) {
                                                    bucket8[index8] = value;
                                                    index8 = index8 + 1;
                                                } else {
                                                    if (posisi == 9) {
                                                        bucket9[index9] = value;
                                                        index9 = index9 + 1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            pEMBAGISISA = pEMBAGISISA * 10;
            k = 0;
            j = 0;
            while (j < index0) {
                data[k] = bucket0[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index1) {
                data[k] = bucket1[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index2) {
                data[k] = bucket2[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index3) {
                data[k] = bucket3[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index4) {
                data[k] = bucket4[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index5) {
                data[k] = bucket5[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index6) {
                data[k] = bucket6[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index7) {
                data[k] = bucket7[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index8) {
                data[k] = bucket8[j];
                k = k + 1;
                j = j + 1;
            }
            j = 0;
            while (j < index9) {
                data[k] = bucket9[j];
                k = k + 1;
                j = j + 1;
            }
        }
        
        // cetak data
        for (i = 0; i <= size - 1; i++) {
            System.out.print(Integer.toString(data[i]) + " ");
        }
    }
}
