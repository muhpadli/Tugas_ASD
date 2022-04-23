package Tugas7;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, i, j;
        System.out.println("Masukkan panjang data : ");
        size = sc.nextInt();
        ArrayList<Double> arrlist = new ArrayList<>();
        for( i=0; i<size; i++){
            double data = sc.nextDouble();
            arrlist.add(data);
        }
        
        //looping untuk bubble sort
        for(i=0; i<size-1; i++){
            for(j=0; j<size-i-1; j++){
                if(arrlist.get(j)>arrlist.get(j+1)){
                    double temp= arrlist.get(j);
                    arrlist.set(j,arrlist.get(j+1) );
                    arrlist.set(j+1, temp);
                }
            }
        }
        for( i=0; i<size; i++){
            System.out.println(arrlist.get(i)+" ");
        }
    }
}
