package com.bridgelab.day16_17;

import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(String[] words, String element) {
		int low = 0, high = words.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int res = element.compareTo(words[mid]);
			if (res == 0) {
				return mid;
			}
			if (res > 0) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] arr = { "apple", "banana", "watermelon", "mango" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word which is to be search");
		String x = sc.nextLine();
		int result = binarySearch(arr, x);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element present at " + "index " + result);
	}

}
