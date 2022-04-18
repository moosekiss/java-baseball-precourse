package baseball;

import java.util.ArrayList;

public class GamePlay {

    Computer computer;
    User user;

    public void initSet() {
        computer = new Computer();
        user = new User();
    }

    // 게임 플레이 함수
    public void play() {
        initSet();

        computer.generatorNumber();

        while(true) {
            computer.numberMessage();
            ArrayList<Integer> userNumber = user.inputNumber();

            System.out.printf("userNumber: " + userNumber);
            break;
        }

    }

}
