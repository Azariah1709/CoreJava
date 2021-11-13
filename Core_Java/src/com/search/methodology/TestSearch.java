package com.search.methodology;


import java.util.Scanner;

public class TestSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element to be searched");
		int key = sc.nextInt();
		
		LinearSearch  l = new LinearSearch();
		System.out.print("Element status is : "+l.searchElements(key));
		System.out.println();
		BinarySearch  b = new BinarySearch();
		System.out.print("Element status is : "+b.searchElements(key));
		
		sc.close();
	}
}
