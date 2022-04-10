package com.gl.sort;

public class InsertionAlgo {
    public static void main(String[] args) {
        int[] input = {1,4,6,2,7,10,5};
        for(int i =0; i < input.length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println("=============");
        System.out.println("Sorted Array");
        insertSort(input);
        for(int i =0; i < input.length;i++){
            System.out.print(input[i]+" ");
        }

    }
    public static void insertSort(int[] arr){
        for(int i=0; i < arr.length;i++ ){
            int v = arr[i];
            int j=i;
            while(j>=1 && arr[j-1] > v){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = v;
        }
    }
}
