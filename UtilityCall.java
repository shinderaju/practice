package practice;

import java.util.*;

public class UtilityCall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long start = 0;
		Utility u = new Utility();
		System.out.println("Enter the proper number");
		System.out.println("1. binarySearch method for integer");
		System.out.println("2. binarySearch method for String");
		System.out.println("3. insertionSort method for integer");
		System.out.println("4. insertionSort method for String");
		System.out.println("5. bubbleSort method for integer");
		System.out.println("6. bubbleSort method for String");

		int w = sc.nextInt();
		switch (w) {
		case 1: {

			System.out.println("how many words you want to save");
			int n = sc.nextInt();
			String[] words = new String[n];
			System.out.println("Enter the words");

			for (int i = 0; i < n; i++) {
				words[i] = sc.next();
			}
			Arrays.sort(words);

			System.out.println("array after sorting");
			for (String s : words) {
				System.out.println(s);
			}

			System.out.println("enter the word you want to search");
			String value = sc.next();
			long start1 = u.startStopWatch();
			int val = u.bSearch(words, value);
			u.elapsde(start1);
			if (val != -1)
				System.out.println("Word " + value + "found at position = " + val);
			else
				System.out.println("word " + value + " not found");

			break;
		}
		case 2: {

			System.out.println("how many numbers you want to save");
			int n = sc.nextInt();
			int[] words = new int[n];
			System.out.println("Enter the words");

			for (int i = 0; i < n; i++) {
				words[i] = sc.nextInt();
			}
			Arrays.sort(words);

			System.out.println("array after sorting");
			for (int s : words) {
				System.out.println(s);
			}

			System.out.println("enter the number you want to search");
			int value = sc.nextInt();
			long start1 = u.startStopWatch();
			int val = u.bSearch(words, value);
			u.elapsde(start1);
			if (val != -1)
				System.out.println("Word " + value + "found at position = " + val);
			else
				System.out.println("word " + value + " not found");

			break;
		}
		case 3: {

			System.out.println("how many numbers you want to enter");
			int n = sc.nextInt();
			int[] words = new int[n];
			System.out.println("Enter the numbers");
			for (int i = 0; i < n; i++) {
				words[i] = sc.nextInt();
			}
			long start1 = u.startStopWatch();
			u.insertionSort(words, n);
			u.elapsde(start1);
			System.out.println("numbers after sorting");
			for (int s : words) {
				System.out.println(s);
			}
			break;
		}
		case 4: {
			System.out.println("how many words you want to enter");
			int n = sc.nextInt();
			String[] words = new String[n];
			System.out.println("Enter the words");
			for (int i = 0; i < n; i++) {
				words[i] = sc.next();
			}
			long start1 = u.startStopWatch();
			u.insertionSort(words, n);
			u.elapsde(start1);
			System.out.println("words after sorting");
			for (String s : words) {
				System.out.println(s);
			}
			break;
		}
		case 5: {
			System.out.println("how many number you want to enter");

			int n = sc.nextInt();
			int[] words = new int[n];
			
			System.out.println("Enter the numbers");
			for (int i = 0; i < n; i++) {
				words[i] = sc.nextInt();
			}
			long start1 = u.startStopWatch();
			u.BubbleSort(words, n);
			u.elapsde(start1);
			System.out.println("numbers after sorting");
			for (int s : words) {
				System.out.println(s);
			}
			break;
		}
		case 6: {
			System.out.println("how many words you want to enter");
			int n = sc.nextInt();
			String[] words = new String[n];
			System.out.println("Enter the words");
			for (int i = 0; i < n; i++) {
				words[i] = sc.next();
			}
			long start1 = u.startStopWatch();
			u.BubbleSort(words, n);
			u.elapsde(start1);
			System.out.println("words after sorting");
			for (String s : words) {
				System.out.println(s);
			}
			break;
		}
		default:
			System.out.println("wrong input");
			break;

		}

	}
}
