package com.sun.dynamicProgramming;

import com.sun.common.CaseNumber.RandomNumber;

// 2xN 타일링 문
public class Tiling
{
    /**
     * 문제
     * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
     * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
     *
     * 입력
     * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
     *
     * 출력
     * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
     *
     * 출처
     * https://www.acmicpc.net/problem/11726
     */

    public static void main(String[] args)
    {
        int caseNumber = RandomNumber.intRandomNumber(1000, 1);

        int result = caseCnt(caseNumber) / 10007;
        System.out.println("2x" + caseNumber + " 크기의 직사각형을 채우는 방법의 수 를 10,007로 나눈 수:  " + result);

    }

    // 한번 구한 값은 배열에 저장한다.
    private static int[] caseCntArr = new int[1000];
    // 1. 피보나치와 같이 경우의 수가 1, 2, 3, 5, 8 ...로 늘어난다.(n=1, 2, .. 일때)
    // 2. 1x2 타일로 채우는 방법의 수 n-1
    //    2x1 타일로 채우는 방법의 수 n-2
    private static int caseCnt(int n)
    {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(caseCntArr[n] != 0) return caseCntArr[n];

        caseCntArr[n] = caseCnt(n-1) + caseCnt(n-2);
        return caseCntArr[n];
    }

}
