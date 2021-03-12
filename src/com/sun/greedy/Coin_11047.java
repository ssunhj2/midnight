package com.sun.greedy;

import java.util.Scanner;

public class Coin_11047
{
    /**
     * 문제
     * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
     * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
     * 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
     *
     * 출력
     * 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
     *
     * 출처
     * https://www.acmicpc.net/problem/11047
     */

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // N과 K 입력
        System.out.print("N: ");
        int N = scan.nextInt();
        System.out.print("K: ");
        int K = scan.nextInt();

        System.out.println();

        int[] coinArr = new int[N]; // N가지 열동전을 담을 배
        for (int i = 0; i < N; i++)
        {
            coinArr[i] = scan.nextInt(); // 가장 작 수부터 넣어준다.
        }


        int coinCnt = 0;
        for(int i = N-1; i >= 0; i--) // 큰 숫자부터 뺀다.
        {
            while(K - coinArr[i] >= 0) // 빼려는 수가 K 보다 작거나 같 경우만 연산한다.
            {
                K -= coinArr[i];
                coinCnt++; // 사용한 동전의 개수
            }
        }

        System.out.printf("동전 개수의 최소값: %d", coinCnt);

    }


}
