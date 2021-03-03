package com.sun.common.CaseNumber;

/**
 * 문제풀이 후에 답을 테스트할때 사용한다.
 * 랜덤한 숫자를 뽑아서 반환한다.
 */
public class RandomNumber
{

    public static int getIntRandomNumber(int maxNum, int startNum)
    {
        if(maxNum == 0) maxNum = 100;
        // 랜덤하게 수를 가져오는 방법은 Random 클래스/ Math 클래스 2가지 방법이 있다.
        // Math 클래스를 사용해서 랜덤수를 가져온다.
        // 범위: 0 <= Math.random() < 1
        // 원하는 범위의 수를 곱해준다.
        int result = (int)(Math.random() * maxNum);

        System.out.println("random Number: " + result);
        return result;
    }

}
