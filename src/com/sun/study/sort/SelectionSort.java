package com.sun.study.sort;

/**
 * 선택정렬
 * 가장 작은것을 가장 앞으로 보낸다.
 *
 * 시간복잡도
 * O(N^2)
 */
public class SelectionSort
{
    public static void main(String[] args)
    {
        int min, temp;
        int index = 0;

        int[] array = {3, 10, 6, 7, 1, 8, 2, 4, 9, 5};
        int arrLen = array.length;

        for(int i = 0; i < arrLen; i++)
        {
            min = 99;

            for(int j = i; j < arrLen; j++)
            {
                if(min > array[j])
                {
                    min = array[j];
                    index = j;
                }
            }

            temp = array[i];
            array[i]= array[index];
            array[index] = temp;

        }

        for(int i = 0; i < arrLen; i++)
        {
            System.out.printf("%d ", array[i]);
        }
    }
}
