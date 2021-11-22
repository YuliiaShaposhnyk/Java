package pl.vistula.animals;

public class Pigeon extends Bird {
    @Override
    void eat() {
        System.out.println("Chleb");
    }

    @Override
    void getVoice() {
        System.out.println("Workocze");
    }

    void species(){
        System.out.println(
                "Silver pigeon" +
                "speckled pigeon" +
                "brown pigeon");
    }

    @Override
    void featherColor() {
        System.out.println(
                "Niebeski" +
                "Szary");
    }
}
