package com.sun.study.sort;

/**
 * 삽입정렬
 * 선택한 숫자를 앞쪽의 알맞는 위치에 삽입하는 정
 */
public class InsertSort
{
    public static void  main(String[] args)
    {
        int[] numArr = {5, 2, 10, 1, 6, 3, 9, 4, 7, 8};

        int arrLength = numArr.length;

        for (int i = 1; i < arrLength; i++)
        {
            int j;
            int selNum = numArr[i];
            for (j = i; j > 0 && numArr[j - 1] > selNum; j--)
            {
                numArr[j] = numArr[j - 1];
            }
            numArr[j] = selNum;
        }


        for (int i = 0; i < arrLength; i++)
        {
            System.out.printf("%d ", numArr[i]);
        }
    }
}
