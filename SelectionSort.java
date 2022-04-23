package Tugas7;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        ArrayList<Double> data = new ArrayList<>();
        System.out.print("Masukkan banyak data : ");
        int size= sc.nextInt();
        for( i=0; i<size; i++){
            double nilai = sc.nextDouble();
            data.add(nilai);
        }
        
        //proses selection sort
        for( i=0; i<size-1; i++){
            int jMIN = i;
            for( j=i+1; j<size; j++){
                if(data.get(j) < data.get(jMIN)){
                    jMIN= j;
                }
            }
            if(i!= j){
                double temp = data.get(i);
                data.set(i, data.get(jMIN));
                data.set(jMIN, temp);      
            }
        }
            
        
        for( i=0; i<size; i++){
            System.out.print(Double.toString(data.get(i))+" ");
        } 
    }
}
