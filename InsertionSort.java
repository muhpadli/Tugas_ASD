package Tugas7;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Masukkan panjang data : ");
        int size = sc.nextInt();
        ArrayList<Double> ardu = new ArrayList<>();
        for(int i = 0; i<size; i++){
            double data = sc.nextDouble();
            ardu.add(data);
        }
        
        int i=1;
        int j;
        while(i<size){
            double temp = ardu.get(i);
            for(j=i; j>0; j--){
                if(temp < ardu.get(j-1)){
                    ardu.set(j, ardu.get(j-1));
                }
                else{
                    break;
                }
            }
            ardu.set(j, temp);
            i++;
        }
        for(int k=0; k<size; k++){
            System.out.print(Double.toString(ardu.get(k))+" ");
        }
    }
}
