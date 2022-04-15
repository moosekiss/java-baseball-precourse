package baseball;

public class GamePlay {

    Computer computer;

    public void initSet() {
        computer = new Computer();
    }

    public void play() {
        initSet();

        computer.generatorNumber();

    }

}
