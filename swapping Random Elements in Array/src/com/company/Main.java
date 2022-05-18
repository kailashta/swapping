package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size for an array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter Elements For an Array");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter Two index Numbers to Swap The Elements");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        System.out.println("Before Swapping");
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("After Swapping");
        swap(numbers,index1,index2);
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
    private static void swap(int numbers[],int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
