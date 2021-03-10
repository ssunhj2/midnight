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
            while(i <= end && data[i] <= data[pivot]) i++; // 키 값보다 큰값을 찾을때까지다 반

            while(j > start && data[j] >= data[pivot]) j--; // 키 값보다 작은값을 찾을때까지우 반복

            if(i > j) // 교차 된 경우
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
