package com.sun.dynamicProgramming;

import com.sun.common.CaseNumber.RandomNumber;

// 2xN 타일링 문제
public class Tiling_11727
{
    /**
     * 문제
     * 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
     *
     * 출력
     * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
     *
     * 출처
     * https://www.acmicpc.net/problem/11727
     */

    public static void main(String[] args)
    {
        initDp(); // 초기화

        int randomNum = RandomNumber.getIntRandomNumber(1000, 1);

        System.out.println(dp[randomNum]);
    }

    private static int[] dp = new int[1001]; // 1~1000 이니까 1000개

    // 배열이 미리 범위만큼의 값을 채운다.
    private static void initDp()
    {
        dp[0] = 1; // 배열을 1부터 시작하게 하기위해 더미값을 넣는다.
        dp[1] = 1;

        for(int i=2; i<= 1000; i++)
        {
            dp[i] = (dp[i-1] + (2 * dp[i-2])) % 100007; // 경우의 수 배열에 담기
        }
    }
}
