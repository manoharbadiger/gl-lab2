package com.gl.sort;

import java.util.Scanner;
import java.util.function.Predicate;

public class LAb2Test1 {

    public static void main(String[] args) {
        transactionArray();
    }

    public static void transactionArray() {
        System.out.println("Enter the number of transaction entry");
        Scanner sc = new Scanner(System.in);
        int sizeOfTransaction = sc.nextInt();
        System.out.println("Enter the transaction details");
        int[] transactionData = new int[sizeOfTransaction];
        for (int i = 0; i < sizeOfTransaction; i++) {
            transactionData[i] = sc.nextInt();
        }
        for (int j = 0; j < sizeOfTransaction; j++) {
            System.out.print(transactionData[j] + " ");
        }
        System.out.print("============");
        System.out.println("Enter the target transaction");
        int targetValue = sc.nextInt();
        int totalCount = 0;
        int afterTrans = 0;
        for (int k = 0; k < sizeOfTransaction; k++) {
            totalCount += transactionData[k];
            afterTrans++;
            if (totalCount >= targetValue) {
                System.out.println("target has been achieved after " + afterTrans + " target Value " + targetValue);
                break;
            }
        }
        if (targetValue > totalCount) {
            System.out.println("target has not achieved for target value " + targetValue);
        }
    }
}
