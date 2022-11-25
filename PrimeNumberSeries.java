package com.bridgelab.day16_17;

import java.util.Scanner;

public class PrimeNumberSeries {
	public static void primeSeries(int L,int H) {
		int counter = 0;
		{
			for (int i = L; i <= H; i++) {
				int temp = 0;
				for (int j = i; j > 1; j--) {
					if (i % j == 0) {
						temp = temp + 1;
					}
				}
				if (temp == 1) {
					counter = counter + 1;
					System.out.print(i + " ");
				}
			}
		}
		System.out.println("");
		System.out.println("number of prime number " + counter);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit of prime number");
		int lowerLimit = sc.nextInt();
		System.out.println("Enter higher limit of prime number");
		int higherLimit = sc.nextInt();
		primeSeries(lowerLimit,higherLimit);
	}
}
