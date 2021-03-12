package com.sun.sort;


import java.util.Scanner;

public class Sort_2750
{
    /**
     * 문제
     * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
     * 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
     * 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
     *
     * 출력
     * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
     *
     * 출처
     * https://www.acmicpc.net/problem/2750
     */

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // N 입력
        System.out.print("N: ");
        int N = scan.nextInt();

        System.out.println();

        int[] array = new int[N];
        for (int i = 0; i < N; i++)
        {
            array[i] = scan.nextInt();// N개의 숫자를 입력받는다.
        }

        selectionSort(array);

        for (int i = 0; i < N; i++)
        {
            System.out.println(array[i]);
        }


    }

    private static void selectionSort(int[] array)
    {
        int min, temp;
        int index = 0;

        int arrLen = array.length;

        for(int i = 0; i < arrLen; i++)
        {
            min = 1001;

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

    }

}
