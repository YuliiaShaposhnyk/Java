package pl.vistula.animals;

public class Blowfish extends Fish {
    String rzad;

    @Override
    void eat() {
        System.out.println("Wodorost");
    }

    @Override
    void getVoice() {
        System.out.println("Nie podaje głosu");
    }

    void color(){
        System.out.println("Bronzowy");
    }

    @Override
    void Species() {
        System.out.println(
                "Szczupak" +
                "Karp");
    }
}
