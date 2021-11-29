package pl.vistula.animals;

public abstract class Mamal extends Animal {
    Animal m = new Animal() {
        @Override
        void eat() {
            System.out.println("");
        }
    };
}
