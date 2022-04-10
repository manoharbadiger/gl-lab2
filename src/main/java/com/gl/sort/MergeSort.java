package com.gl.sort;

public class MergeSort {

    public void divide(int[] inputArray, int startIndex, int endIndex){
        if(startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            divide(inputArray, startIndex, midIndex);
            divide(inputArray, midIndex + 1, endIndex);
        conqure(inputArray, startIndex, midIndex, endIndex);
        }
    }

    private static void conqure(int[] inputArray, int startIndex, int midIndex, int endIndex) {
        int n1 = midIndex - startIndex + 1;
        int n2 =  endIndex - midIndex;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i =0; i < n1; ++i)
            L[i] = inputArray[startIndex +i];
        for(int j =0; j < n2; ++j)
            R[j] = inputArray[midIndex+1 +j];

        int i=0, j=0;
        int k = startIndex;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                inputArray[k] = L[i];
                i++;
            } else {
                inputArray[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            inputArray[k] = L[i];
            i++;
            k++;
        }
        while (j< n2){
            inputArray[k] = R[j];
            j++;
            k++;
        }

    }

    static void printArray(int inputArray[])
    {
        int n = inputArray.length;
        for (int i = 0; i < n; ++i)
            System.out.print(inputArray[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7,3 };
        System.out.println("Given Array");
        printArray(arr);
        MergeSort mergeSort = new MergeSort();
        mergeSort.divide(arr, 0, arr.length-1);
        System.out.println("Sorted Array");
        printArray(arr);
        System.out.println(arr[(arr.length-1)/2]);
    }

    public void middleElement(int[] inputArray, int startIndex, int endIndex){
        int mid = startIndex +(endIndex-startIndex)/2;
    }

    public static void leftRotateByMid(int[] inputArray){
        int middleIndex = inputArray.length/2;
        int[] leftHalf = new int[middleIndex+1];
        for(int i=0; i <= middleIndex; i++){
            leftHalf[i] = inputArray[i];
        }
        int[] rightHalf = new int[(inputArray.length-1)-middleIndex];
        for(int j = 0; j < inputArray.length-middleIndex; j++){
            rightHalf[j] = inputArray[j];
        }
    }

}
