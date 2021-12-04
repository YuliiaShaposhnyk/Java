package pl.vistula.czwiczenie_29_11_21;

public class ArithmeticException{
    public static void main(String[] args) {
        int puzzle[] = {5, 10, 16, 20, 18};
        int som[] = {0, 5, 6, 7, 9};
        for (int i = 0; i < puzzle.length; i++){
            try {
//                newPuzzle.Puzzle();
                System.out.println(puzzle[i] + " / " + som[i] + " rowna się " + puzzle[i]/som[i]);
            } catch (java.lang.ArithmeticException e){
                System.out.println("Nie dziel na zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Komunikat");
                System.out.println(e);
                System.out.println("Wystapił jakis błąd");
            } finally {
                System.out.println("Program wykonany");
            }
        }
    }
}
class newPuzzle{
    static void Puzzle (){
        int puzzle[] = new int[6];
        System.out.println("Przed pomylką");
        puzzle[18] = 8;
    }
}

