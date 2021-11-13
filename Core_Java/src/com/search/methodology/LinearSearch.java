package com.search.methodology;

import java.util.Arrays;

public class LinearSearch implements Search {

	private int element[];
	static LinearSearch l = new LinearSearch();

	public int[] getElement() {
		return Arrays.copyOf(element, element.length);
	}

	public void setElement(int[] element) {
		this.element = Arrays.copyOf(element, element.length);
	}

	@Override
	public void addElement() {
		int[] element = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		l.setElement(element);

	}

	@Override
	public boolean searchElements(int key) {
		l.addElement();
		int arr[] = l.getElement();
		int length = arr.length - 1;

		for (int i = 0; i < length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}
}
