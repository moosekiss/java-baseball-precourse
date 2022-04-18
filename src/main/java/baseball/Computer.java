package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Computer {

    ArrayList<Integer> randomNumber = new ArrayList<>();

    // 랜덤 3자리 숫자 생성
    public void generatorNumber() {
        while(randomNumber.size() < 3) {
            int num = Randoms.pickNumberInRange(1, 9);
            if(!randomNumber.contains(num)) {
                randomNumber.add(num);
            }

            // System.out.println(randomNumber);
        }
    }

    // 숫자 입력 메세지 함수
    public void numberMessage(){
        System.out.print("숫자를 입력해주세요 : ");
    }

}
