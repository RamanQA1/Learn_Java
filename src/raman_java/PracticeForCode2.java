package raman_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PracticeForCode2 {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 5, 4, 19, 10, 55 };
		int temp;

		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {

				if (a1[i] < a1[j]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;

				}

			}

		}
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		System.out.println("2nd Largest value: " +a1[1]);

	}

}
