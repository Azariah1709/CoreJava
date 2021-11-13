package com.search.methodology;

import java.util.Arrays;

public class BinarySearch implements Search {

	private int element[] ;
	static BinarySearch b = new BinarySearch();

	public int[] getElement() {
		return Arrays.copyOf(element, element.length);	}

	public void setElement(int[] element) {
		this.element = Arrays.copyOf(element, element.length);
	}

	@Override
	public void addElement() {
		// TODO Auto-generated method stub
		int[] element = { 1, 2, 3, 4, 5, 6, 7, 8 ,9,10};
		b.setElement(element);
	}

	@Override
	public boolean searchElements(int key) {
		b.addElement();
		int arr[] = b.getElement();
		int l = 0, length = arr.length - 1;
		while (l <= length) {
			int m = l + (length - l) / 2;
			if (arr[m] == key) {
				return true;
			}
			if (arr[m] < key) {
				l = m + l;
			} else {
				length = m - l;
			}
		}
		return false;
	}

}
