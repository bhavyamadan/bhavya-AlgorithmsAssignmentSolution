package com.assignment2.service;

public class MergeSort {

	void merge(double[] arr, int left, int mid, int right) {
		// Size of the left and right arrays before merging
		int sizeLeftArr  = mid - left + 1;
		int sizeRightArr = right - mid;
		
		// Temporary Arrays
		double[] leftArr  = new double[sizeLeftArr];
		double[] rightArr = new double[sizeRightArr];
		
		// Capy data to temporary arrays
		int i,j;
		for(i = 0; i < sizeLeftArr; i++) {
			leftArr[i] = arr[left + i];
		}
		i = 0;
		
		for(j = 0; j < sizeRightArr; j++) {
			rightArr[j] = arr[mid + 1 + j];
		}
		j = 0;
		
		// Merging the arrays
		int k = left;
		while(i < sizeLeftArr && j < sizeRightArr) {
			if(leftArr[i] >= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < sizeLeftArr) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < sizeRightArr) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
	
	public void sort(double[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid); 			// Sort the left side
			sort(arr, mid + 1, right);		// Sort the right side
			merge(arr, left, mid, right);	// Merger the sorted arrays
		}
	}

}
