package com.sun.dynamicProgramming;

public class FibonacciNumbers
{
    /**
     * 문제
     * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
     * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
     * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
     * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다.
     *
     * 출력
     * 첫째 줄에 n번째 피보나치 수를 출력한다.
     *
     * 출처
     * https://www.acmicpc.net/problem/2747
     */

    public static void main(String[] args)
    {
        int number = getRandomNumber();
        System.out.println(number +" 번째 피나치 수는 " + fiboNum(number) + " 입니다.");
    }

    // 계산한 피보나치수의 값을 저장해 반복되는 계산을 줄인다.
    private static int[] fiboArr = new int[45];

    // n번째 피보나치 수를 계산한다.
    // 재귀호출을 사용할것이기 때문에 이름은 최대한 짧게 작성했다.
    private static int fiboNum(int number)
    {
        if(number == 0) return 0;
        if(number == 1) return 1;
        if(fiboArr[number] != 0) return fiboArr[number]; // 이미 구한 피보나치 수이면 배열에서 조회해 반환한다.
        // 구한 n번째 피보나치수는 n번째 인덱스에 저장한다.
        fiboArr[number] = fiboNum(number-1) + fiboNum(number-2);
        return fiboArr[number];
    }

    // 랜덤하게 수를 가져오는 방법은 Random 클래스/ Math 클래스 2가지 방법이 있다.
    // Math 클래스를 사용해서 랜덤수를 가져온다.
    // n번째 피보나치수를 구할때 n값을 랜덤하게 반환한다.
    private static int getRandomNumber()
    {
        // 범위: 0 <= Math.random() < 1
        // 원하는 범위의 수를 곱해준다.
        // 0 <= n <= 45 이기때문에 아래와 같이 46을 곱한다.
        return (int)(Math.random() * 46);
    }
}
