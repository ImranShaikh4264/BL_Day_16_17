package com.bridgelab.day16_17;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter the how many number u want to sort");
		Scanner sc = new Scanner(System.in);
		int Input = sc.nextInt();
		int[] arr = new int[Input];
		System.out.println("Enter the numbers");
		int i;
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("The numbers are:");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		bubbleSort(arr);
		System.out.println("After sorting numbers are:");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void bubbleSort(int[] arr) {
		int length = arr.length;
		int i, j;
		for (i = 0; i < length; i++) {
			for (j = 0; j < (length - i - 1); j++) {
				if (arr[j] > (arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
