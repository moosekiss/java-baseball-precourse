package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Computer {

    ArrayList<Integer> randomNumber = new ArrayList<>();
    Set<Integer> setNumber = new HashSet<>();

    // 랜덤 3자리 숫자 생성
    public void generatorNumber() {
        while(randomNumber.size() < 3) {
            int num = Randoms.pickNumberInRange(1, 9);
            if(!randomNumber.contains(num)) {
                randomNumber.add(num);
            }
        }
    }

    // 숫자 입력 메세지 함수
    public void numberMessage(){
        System.out.print("숫자를 입력해주세요 : ");
    }

    // 스트라이크, 볼 개수
    public boolean ballStrikeNumber(ArrayList<Integer> userNumber){
        int ballNumber = 0;
        int strikeNumber = 0;

        for(int i=0; i<3; i++) {
            if(userNumber.get(i).equals(randomNumber.get(i))) {
                strikeNumber++;
                continue;
            }
            if(setNumber.contains(userNumber.get(i))) {
                ballNumber++;
            }
        }

        return isBallStrike(ballNumber, strikeNumber);
    }

    //ball strike 출력 함수
    public boolean isBallStrike(int ballNumber, int strikeNumber) {
        if(strikeNumber == 3) {
            print3Strike();
            return true;
        } else if (strikeNumber == 0 && ballNumber == 0) {
            printNothing();
        } else {
            printBallStrike(ballNumber, strikeNumber);
        }

        return false;
    }

    // 스트라이크 출력
    public void print3Strike(){
        System.out.println("3스트라이크");
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    // 낫싱 출력
    public void printNothing() {
        System.out.println("낫싱");
    }

    public void printBallStrike(int ballNumber, int strikeNumber){
        if(ballNumber != 0 && strikeNumber == 0) {
            System.out.println(ballNumber + "볼");
        } else if(ballNumber == 0 && strikeNumber != 0) {
            System.out.println(strikeNumber + "스트라이크");
        } else {
            System.out.println(ballNumber + "볼 " + strikeNumber + "스트라이크");
        }
    }

}
