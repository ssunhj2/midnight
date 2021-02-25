package com.sun.greedy;

public class SugarDelivery
{
    /**
     * 문제
     * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
     * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
     * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다.
     * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
     * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
     * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
     * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
     *
     * 출력
     * 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
     *
     * 출처
     * https://www.acmicpc.net/problem/2839
     */

    public static void main(String[] args)
    {
        // 숫자를 랜덤하게 입력받는다.
        int orderCnt = 18;

        int resultCnt = getSugerBoxCnt(orderCnt);

        System.out.println("배달할 총 설탕봉지 개수는 " + resultCnt + " 개 이다.");

    }

    // 배달해야할 설탕봉지의 개수를 반환한다.
    // hidden case: 26
    private static int getSugerBoxCnt(int orderCnt)
    {
        if(orderCnt < 3) return -1;

        int result = orderCnt / 5; // 5키로로 나눈 몫을 결과값에 저장한다.
        orderCnt = orderCnt % 5; // 5키로로 나눈 나머지를 넣는다.

        result += orderCnt / 3; // 3키로로 나눈 몫을 결과값에 더한다.
        orderCnt = orderCnt % 3; // 3키로로 나눈 나머지를 넣는다.

        if(orderCnt != 0) result = -1;

        return result;
    }
}
