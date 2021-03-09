package com.sun.study.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] data = {7, 6, 4, 3, 1, 5, 10, 2, 9, 8};
        int dataLeng = data.length;
        quickSort(data, 0, dataLeng-1);

        for (int i = 0; i < dataLeng; i++) {
            System.out.printf("%d ", data[i]);
        }
    }

    private static void quickSort(int[] data, int start, int end)
    {
        if(start >= end) return;

        int pivot = start;
        int i = start + 1;
        int j = end;

        while(i <= j){
            while(data[pivot] >= data[i]) i++; // 키 값보다 큰값을 찾을때까지

            while(data[pivot] <= data[j] && j > start) j--; // 키 값보다 작은값을 찾을때까지

            if(i > j)
            {
                swap(data, pivot, j);
            }
            else
            {
                swap(data, i, j);
            }
        }

        quickSort(data, start, j-1);
        quickSort(data, j+1, end);
    }

    // 요소를 서로 변경한다.
    private static void swap(int[] data, int idx1, int idx2) {
        int temp = data[idx1];
        data[idx1] = data[idx2];
        data[idx2] = temp;
    }
}
