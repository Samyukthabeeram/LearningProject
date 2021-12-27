package com.java.beginner2;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 20, 33, 41, 7, 1 };
		int temp;
		int j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}