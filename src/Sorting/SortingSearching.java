package Sorting;

import java.util.Scanner;

public class SortingSearching {
    private static String[] search;
    public static void SelectionSort(int[] A) { 
    int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        for (pass = 0; pass < n - 1; pass++){
            smallIndex = pass;
            for (j = pass + 1; j < n; j++){
                if (A[j] < A [smallIndex]){
                    smallIndex = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }
     public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }      
        System.out.println();
     }
     public static void Binary(int data[]){
        int B [] ={3,10,4,2,8,13};
        int search;
        int Indeks1 = 0;//0
        int Indeks2 = B.length-1;
        int ketemu = 0;
        int data = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang akan dicari");
        search=scan.nextInt();
        System.out.println();
        
        System.out.println("Isi dari Data adalah :");
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        
        while((Indeks1 <=Indeks2 &&(ketemu ==0))){
            data = (Indeks1 + Indeks2)/2;
            System.out.println("Indeks data :"+data);
            if(search == B[data]){
                ketemu = 1;
                System.out.println();
                System.out.println("Data" + search + "ada pada indeks ke-"+data);
                
            }
            else{
                if(search < B[data]){
                    System.out.println("Cari di sebelah kiri");
                    Indeks2 = data-1;
                    System.out.println("Cari di sebelah kanan"+"\n");
                }
            }
            if(ketemu == 1)
                System.out.println("keterangan : Data ditemukan"+"\n");
            else
                System.out.println("keterangan : Data tidak ditemukan"+"\n");
        }
        System.out.println();
        System.out.println("Ayikwati Muhfiyati");
        
    }
    
}