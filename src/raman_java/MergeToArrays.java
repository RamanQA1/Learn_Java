package raman_java;

import java.util.Arrays;

public class MergeToArrays {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8 };
		int cLength = a.length + b.length;

		int c[] = new int[cLength];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];

		}

		for (int i = 0; i < b.length; i++) {

			c[a.length + i] = b[i];

		}
//		System.out.println(Arrays.toString(c));
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);

		}

	}

}
