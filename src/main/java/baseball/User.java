package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class User {

    // 숫자를 입력받는 함수
    public ArrayList<Integer> inputNumber() {
        String userNumberString = Console.readLine();
        isValidDigit(userNumberString);
        isValidLength(userNumberString);
        ArrayList<Integer> userNumber = inputStringNumber(userNumberString);
        return userNumber;
    }

    // 문자열 분리
    public ArrayList<Integer> inputStringNumber(String s) {
        ArrayList<Integer> userNumberList = new ArrayList<>();

        userNumberList.add(s.charAt(0) - '0'); // 첫번째 자리
        userNumberList.add(s.charAt(1) - '0'); // 두번째 자리
        userNumberList.add(s.charAt(2) - '0'); // 세번째 자리

        return userNumberList;
    }

    // 숫자판별 함수
    public void isValidDigit(String s) {
        for(char c : s.toCharArray()) {
            if(!Character.isDigit(c)) {
                throw new IllegalArgumentException("숫자 아님");
            }
        }
    }

    // 길이 판별 함수
    public void isValidLength(String s) {
        if(s.length() != 3) {
            throw new IllegalArgumentException("세자리 수보다 크거나 작음");
        }
    }


}
