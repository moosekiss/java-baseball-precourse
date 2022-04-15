package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Computer {

    ArrayList<Integer> randomNumber = new ArrayList<>();

    // random number generator
    public void generatorNumber() {
        while(randomNumber.size() < 3) {
            int num = Randoms.pickNumberInRange(1, 9);
            if(!randomNumber.contains(num)) {
                randomNumber.add(num);
            }

            System.out.println(randomNumber);
        }
    }

}
