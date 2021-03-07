package com.sun.study.sort;

/**
 * 버블정렬
 * 옆의 값과 비교하여 큰 수는 뒤로 보낸다.
 */
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] numArr = {2, 5, 10, 1, 6, 3, 9, 4, 7, 8};

        int temp;
        int arrLength = numArr.length;

        for(int i = 0; i < arrLength; i++)
        {
            for(int j = 0; j < arrLength - 1 - i; j++)
            {
                if(numArr[j] > numArr[j+1])
                {
                    temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < arrLength; i++)
        {
            System.out.printf("%d ", numArr[i]);
        }

    }


}
