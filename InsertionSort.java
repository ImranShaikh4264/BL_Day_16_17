package com.bridgelab.day16_17;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		System.out.println("Enter the number string u want to sort");
		Scanner sc = new Scanner(System.in);
		int Input = sc.nextInt();
		String[] arr = new String[Input];
		System.out.println("Enter the words");
		int i;
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.next();

		}
		System.out.println("The words are:");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		insertionSort(arr);
		System.out.println("After sorting words are:");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void insertionSort(String[] arr) {
		int length = arr.length;
		int i, j, key;
		for (i = 1; i < length; i++) {
			for (j = i - 1; j >= 0; j--) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
