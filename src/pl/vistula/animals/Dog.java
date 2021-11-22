package pl.vistula.animals;

public class Dog extends Mamal {

    @Override
    void eat() {
        System.out.println("Mięso");
    }

    @Override
    void getVoice() {
        System.out.println("Szczeka");
    }
}
