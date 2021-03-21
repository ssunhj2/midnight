package com.sun.study.sort;

import java.util.Scanner;

public class MergeSort
{
    static int[] numArr; // 작업용 배열

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("정렬개수 : ");

        int cnt = scan.nextInt();
        int[] x = new int[cnt];

        for(int i = 0; i < cnt; i++)
        {
            System.out.println("x["+ i + "] : ");
            x[i] = scan.nextInt();
        }

        mergeSortInit(x, cnt);

        for (int i = 0; i < cnt; i++)
        {
            System.out.println("x["+ i + "]= " + x[i]);
        }
    }

    static void mergeSortInit(int[] arr, int n)
    {
        numArr = new int[n];

        mergeSort(arr, 0, n-1);

        numArr = null;
    }

    static void mergeSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            mergeSort(arr, left, center);
            mergeSort(arr, center+1, right);

            for (i = left; i <= center; i++)
            {
                numArr[p++] = arr[i];
            }

            while(i <= right && j < p)
            {
                arr[k++] = (numArr[j] <= arr[i]) ? numArr[j++] : arr[i++];
            }

            while(j < p)
            {
                arr[k++] = numArr[j++];
            }

        }

    }

}
